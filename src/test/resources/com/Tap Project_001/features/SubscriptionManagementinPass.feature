
@feature_subscription_management
Feature: SubscriptionManagementinPass

  Background: 
    Given the user is logged into the application
    And the user is on the Subscription Management screen

  @view_subscription_plans
  Scenario Outline: Validate Viewing Subscription Plans
    When I navigate to the Subscription Management screen
    Then the Subscription Management screen is displayed
    And both Weekly and Monthly subscription plans are visible
    And each plan has a functional Buy button
    When I click on the Buy button for the Weekly plan
    Then the system redirects to the Payment Method screen
    And the correct plan details are shown
    And promotional messages are displayed if applicable
    Then the UI is responsive and meets accessibility standards
    And no errors are present in the UI

  Examples:
    | username | password |
    | user1    | pass1    |

@subscription_management_buy
Scenario Outline: Validate clicking the "Buy" button redirects to Payment Method screen
  When the user clicks on the "Buy" button for the Monthly plan
  Then the user should be redirected to the Payment Method screen
  And the Payment Method screen should be displayed
  And saved card(s) should be listed
  And the "Done" button should be visible
  And UI elements should be accessible
  And no error messages should be shown

  Examples:
    |   |
    |   |

@validate_payment_with_saved_card
Scenario Outline: Validate that a passenger can proceed with payment using a saved card
  Given the user selects a saved card for payment
  When the user clicks the "Done" button
  Then the confirmation popup appears
  And the popup displays correct payment details
  And the message about not navigating back is visible
  And the payment process initiates successfully
  And the UI remains responsive throughout

Examples:
  | <saved_card> |
  | Card 1       |

@validate_confirmation_popup
Scenario Outline: Validate the Confirmation Popup After Clicking Done
  When the user selects a saved card
  And the user clicks the Done button
  Then the confirmation popup appears
  And the options Yes and No are visible
  And the message prompts the user for confirmation
  And the popup prevents interaction with the background
  And the UI is accessible and usable

Examples:
  | <saved_card> |
  | Card 1      |
  | Card 2      |

@cancel_purchase
Scenario Outline: Validate Cancel Purchase Action
  When the user selects a saved card
  And the user clicks the "Done" button
  And the user selects "No" in the confirmation popup
  Then the system cancels the purchase
  And the user is redirected back to the Subscription Management screen
  And no purchase is processed
  And the UI remains responsive

  Examples:
    | saved_card |
    | Card123    |

@validate_payment_process
Scenario Outline: Validate selecting Yes in confirmation popup starts payment process
  When the user selects a saved card
  And the user clicks the Done button
  And the user selects Yes in the confirmation popup
  Then the user should observe the system response
  And the message indicating not to navigate back should be visible
  And the payment process should start
  Then the UI should remain responsive

  Examples:
    | saved_card   |
    | CardEnding123 |

@validate_warning_message
Scenario Outline: Validate that a warning is displayed if the user tries to navigate back during the payment process
  When the user selects a saved card
  And the user clicks the "Done" button
  And the user selects "Yes" in the confirmation popup
  And the user attempts to navigate back to the Subscription Management screen
  Then the warning message should be displayed
  And the payment process should not be interrupted
  And the UI should be responsive

  Examples:
    | <saved_card> |
    | Sample Card  |

@successful_payment
Scenario Outline: Validate Successful Payment Activation
  When the user selects a saved card
  And the user clicks the "Done" button
  And the user selects "Yes" in the confirmation popup
  And the user completes the payment process
  Then the user should observe a "Congratulations" message
  And the message should confirm activation of the subscription
  And the UI should remain responsive
  And no errors should be present

  Examples:
    | <saved_card> |
    | Card 1       |

@validate_active_plan
Scenario Outline: Validate Active Plan Display in Subscription Management
  When the user navigates to the Subscription Management screen
  And the user observes the Active Plan section
  Then the activated plan should be displayed
  And other Buy buttons should be disabled
  And the UI should be responsive
  And the plan details should be correct
  And there should be no error messages shown

Examples:
  |  |
  |  |

  @feature_subscription_management
  @validate_free_rides
  Scenario Outline: Validate that a passenger receives two free rides per day with an active subscription
    Given the user completes the payment process successfully
    When the user navigates to the ride booking screen
    And the user attempts to book a ride
    Then the user should verify that two free rides are available
    When the user books one ride using the free ride option
    Then the user should check the remaining free rides
    When the user attempts to book another ride
    Then the user should validate that the UI is responsive

  Examples:
    |   |
    |   |

