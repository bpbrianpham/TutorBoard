//
//  Tutor+CoreDataProperties.swift
//  
//
//  Created by Agustin Barajas Jr. on 5/11/18.
//
//  This file was automatically generated and should not be edited.
//

import Foundation
import CoreData


extension Tutor {

    @nonobjc public class func fetchRequest() -> NSFetchRequest<Tutor> {
        return NSFetchRequest<Tutor>(entityName: "Tutor")
    }

    @NSManaged public var bio: String?
    @NSManaged public var email: String?
    @NSManaged public var firstname: String?
    @NSManaged public var image: Data?
    @NSManaged public var lastname: String?
    @NSManaged public var profilePic: String?
    @NSManaged public var role: String?
    @NSManaged public var subject: String?
    @NSManaged public var uniqueid: String?
    @NSManaged public var conversation: NSSet?

}

// MARK: Generated accessors for conversation
extension Tutor {

    @objc(addConversationObject:)
    @NSManaged public func addToConversation(_ value: Conversation)

    @objc(removeConversationObject:)
    @NSManaged public func removeFromConversation(_ value: Conversation)

    @objc(addConversation:)
    @NSManaged public func addToConversation(_ values: NSSet)

    @objc(removeConversation:)
    @NSManaged public func removeFromConversation(_ values: NSSet)

}
