//
//  Conversation+CoreDataProperties.swift
//  
//
//  Created by Agustin Barajas Jr. on 5/11/18.
//
//  This file was automatically generated and should not be edited.
//

import Foundation
import CoreData


extension Conversation {

    @nonobjc public class func fetchRequest() -> NSFetchRequest<Conversation> {
        return NSFetchRequest<Conversation>(entityName: "Conversation")
    }

    @NSManaged public var conversationID: String?
    @NSManaged public var message: NSOrderedSet?
    @NSManaged public var tutor: Tutor?

}

// MARK: Generated accessors for message
extension Conversation {

    @objc(insertObject:inMessageAtIndex:)
    @NSManaged public func insertIntoMessage(_ value: Message, at idx: Int)

    @objc(removeObjectFromMessageAtIndex:)
    @NSManaged public func removeFromMessage(at idx: Int)

    @objc(insertMessage:atIndexes:)
    @NSManaged public func insertIntoMessage(_ values: [Message], at indexes: NSIndexSet)

    @objc(removeMessageAtIndexes:)
    @NSManaged public func removeFromMessage(at indexes: NSIndexSet)

    @objc(replaceObjectInMessageAtIndex:withObject:)
    @NSManaged public func replaceMessage(at idx: Int, with value: Message)

    @objc(replaceMessageAtIndexes:withMessage:)
    @NSManaged public func replaceMessage(at indexes: NSIndexSet, with values: [Message])

    @objc(addMessageObject:)
    @NSManaged public func addToMessage(_ value: Message)

    @objc(removeMessageObject:)
    @NSManaged public func removeFromMessage(_ value: Message)

    @objc(addMessage:)
    @NSManaged public func addToMessage(_ values: NSOrderedSet)

    @objc(removeMessage:)
    @NSManaged public func removeFromMessage(_ values: NSOrderedSet)

}