@validate_cancelled_free_ride
Scenario Outline: Validate cancelled free rides remain available for same day
  When the user navigates to the ride booking screen
  And the user books two rides using the free ride option
  And the user cancels one of the booked rides
  Then the availability of free rides should remain unchanged
  When the user attempts to book another ride
  Then the cancelled ride should still be available for booking
  And the UI should remain responsive

  Examples:
    | <username> |
    |            |

@validate_email_receipt
Scenario Outline: Validate that a passenger receives an email receipt after a successful purchase of a subscription
  When the user checks the email inbox associated with the account
  And the user looks for an email receipt from the application
  And the user opens the email receipt
  Then the receipt should contain correct subscription details
  And the email should be formatted correctly and readable
  And the email should include promotional messages if applicable
  And the UI should remain responsive

  Examples:
    | email_inbox          |
    | user@example.com     |

@validate_accessibility
Scenario Outline: Validate Accessibility of Subscription Management Screen
  When the user uses a screen reader to read the page content
  Then the screen reader should read the content correctly
  When the user verifies that all UI elements are labeled correctly
  Then all UI elements should be labeled appropriately
  When the user checks keyboard navigation through the screen
  Then keyboard navigation should be smooth and functional
  When the user ensures that all buttons and links are reachable via keyboard
  Then all buttons and links should be accessible via keyboard
  When the user validates that tooltips are available for all interactive elements
  Then tooltips should be available for interactive elements
  When the user confirms that the page structure is logical and easy to follow
  Then the page structure should be logical and easy to navigate
  When the user validates that the UI is responsive
  Then the UI should remain responsive

Examples:
  |  |

@mobile-responsive-test
Scenario Outline: Validate Subscription Management Screen Responsiveness
  When I navigate to the Subscription Management screen
  Then the Subscription Management screen is displayed correctly
  And all subscription plans are visible and formatted properly
  And the Buy buttons are functional
  And the layout adapts to the mobile screen size
  And text is readable without zooming
  And all interactive elements are easily tappable
  Then the UI remains responsive

  Examples:
    |       |
    |       |

  @invalid_payment_method
  Scenario Outline: Validate Error Message for Invalid Payment Method
    When the user selects an "<payment_method>"
    And the user clicks the "Done" button
    Then the user should observe the system response
    And the user should verify the error message displayed
    And the user should check that the user remains on the Payment Method screen
    And the user should confirm that the UI is responsive
    And the user should validate that the error message is clear and actionable

    Examples:
      | payment_method               |
      | invalid or expired saved card |

@network_failure_error
Scenario Outline: Validate Error Message on Network Failure during Payment
  When the user selects a valid saved card
  And the user clicks the "Done" button
  And a network failure is simulated during the payment process
  Then the user should see an error message indicating the network issue
  And the user should remain on the Payment Method screen
  And the UI should remain responsive

Examples:
  | <saved_card> |
  | valid_card   |

  @feature_subscription_management
  @server-error-handling
  Scenario Outline: Validate Error Message on Server Error During Payment
    Given the user selects a valid saved card
    When the user clicks the "Done" button
    And the system simulates a server error during the payment process
    Then an error message should be displayed indicating the server issue
    And the user should remain on the Payment Method screen
    And the UI should remain responsive

  Examples:
    |  |

@invalid_card_details
Scenario Outline: Validate error message for invalid card details
  When the user selects a saved card
  And edits the card details to "<card_number>", "<expiration_date>", "<CVV>", "<cardholder_name>"
  And clicks the "Done" button
  Then an error message should be displayed indicating the invalid card details
  And the user should remain on the Payment Method screen
  And the UI should be responsive

  Examples:
    | card_number         | expiration_date | CVV | cardholder_name |
    | 1234 5678 9012 3456 | 12/20           | 123 | John Doe       |

@expired-card-error
Scenario Outline: Validate error message for expired card selection
  When the user selects an expired saved card
  And the user clicks the "Done" button
  Then the system should display an error message indicating the card is expired
  And the user should remain on the Payment Method screen
  And the UI should remain responsive
  And the error message should be clear and actionable

Examples:
  | <expired_card> |
  | Expired Card 1 |

@attempt_purchase_active_subscription
Scenario Outline: Validate Error Message for Active Subscription Purchase
  Given the user has completed the payment process for a subscription
  And the user is on the Subscription Management screen
  When the user clicks the "Buy" button for the same subscription plan
  Then an error message should be displayed indicating the subscription is already active
  And the user should remain on the Subscription Management screen
  And the UI should remain responsive
  And the error message should be clear and actionable

