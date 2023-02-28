#language: en


  @message
  Feature: Send message for contact
    @message-sucess
      Scenario: Send an message sucess with sucess
      Given i stay in page to contact
      And inserts all information necessary
      When click to submmit
      And  accept popup
      Then receive feedback of sucess
