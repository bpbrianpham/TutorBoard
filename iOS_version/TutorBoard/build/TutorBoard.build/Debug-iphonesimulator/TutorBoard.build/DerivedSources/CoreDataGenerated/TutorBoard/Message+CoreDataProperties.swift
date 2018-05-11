//
//  Message+CoreDataProperties.swift
//  
//
//  Created by Agustin Barajas Jr. on 5/11/18.
//
//  This file was automatically generated and should not be edited.
//

import Foundation
import CoreData


extension Message {

    @nonobjc public class func fetchRequest() -> NSFetchRequest<Message> {
        return NSFetchRequest<Message>(entityName: "Message")
    }

    @NSManaged public var date: Double
    @NSManaged public var isMediaMessage: Bool
    @NSManaged public var senderDisplayName: String?
    @NSManaged public var senderId: String?
    @NSManaged public var text: String?
    @NSManaged public var uniqueid: String?
    @NSManaged public var conversation: Conversation?

}