Examples:
  | No input data required |

  @invalid_email_format
  Scenario Outline: Validate error message for invalid email format
    When I change the email to "<email>"
    And I save the changes
    Then the system should display an error message indicating the email format is invalid
    And the user should remain on the profile settings screen
    And the UI should be responsive

    Examples:
      | email  |
      | abc@   |

@error_message_display
Scenario Outline: Validate error message for unselected card
  Given no card is selected
  When the user clicks the "Done" button
  Then an error message should be displayed indicating a card must be selected
  And the user should remain on the Payment Method screen
  And the UI should remain responsive
  And the error message should be clear and actionable

  Examples:
    | Card Status |
    | None        |

  @feature_subscription_management
  @concurrent_purchase_attempt
  Scenario Outline: Validate multiple concurrent purchase attempts
    When I complete the payment process successfully for a subscription
    And I open a second instance of the application
    And I attempt to purchase the same subscription in the second instance
    Then I observe the system response
    And I verify the error message displayed in the second instance
    And I check that the user remains on the Subscription Management screen in the first instance
    And I validate that the UI is responsive in both instances
    And I confirm that the error message is clear and actionable in the second instance

    Examples:
      |  |
      |  |

  @feature_subscription_management
  @session_timeout_error
  Scenario Outline: Validate Session Timeout During Payment Process
    Given the user selects a valid saved card
    When the user clicks the "Done" button
    And the system simulates a session timeout during the payment process
    Then an error message should be displayed indicating the session has expired
    And the user should be redirected to the login screen
    And the UI should remain responsive

  Examples:
    | saved_card       |
    | valid_saved_card |

@invalid-subscription
Scenario Outline: Validate that an appropriate error message is displayed for invalid subscription plans
  When I attempt to select an invalid subscription plan
  And I click the "Buy" button
  Then the system should respond with an error message indicating the plan is invalid
  And the user should remain on the Subscription Management screen
  And the UI should be responsive
  And the error message should be clear and actionable

Examples:
  | invalid_subscription_plan |
  | Non-existent Plan         |

@invalid_payment_method
Scenario Outline: Validate Error Message for Invalid Payment Method
  When the user selects an "<payment_method>"
  And the user clicks the "Done" button
  Then the system processes the payment attempt
  And the user observes the system response
  Then the error message is displayed
  And the error message indicates the issue with the payment method
  Then the user remains on the Payment Method screen
  And the UI remains responsive
  Then the error message is clear and actionable

  Examples:
    | payment_method                |
    | invalid or expired saved card  |

@network_failure_error
Scenario Outline: Validate Network Failure During Payment Process
  When the user selects a valid saved card
  And the user clicks the "Done" button
  And a network failure is simulated during the payment process
  Then an error message should be displayed indicating the network issue
  And the user should remain on the Payment Method screen
  And the UI should remain responsive

Examples:
  | <valid_saved_card> |
  | Valid Card 1       |

@server-error-handling
Scenario Outline: Validate error message during server error in payment process
  When the user selects a valid saved card
  And the user clicks the "Done" button
  And a server error is simulated during the payment process
  Then an error message should be displayed indicating the server issue
  And the user should remain on the Payment Method screen
  And the UI should remain responsive

Examples:
  | <valid_saved_card> |
  | Valid Card 1       |

@invalid_card_details
Scenario Outline: Validate Error Message for Invalid Card Details
  Given the user selects a saved card
  When the user edits the card details to invalid values
  And the user clicks the Done button
  Then an error message should be displayed indicating the invalid card details
  And the user should remain on the Payment Method screen
  And the UI should be responsive

  Examples:
    | card_number      | expiration_date | CVV | cardholder_name |
    | 1234 5678 9012 3456 | 12/20         | 123 | John Doe       |

@expired-card-selection
Scenario Outline: Validate error message for expired card selection
  When the user selects an expired saved card
  And the user clicks the "Done" button
  Then an error message should be displayed indicating the card is expired
  And the user should remain on the Payment Method screen
  And the UI should be responsive
  And the error message should be clear and actionable

Examples:
  | <expired_card> |
  | expired_card_1 |

@active_subscription_purchase
Scenario Outline: Validate error message for active subscription purchase
  When the user clicks the "Buy" button for the same subscription plan
  Then an error message is displayed indicating the subscription is already active
  And the user remains on the Subscription Management screen
  And the UI remains responsive
  And the error message is clear and actionable

