package com.default_project.stepdefinitions;

import com.default_project.utils.ElementUtils;
import org.junit.Assert;
import com.default_project.driverfactory.DriverFactory;
import com.default_project.pages.SubscriptionManagementinPassPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SubscriptionManagementinPass extends DriverFactory {
SubscriptionManagementinPassPage subscriptionManagementinPassPage = new SubscriptionManagementinPassPage(driver);
@Given("the user is logged into the application")
public void the_user_is_logged_into_the_application() {
subscriptionManagementinPassPage.loginUser();
}
@Given("the user is on the Subscription Management screen")
public void the_user_is_on_the_subscription_management_screen() {
subscriptionManagementinPassPage.navigateToSubscriptionManagement();
}
@When("I navigate to the Subscription Management screen")
public void i_navigate_to_the_subscription_management_screen() {
subscriptionManagementinPassPage.navigateToSubscriptionManagement();
}
@Then("the Subscription Management screen is displayed")
public void the_subscription_management_screen_is_displayed() {
subscriptionManagementinPassPage.isSubscriptionManagementScreenDisplayed();
}
@And("both Weekly and Monthly subscription plans are visible")
public void both_weekly_and_monthly_subscription_plans_are_visible() {
subscriptionManagementinPassPage.areSubscriptionPlansVisible();
}
@And("each plan has a functional Buy button")
public void each_plan_has_a_functional_buy_button() {
subscriptionManagementinPassPage.areBuyButtonsFunctional();
}
@When("I click on the Buy button for the Weekly plan")
public void i_click_on_the_buy_button_for_the_weekly_plan() {
subscriptionManagementinPassPage.clickBuyButtonForWeeklyPlan();
}
@Then("the system redirects to the Payment Method screen")
public void the_system_redirects_to_the_payment_method_screen() {
subscriptionManagementinPassPage.isOnPaymentMethodScreen();
}
@And("the correct plan details are shown")
public void the_correct_plan_details_are_shown() {
subscriptionManagementinPassPage.areCorrectPlanDetailsDisplayed();
}
@And("promotional messages are displayed if applicable")
public void promotional_messages_are_displayed_if_applicable() {
subscriptionManagementinPassPage.arePromotionalMessagesDisplayed();
}
@Then("the UI is responsive and meets accessibility standards")
public void the_ui_is_responsive_and_meets_accessibility_standards() {
subscriptionManagementinPassPage.isUIResponsive();
subscriptionManagementinPassPage.meetsAccessibilityStandards();
}
@And("no errors are present in the UI")
public void no_errors_are_present_in_the_ui() {
subscriptionManagementinPassPage.areErrorsPresent();
}
@When("the user clicks on the Buy button for the Monthly plan")
public void the_user_clicks_on_the_buy_button_for_the_monthly_plan() {
subscriptionManagementinPassPage.clickBuyButtonForMonthlyPlan();
}
@Then("the user should be redirected to the Payment Method screen")
public void the_user_should_be_redirected_to_the_payment_method_screen() {
subscriptionManagementinPassPage.isOnPaymentMethodScreen();
}
@And("the Payment Method screen should be displayed")
public void the_payment_method_screen_should_be_displayed() {
subscriptionManagementinPassPage.isPaymentMethodScreenDisplayed();
}
@And("saved card(s) should be listed")
public void saved_card_s_should_be_listed() {
subscriptionManagementinPassPage.areSavedCardsListed();
}
@And("the Done button should be visible")
public void the_done_button_should_be_visible() {
subscriptionManagementinPassPage.isDoneButtonVisible();
}
@And("UI elements should be accessible")
public void ui_elements_should_be_accessible() {
subscriptionManagementinPassPage.areUIElementsAccessible();
}
@And("no error messages should be shown")
public void no_error_messages_should_be_shown() {
subscriptionManagementinPassPage.areErrorMessagesDisplayed();
}
@Given("the user selects a saved card for payment")
public void the_user_selects_a_saved_card_for_payment() {
subscriptionManagementinPassPage.selectSavedCardForPayment();
}
@When("the user clicks the Done button")
public void the_user_clicks_the_done_button() {
subscriptionManagementinPassPage.clickDoneButton();
}
@Then("the confirmation popup appears")
public void the_confirmation_popup_appears() {
subscriptionManagementinPassPage.isConfirmationPopupDisplayed();
}
@And("the popup displays correct payment details")
public void the_popup_displays_correct_payment_details() {
subscriptionManagementinPassPage.isPaymentDetailsCorrectInPopup();
}
@And("the message about not navigating back is visible")
public void the_message_about_not_navigating_back_is_visible() {
subscriptionManagementinPassPage.isNavigationWarningVisible();
}
@And("the payment process initiates successfully")
public void the_payment_process_initiates_successfully() {
subscriptionManagementinPassPage.isPaymentProcessInitiated();
}
@And("the UI remains responsive throughout")
public void the_ui_remains_responsive_throughout() {
subscriptionManagementinPassPage.isUIResponsive();
}
@When("the user selects a saved card")
public void the_user_selects_a_saved_card() {
subscriptionManagementinPassPage.selectSavedCard();
}
@And("the user selects No in the confirmation popup")
public void the_user_selects_no_in_the_confirmation_popup() {
subscriptionManagementinPassPage.selectNoInConfirmationPopup();
}
@Then("the system cancels the purchase")
public void the_system_cancels_the_purchase() {
subscriptionManagementinPassPage.isPurchaseCancelled();
}
@And("the user is redirected back to the Subscription Management screen")
public void the_user_is_redirected_back_to_the_subscription_management_screen() {
subscriptionManagementinPassPage.isOnSubscriptionManagementScreen();
}
@And("no purchase is processed")
public void no_purchase_is_processed() {
subscriptionManagementinPassPage.isPurchaseProcessed();
}
@When("the user selects Yes in the confirmation popup")
public void the_user_selects_yes_in_the_confirmation_popup() {
subscriptionManagementinPassPage.selectYesInConfirmationPopup();
}
@Then("the user should observe the system response")
public void the_user_should_observe_the_system_response() {
subscriptionManagementinPassPage.isSystemResponseObserved();
}
@And("the message indicating not to navigate back should be visible")
public void the_message_indicating_not_to_navigate_back_should_be_visible() {
subscriptionManagementinPassPage.isNavigationWarningVisible();
}
@And("the payment process should start")
public void the_payment_process_should_start() {
subscriptionManagementinPassPage.isPaymentProcessStarted();
}
@Then("the user should observe a Congratulations message")
public void the_user_should_observe_a_congratulations_message() {
subscriptionManagementinPassPage.isCongratulationsMessageDisplayed();
}
@And("the message should confirm activation of the subscription")
public void the_message_should_confirm_activation_of_the_subscription() {
subscriptionManagementinPassPage.isActivationConfirmationMessageDisplayed();
}
@And("the activated plan should be displayed")
public void the_activated_plan_should_be_displayed() {
subscriptionManagementinPassPage.isActivatedPlanDisplayed();
}
@And("other Buy buttons should be disabled")
public void other_buy_buttons_should_be_disabled() {
subscriptionManagementinPassPage.areOtherBuyButtonsDisabled();
}
@And("the plan details should be correct")
public void the_plan_details_should_be_correct() {
subscriptionManagementinPassPage.arePlanDetailsCorrect();
}
@When("the user navigates to the ride booking screen")
public void the_user_navigates_to_the_ride_booking_screen() {
subscriptionManagementinPassPage.navigateToRideBookingScreen();
}
@Then("the user should verify that two free rides are available")
public void the_user_should_verify_that_two_free_rides_are_available() {
subscriptionManagementinPassPage.areTwoFreeRidesAvailable();
}
@When("the user books one ride using the free ride option")
public void the_user_books_one_ride_using_the_free_ride_option() {
subscriptionManagementinPassPage.bookFreeRide();
}
@Then("the user should check the remaining free rides")
public void the_user_should_check_the_remaining_free_rides() {
subscriptionManagementinPassPage.checkRemainingFreeRides();
}
@When("the user attempts to book another ride")
public void the_user_attempts_to_book_another_ride() {
subscriptionManagementinPassPage.attemptToBookAnotherRide();
}
@Then("the cancelled ride should still be available for booking")
public void the_cancelled_ride_should_still_be_available_for_booking() {
subscriptionManagementinPassPage.isCancelledRideAvailable();
}
@Then("the receipt should contain correct subscription details")
public void the_receipt_should_contain_correct_subscription_details() {
subscriptionManagementinPassPage.isReceiptDetailsCorrect();
}
@And("the email should be formatted correctly and readable")
public void the_email_should_be_formatted_correctly_and_readable() {
subscriptionManagementinPassPage.isEmailFormattedCorrectly();
}
@And("the email should include promotional messages if applicable")
public void the_email_should_include_promotional_messages_if_applicable() {
subscriptionManagementinPassPage.arePromotionalMessagesIncludedInEmail();
}
@When("the user uses a screen reader to read the page content")
public void the_user_uses_a_screen_reader_to_read_the_page_content() {
subscriptionManagementinPassPage.useScreenReader();
}
@Then("the screen reader should read the content correctly")
public void the_screen_reader_should_read_the_content_correctly() {
subscriptionManagementinPassPage.isContentReadCorrectlyByScreenReader();
}
@When("the user verifies that all UI elements are labeled correctly")
public void the_user_verifies_that_all_ui_elements_are_labeled_correctly() {
subscriptionManagementinPassPage.areUIElementsLabeledCorrectly();
}
@When("the user checks keyboard navigation through the screen")
public void the_user_checks_keyboard_navigation_through_the_screen() {
subscriptionManagementinPassPage.isKeyboardNavigationSmooth();
}
@When("the user ensures that all buttons and links are reachable via keyboard")
public void the_user_ensures_that_all_buttons_and_links_are_reachable_via_keyboard() {
subscriptionManagementinPassPage.areButtonsAndLinksReachable();
}
@When("the user validates that tooltips are available for all interactive elements")
public void the_user_validates_that_tooltips_are_available_for_all_interactive_elements() {
subscriptionManagementinPassPage.areTooltipsAvailable();
}
@When("the user confirms that the page structure is logical and easy to follow")
public void the_user_confirms_that_the_page_structure_is_logical_and_easy_to_follow() {
subscriptionManagementinPassPage.isPageStructureLogical();
}
@When("the user validates that the UI is responsive")
public void the_user_validates_that_the_ui_is_responsive() {
subscriptionManagementinPassPage.isUIResponsive();
}
@When("the user attempts to navigate back during the payment process")
public void the_user_attempts_to_navigate_back_during_the_payment_process() {
subscriptionManagementinPassPage.attemptToNavigateBack();
}
@Then("the warning message should be displayed")
public void the_warning_message_should_be_displayed() {
subscriptionManagementinPassPage.isWarningMessageDisplayed();
}
@Then("the payment process should not be interrupted")
public void the_payment_process_should_not_be_interrupted() {
subscriptionManagementinPassPage.isPaymentProcessNotInterrupted();
}
@When("the user simulates a session timeout during the payment process")
public void the_user_simulates_a_session_timeout_during_the_payment_process() {
subscriptionManagementinPassPage.simulateSessionTimeout();
}
@Then("an error message should be displayed indicating the session has expired")
public void an_error_message_should_be_displayed_indicating_the_session_has_expired() {
subscriptionManagementinPassPage.isSessionExpiredErrorDisplayed();
}
@Then("the user should be redirected to the login screen")
public void the_user_should_be_redirected_to_the_login_screen() {
subscriptionManagementinPassPage.isOnLoginScreen();
}
@When("the user selects an invalid subscription plan")
public void the_user_selects_an_invalid_subscription_plan() {
subscriptionManagementinPassPage.selectInvalidSubscriptionPlan();
}
@Then("the system should respond with an error message indicating the plan is invalid")
public void the_system_should_respond_with_an_error_message_indicating_the_plan_is_invalid() {
subscriptionManagementinPassPage.isInvalidPlanErrorDisplayed();
}
@Then("the user should remain on the Subscription Management screen")
public void the_user_should_remain_on_the_subscription_management_screen() {
subscriptionManagementinPassPage.isOnSubscriptionManagementScreen();
}
@Then("the error message should be clearElement and actionable")
public void the_error_message_should_be_clear_and_actionable() {
subscriptionManagementinPassPage.isErrorMessageClearAndActionable();
}
@When("the user selects a payment method that has been deleted or is no longer available")
public void the_user_selects_a_payment_method_that_has_been_deleted_or_is_no_longer_available() {
subscriptionManagementinPassPage.selectDeletedPaymentMethod();
}
@Then("an error message should be displayed indicating the payment method is not found")
public void an_error_message_should_be_displayed_indicating_the_payment_method_is_not_found() {
subscriptionManagementinPassPage.isPaymentMethodNotFoundErrorDisplayed();
}
@When("the user selects a payment method that is not configured")
public void the_user_selects_a_payment_method_that_is_not_configured() {
subscriptionManagementinPassPage.selectUnconfiguredPaymentMethod();
}
@Then("an error message should be displayed indicating the payment method is not configured")
public void an_error_message_should_be_displayed_indicating_the_payment_method_is_not_configured() {
subscriptionManagementinPassPage.isPaymentMethodNotConfiguredErrorDisplayed();
}
@When("the user selects a payment method that is not recognized")
public void the_user_selects_a_payment_method_that_is_not_recognized() {
subscriptionManagementinPassPage.selectUnrecognizedPaymentMethod();
}
@Then("an error message should be displayed indicating the payment method is not recognized")
public void an_error_message_should_be_displayed_indicating_the_payment_method_is_not_recognized() {
subscriptionManagementinPassPage.isPaymentMethodNotRecognizedErrorDisplayed();
}
@When("the user selects a payment method that is not supported")
public void the_user_selects_a_payment_method_that_is_not_supported() {
subscriptionManagementinPassPage.selectUnsupportedPaymentMethod();
}
@Then("an error message should be displayed indicating the payment method is not supported")
public void an_error_message_should_be_displayed_indicating_the_payment_method_is_not_supported() {
subscriptionManagementinPassPage.isPaymentMethodNotSupportedErrorDisplayed();
}
@When("the user selects a payment method that is not available for the transaction")
public void the_user_selects_a_payment_method_that_is_not_available_for_the_transaction() {
subscriptionManagementinPassPage.selectUnavailablePaymentMethod();
}
@Then("the user should see an error message indicating the payment method is not available for the transaction")
public void the_user_should_see_an_error_message_indicating_the_payment_method_is_not_available_for_the_transaction() {
subscriptionManagementinPassPage.isPaymentMethodUnavailableErrorDisplayed();
}
@When("the user selects a payment method that is not configured for the transaction")
public void the_user_selects_a_payment_method_that_is_not_configured_for_the_transaction() {
subscriptionManagementinPassPage.selectUnconfiguredPaymentMethod();
}
@Then("the user should see an error message indicating the payment method is not configured for the transaction")
public void the_user_should_see_an_error_message_indicating_the_payment_method_is_not_configured_for_the_transaction() {
subscriptionManagementinPassPage.isPaymentMethodNotConfiguredErrorDisplayed();
}
@When("the user selects a valid saved card")
public void the_user_selects_a_valid_saved_card() {
subscriptionManagementinPassPage.selectValidSavedCard();
}
@When("the user edits the payment amount to {string}")
public void the_user_edits_the_payment_amount_to(String paymentAmount) {
subscriptionManagementinPassPage.editPaymentAmount(paymentAmount);
}
@Then("an error message should be displayed indicating the payment amount is invalid")
public void an_error_message_should_be_displayed_indicating_the_payment_amount_is_invalid() {
subscriptionManagementinPassPage.isInvalidPaymentAmountErrorDisplayed();
}
@When("the user selects an expired saved card")
public void the_user_selects_an_expired_saved_card() {
subscriptionManagementinPassPage.selectExpiredSavedCard();
}
@Then("an error message should be displayed indicating the card is expired")
public void an_error_message_should_be_displayed_indicating_the_card_is_expired() {
subscriptionManagementinPassPage.isExpiredCardErrorDisplayed();
}
@When("the user attempts to purchase the same subscription plan")
public void the_user_attempts_to_purchase_the_same_subscription_plan() {
subscriptionManagementinPassPage.attemptToPurchaseSameSubscriptionPlan();
}
@Then("an error message should be displayed indicating the subscription is already active")
public void an_error_message_should_be_displayed_indicating_the_subscription_is_already_active() {
subscriptionManagementinPassPage.isActiveSubscriptionErrorDisplayed();
}
@When("the user changes the email to {string}")
public void the_user_changes_the_email_to(String email) {
subscriptionManagementinPassPage.changeEmail(email);
}
@Then("the system should display an error message indicating the email format is invalid")
public void the_system_should_display_an_error_message_indicating_the_email_format_is_invalid() {
subscriptionManagementinPassPage.isInvalidEmailFormatErrorDisplayed();
}
@Given("no card is selected")
public void no_card_is_selected() {
subscriptionManagementinPassPage.deselectCard();
}
@Then("an error message should be displayed indicating a card must be selected")
public void an_error_message_should_be_displayed_indicating_a_card_must_be_selected() {
subscriptionManagementinPassPage.isNoCardSelectedErrorDisplayed();
}
@When("the user opens a second instance of the application")
public void the_user_opens_a_second_instance_of_the_application() {
subscriptionManagementinPassPage.openSecondInstance();
}
@Then("an error message should be displayed in the second instance indicating the subscription is already active")
public void an_error_message_should_be_displayed_in_the_second_instance_indicating_the_subscription_is_already_active() {
subscriptionManagementinPassPage.isActiveSubscriptionErrorDisplayedInSecondInstance();
}
@Then("the user should remain on the Payment Method screen")
public void the_user_should_remain_on_the_payment_method_screen() {
subscriptionManagementinPassPage.isOnPaymentMethodScreen();
}
//    @Then("the user should observe the system response")
@Then("the user should validate that the error message is clearElement and actionable")
public void the_user_should_validate_that_the_error_message_is_clear_and_actionable() {
subscriptionManagementinPassPage.isErrorMessageClearAndActionable();
}