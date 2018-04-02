//
//  File.swift
//  TutorBoard
//
//  Created by Adrian on 3/24/18.
//  Copyright © 2018 Mei. All rights reserved.
//

import UIKit
import CoreData
import JSQMessagesViewController

// MARK: - Tutor(Account) Module

// Firebase Network Fetch -> userProfile -> CoreData
class CoreDataManager {
    //coredata context
    private let context = (UIApplication.shared.delegate as! AppDelegate).persistentContainer.viewContext
    //current user ID
    private let userID = FirebaseManager().userID()
    
    
    func SaveTutorObjectToCoreData(Tutors: [UserProfile]) {
        //managed context
        context.mergePolicy = NSMergePolicy.mergeByPropertyObjectTrump
        
        // initializing new Tutor Entity
        let tutor_entity = NSEntityDescription.entity(forEntityName: "Tutor", in: context)
        for element in Tutors {
            let tutor = NSManagedObject(entity: tutor_entity!, insertInto: context)
            //optional: save image to coredata here

            tutor.setValuesForKeys(element.UserProfileToDictionary())
        }
        try! context.save()
    }
    
    
    //default variable for NSFetchedResultsController for HomeVC
//    lazy var home_frc: NSFetchedResultsController<NSFetchRequestResult> = {
//        let fetchRequest = NSFetchRequest<NSFetchRequestResult>(entityName: "Tutor")
//        fetchRequest.sortDescriptors = [NSSortDescriptor(key: "firstname", ascending: false)]
//        let frc = NSFetchedResultsController(fetchRequest: fetchRequest, managedObjectContext: context, sectionNameKeyPath: nil, cacheName: nil)
//        frc.delegate = HomeViewController()
//        return frc
//    }()
    
    func fetchForHomeViewController() -> [Tutor] {
        let request = NSFetchRequest<NSFetchRequestResult>(entityName: "Tutor")
        request.returnsObjectsAsFaults = false
        
        let result = try! context.fetch(request) as! [Tutor]
        return result
    }
    
    //download data from firebase first, save it to coredata, then fetch from coredata for display
    func fetchSingleUser(userid: String, completion: @escaping (Bool)->()) -> Tutor {
        let request = NSFetchRequest<NSFetchRequestResult>(entityName: "Tutor")
        request.predicate = NSPredicate(format: "uniqueid = %@", userid)
        request.fetchLimit = 1
        request.returnsObjectsAsFaults = false

        let result = try! context.fetch(request) as! [Tutor]
        
        completion(true)
        return result[0]
    }
    
    func UpdateSingleUser(thisTutor: UserProfile) {
        let request = NSFetchRequest<NSFetchRequestResult>(entityName: "Tutor")
        request.predicate = NSPredicate(format: "uniqueid = %@", thisTutor.uniqueid!)
        request.fetchLimit = 1
        request.returnsObjectsAsFaults = false
        
        //fetch the object
        let result = try! context.fetch(request) as! [NSManagedObject]
        
        result[0].setValuesForKeys(thisTutor.UserProfileToDictionary())
        try! context.save()
    }
    
    //TODO
    //save image to coredata
//    func saveImage(image: UIImage, ) {
//        var newImageData = UIImageJPEGRepresentation(image!, 1)
//
//    }

    
}



// MARK: - Conversation Module
extension CoreDataManager {
    
    //save conversation
    func setupConversation(conversationID: String, userid: String) {
        //managed context
        context.mergePolicy = NSMergePolicy.mergeByPropertyObjectTrump
        
        // initializing Conversation Entity
        let conversation_entity = NSEntityDescription.entity(forEntityName: "Conversation", in: context)
        let new_conversation = NSManagedObject(entity: conversation_entity!, insertInto: context)
        new_conversation.setValue(conversationID, forKey: "conversationID")
        
        //link conversation to tutor (one to many relationship)
        let tutor = fetchSingleUser(userid: userid, completion: {_ in })
        tutor.addToConversation(new_conversation as! Conversation)
        
        try! context.save()
    }
    
    //fetch one conversation
    func fetchSingleConversation(conversationID: String) -> Conversation{
        let request = NSFetchRequest<NSFetchRequestResult>(entityName: "Conversation")
        request.predicate = NSPredicate(format: "conversationID = %@", conversationID)
        request.fetchLimit = 1
        request.returnsObjectsAsFaults = false
        let result = try! context.fetch(request) as! [Conversation]
        return result[0]
    }
    
}

// MARK: - Message Module
extension CoreDataManager {

    //save a message
    func saveMessage(messageData: NSDictionary, conversationID: String) {
        //managed context
        context.mergePolicy = NSMergePolicy.mergeByPropertyObjectTrump
    
        //Save to coredate
        // initializing Conversation Entity
        let message_entity = NSEntityDescription.entity(forEntityName: "Message", in: context)
        let new_message = NSManagedObject(entity: message_entity!, insertInto: context)
        //new_message.setValue(messageData, forKey: "uniqueid")
        new_message.setValuesForKeys(messageData as! [String : Any])

        //link conversation to tutor (one to many relationship)
        let conversation = fetchSingleConversation(conversationID: conversationID)
        conversation.addToMessage(new_message as! Message)
        
        try! context.save()
    }
        
    
}