Examples:
  | subscription_plan |
  | same_subscription  |

  @invalid_email_format
  Scenario Outline: Validate Error Message for Invalid Email Format
    When the user changes the email to "<email>"
    And the user saves the changes
    Then the user should observe the system response
    And the user should see an error message indicating the email format is invalid
    And the user should remain on the profile settings screen
    And the UI should remain responsive

    Examples:
      | email  |
      | abc@   |

  @error-message-no-card-selected
  Scenario Outline: Validate Error Message When No Card is Selected
    Given no card is selected
    When the user clicks the "Done" button
    Then an error message is displayed indicating a card must be selected
    And the user remains on the Payment Method screen
    And the UI remains responsive
    And the error message is clear and actionable

    Examples:
      |   |
      |   |

  @feature_subscription_management
  @concurrent_purchase_attempt
  Scenario Outline: Validate Concurrent Purchase Attempts
    When the user opens a second instance of the application
    And the user attempts to purchase the same subscription in the second instance
    Then the system response should be observed
    And an error message should be displayed in the second instance indicating the subscription is already active
    And the user should remain on the Subscription Management screen in the first instance
    And the UI should be responsive in both instances
    And the error message should be clear and actionable in the second instance
    And no errors should be present
    And the UI should be accessible

    Examples:
      | no input data required |

@session-timeout-error
Scenario Outline: Validate Error Message on Session Timeout During Payment
  When the user selects a valid saved card
  And the user clicks the Done button
  And the user simulates a session timeout during the payment process
  Then an error message should be displayed indicating the session has expired
  And the user should be redirected to the login screen
  And the UI should remain responsive

Examples:
  | <saved_card> |
  | valid_card   |

  @invalid-subscription-plan
  Scenario Outline: Validate Error Message for Invalid Subscription Plan
    When the user attempts to select an invalid subscription plan
    And the user clicks the "Buy" button
    Then an error message should be displayed indicating the plan is invalid
    And the user remains on the Subscription Management screen
    And the UI remains responsive
    And the error message is clear and actionable

  Examples:
    | invalid_plan      |
    | NonExistentPlan   |

@error_message_subscription_plan
Scenario Outline: Validate Appropriate Error Message Without Subscription Plan
  Given no subscription plan is selected
  When the user clicks the "Buy" button
  Then an error message is displayed indicating a subscription must be selected
  And the user remains on the Subscription Management screen
  And the UI remains responsive
  And the error message is clear and actionable

Examples:
  | subscription_plan |
  | none              |

@invalid-payment-amount
Scenario Outline: Validate Error Message for Invalid Payment Amount
  When the user selects a valid saved card
  And the user edits the payment amount to "<payment_amount>"
  And the user clicks the "Done" button
  Then an error message should be displayed indicating the payment amount is invalid
  And the user should remain on the Payment Method screen
  And the UI should remain responsive

  Examples:
    | payment_amount |
    | abc            |

@invalid_payment_method
Scenario Outline: Validate Error Message for Deleted Payment Method
  When the user selects a payment method that has been deleted or is no longer available
  And the user clicks the "Done" button
  Then the system should process the payment attempt
  And an error message should be displayed indicating the payment method is not found
  And the user should remain on the Payment Method screen
  And the UI should remain responsive
  And the error message should be clear and actionable

  Examples:
    | payment_method   |
    | Deleted Method   |

@timeout-error
Scenario Outline: Validate Error Message for Payment Method Timeout
  When the user selects a valid saved card
  And the user simulates a timeout during payment processing
  And the user clicks the "Done" button
  Then the user should observe the system response
  And the user should see an error message indicating the payment method timed out
  And the user should remain on the Payment Method screen
  And the UI should remain responsive

Examples:
  | action    |
  | simulate  |

@payment-method-authorization-error
Scenario Outline: Validate that an appropriate error message is displayed if the payment method is not authorized
  Given the user selects a valid saved card
  When the system simulates an authorization failure during payment processing
  And the user clicks the "Done" button
  Then the user should observe an error message displayed indicating the payment method is not authorized
  And the user should remain on the Payment Method screen
  And the user should check that the UI is responsive

  Examples:
    | <valid_saved_card> |
    | valid_card_1       |

@payment-method-decline
Scenario Outline: Validate Payment Method Declined Error Message
  Given the user selects a valid saved card
  When the user simulates a decline during payment processing
  And the user clicks the "Done" button
  Then an error message should be displayed indicating the payment method was declined
  And the user remains on the Payment Method screen
  And the UI is responsive

Examples:
  | <valid_saved_card> |
  | Card 1            |

@unsupported_payment_method
Scenario Outline: Validate Unsupported Payment Method Error Message
  When the user selects a payment method that is not supported
  And the user clicks the "Done" button
  Then an error message should be displayed indicating the payment method is not supported
  And the user should remain on the Payment Method screen
  And the UI should be responsive
  And the error message should be clear and actionable

Examples:
  | unsupported_payment_method     |
  | Credit Card not accepted       |

