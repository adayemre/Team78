@US_16_UI @US_16
Feature: Room manipulation by Admin

    Scenario: Admin can create new rooms for inpatients
      Given Go to medunna.com homepage
      Given User signs in as Admin
      And click on Items&Titiles dropdown
      And click on Room
      And click on Create a new Room button
      Then verify Create or edit a Room page is visable

    Scenario: When creating a room, there should be room number and all room types
      Given Enter Room Number
      Then Verify all Room Types are selectable.

    Scenario: Current status can be set for the room
      Given Click on Status checkbox
      Then Verify checkbox is clicked

    Scenario:  Price can be added and cannot be blank
      Given Send an empty value to the Price box
      And Enter a value to Description box
      And Verify This field is required message
      Then Enter a valid price to Price box

    Scenario:  Description can be provided optionally
      When Enter a value to Description box
      And Clear the value you entered
      Then Verify there is no required alert on this box

    Scenario: Created date as MM/DAY/YEAR and cannot be typed earlier
      Given Enter an invalid date to the Created Date Box
      And Click save button
      And Verify Created Date text is visable
      And Enter a  valid date to the Created Date Box
      Then Verify room is created

    Scenario: Admin can view all rooms with same items
      Given Click on View button on Rooms page
      And Verify Room Information is visable

    Scenario: Admin can edit existing rooms
      And click on Items&Titiles dropdown
      And click on Room
      Given Click on Edit button
      And Provide the necessary parts
      And Click save button
      Then Verify The room is updated message

    Scenario: Rooms can be Deleted by admin
      When Go to medunna.com homepage
      And click on Items&Titiles dropdown
      And click on Room
      Given click on delete button
      And click on delete in the opening alert
      Then verify Room is Deleted message