@unavailable_payment_method
Scenario Outline: Validate that an appropriate error message is displayed if the selected payment method is not available
  When the user selects <payment_method>
  And the user clicks the "Done" button
  Then the user should observe the system response
  And the user should verify the error message displayed
  And the user should check that the user remains on the Payment Method screen
  And the user should validate that the UI is responsive
  And the user should confirm that the error message is clear and actionable

  Examples:
    | payment_method     |
    | Credit Card        |
    | PayPal             |

@unconfigured_payment_method
Scenario Outline: Validate Error Message for Unconfigured Payment Method
  When the user selects a payment method that is not configured
  And the user clicks the "Done" button
  Then an error message is displayed indicating the payment method is not configured
  And the user remains on the Payment Method screen
  And the UI remains responsive
  And the error message is clear and actionable

  Examples:
    | paymentMethod |
    | Unconfigured  |

@unrecognized_payment_method
Scenario Outline: Validate Error Message for Unrecognized Payment Method
  When the user selects a payment method that is not recognized
  And the user clicks the "Done" button
  Then an error message should be displayed indicating the payment method is not recognized
  And the user should remain on the Payment Method screen
  And the UI should remain responsive
  And the error message should be clear and actionable

Examples:
  | payment_method |
  | Unknown Card   |

@invalid-payment-method
Scenario Outline: Validate error message for invalid payment method
  When the user selects "<payment_method>"
  And the user clicks the "Done" button
  Then the user should observe an error message displayed
  And the user should remain on the Payment Method screen
  And the UI should be responsive
  And the error message should be clear and actionable

  Examples:
    | payment_method        |
    | invalid payment method |

@unsupported-payment-method
Scenario Outline: Validate Unsupported Payment Method Error
  When the user selects <payment_method> as a payment method that is not supported by the bank
  And the user clicks the "Done" button
  Then the system processes the payment attempt
  And an error message is displayed indicating the payment method is not supported by the bank
  And the user remains on the Payment Method screen
  And the UI remains responsive
  And the error message is clear and actionable

  Examples:
    | payment_method   |
    | Amex             |
    | Discover         |

@validate_error_message
Scenario Outline: Validate Error Message for Unavailable Payment Method
  When the user selects a payment method that is not available for the transaction
  And the user clicks the "Done" button
  Then the system should process the payment attempt
  And the user should see an error message indicating the payment method is not available for the transaction
  And the user should remain on the Payment Method screen
  And the UI should remain responsive
  And the error message should be clear and actionable

Examples:
  | payment_method              |
  | Unavailable Payment Method  |

@unconfigured_payment_method
Scenario Outline: Validate Error Message for Unconfigured Payment Method
  When the user selects a payment method that is not configured for the transaction
  And the user clicks the "Done" button
  Then the system should process the payment attempt
  And an error message should be displayed indicating the payment method is not configured for the transaction
  And the user should remain on the Payment Method screen
  And the UI should remain responsive
  And the error message should be clear and actionable

  Examples:
    | paymentMethod |
    | Credit Card   |

  @max_saved_cards_performance
  Scenario Outline: Validate Maximum Number of Saved Cards
    When I add the maximum number of saved cards allowed
    Then all cards should be displayed correctly
    When I click the "Done" button with one of the cards selected
    Then the system processes the payment without issues
    And no performance degradation is observed
    And the UI remains responsive
    And no error messages are present

  Examples:
    |  |
    |  |

@minimum-required-card-details
Scenario Outline: Validate Minimum Required Card Details
  When I enter the minimum required card details
    | card number           | expiration date | cvv | cardholder name |
    | <card_number>        | <expiration>    | <cvv> | <cardholder>    |
  And I click the "Done" button
  Then the payment should be processed successfully
  And no error messages should be displayed
  And the UI should remain responsive
  And the payment details should be correct

  Examples:
    | card_number          | expiration | cvv | cardholder  |
    | 4111111111111111     | 12/25      | 123 | John Doe    |

@max-payment-validation
Scenario Outline: Validate maximum payment amount processing
  When the user selects a valid saved card
  And the user enters "<payment_amount>"
  And the user clicks the "Done" button
  Then the system processes the payment successfully
  And no error messages are displayed
  And the UI remains responsive

  Examples:
    | payment_amount |
    | 999999.99      |

@validate_minimum_payment
Scenario Outline: Validate that the system can handle the minimum payment amount without errors
  When the user selects a valid saved card
  And the user enters "<minimum_payment_amount>"
  And the user clicks the "Done" button
  Then the system processes the payment successfully
  And no error messages are displayed
  And the UI remains responsive

  Examples:
    | minimum_payment_amount |
    | 10                     |
