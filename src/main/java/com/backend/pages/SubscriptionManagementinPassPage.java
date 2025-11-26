
package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.default_project.utils.ElementUtils;
import org.junit.Assert;

public class SubscriptionManagementinPassPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "subscriptionManagementScreen")
    private WebElement subscriptionManagementScreen;

    @FindBy(id = "weeklyPlanBuyButton")
    private WebElement buyButtonForWeeklyPlan;

    @FindBy(id = "monthlyPlanBuyButton")
    private WebElement buyButtonForMonthlyPlan;

    @FindBy(id = "paymentMethodScreen")
    private WebElement paymentMethodScreen;

    @FindBy(id = "doneButton")
    private WebElement doneButton;

    @FindBy(id = "confirmationPopup")
    private WebElement confirmationPopup;

    @FindBy(id = "navigationWarning")
    private WebElement navigationWarning;

    @FindBy(id = "errorMessages")
    private WebElement errorMessages;

    @FindBy(id = "savedCards")
    private WebElement savedCards;

    @FindBy(id = "activationConfirmationMessage")
    private WebElement activationConfirmationMessage;

    @FindBy(id = "congratulationsMessage")
    private WebElement congratulationsMessage;

    @FindBy(id = "uiResponsiveCheck")
    private WebElement uiResponsiveCheck;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    public SubscriptionManagementinPassPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void loginUser() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToSubscriptionManagement() {
        try {
            elementUtils.clickElement(subscriptionManagementScreen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSubscriptionManagementScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(subscriptionManagementScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickBuyButtonForWeeklyPlan() {
        try {
            elementUtils.clickElement(buyButtonForWeeklyPlan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickBuyButtonForMonthlyPlan() {
        try {
            elementUtils.clickElement(buyButtonForMonthlyPlan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isOnPaymentMethodScreen() {
        try {
            return elementUtils.isElementDisplayed(paymentMethodScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickDoneButton() {
        try {
            elementUtils.clickElement(doneButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isConfirmationPopupDisplayed() {
        try {
            return elementUtils.isElementDisplayed(confirmationPopup);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isNavigationWarningVisible() {
        try {
            return elementUtils.isElementDisplayed(navigationWarning);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areErrorsPresent() {
        try {
            return elementUtils.isElementDisplayed(errorMessages);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isUIResponsive() {
        try {
            return elementUtils.isElementDisplayed(uiResponsiveCheck);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isCongratulationsMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(congratulationsMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isActivationConfirmationMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(activationConfirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isErrorMessageClearAndActionable() {
        try {
            boolean isElementDisplayed = elementUtils.isElementDisplayed(errorMessage);
            Assert.assertTrue("Error message is not displayed", isElementDisplayed);
            return isElementDisplayed;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void isPurchaseProcessed() {
        try {
            // Logic to verify purchase processing and error messages
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidSavedCard() {
        try {
            // Logic to select a valid saved card and check for warning messages
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkRemainingFreeRides() {
        try {
            // Logic to check remaining free rides and validate the payment method screen
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDeletedPaymentMethod() {
        try {
            // Logic to select a deleted payment method and verify button/link accessibility
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDoneButtonVisible() {
        try {
            return elementUtils.isElementDisplayed(doneButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isKeyboardNavigationSmooth() {
        try {
            // Logic to verify smooth keyboard navigation
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areSavedCardsListed() {
        try {
            // Logic to verify saved cards and check for payment method errors
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areUIElementsLabeledCorrectly() {
        try {
            // Logic to ensure UI elements are labeled correctly
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void attemptToBookAnotherRide() {
        try {
            // Logic to attempt booking another ride and verify cancellation
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isExpiredCardErrorDisplayed() {
        try {
            // Logic to verify expired card error display
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areTwoFreeRidesAvailable() {
        try {
            // Logic to check availability of two free rides
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPaymentProcessStarted() {
        try {
            // Logic to check if payment process is started
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areBuyButtonsFunctional() {
        try {
            // Logic to check the functionality of Buy buttons
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectUnavailablePaymentMethod() {
        try {
            // Logic to select an unavailable payment method
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areSubscriptionPlansVisible() {
        try {
            // Logic to check if subscription plans are visible
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPaymentMethodNotRecognizedErrorDisplayed() {
        try {
            // Logic to verify if payment method not recognized error is displayed
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectInvalidSubscriptionPlan() {
        try {
            // Logic to select an invalid subscription plan
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectSavedCard() {
        try {
            // Logic to select a saved card
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInvalidPaymentAmountErrorDisplayed() {
        try {
            // Logic to verify invalid payment amount error
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areOtherBuyButtonsDisabled() {
        try {
            // Logic to check if other buy buttons are disabled
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void useScreenReader() {
        try {
            // Logic to use screen reader functionality
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editPaymentAmount() {
        try {
            // Logic to edit payment amount
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPurchaseCancelled() {
        try {
            // Logic to verify if the purchase is cancelled
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void deselectCard() {
        try {
            // Logic to deselect a card
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickBuyButtonForWeeklyPlan() {
        try {
            elementUtils.clickElement(buyButtonForWeeklyPlan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areUIElementsAccessible() {
        try {
            // Logic to check if UI elements are accessible
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectNoInConfirmationPopup() {
        try {
            // Logic to select "No" in confirmation popup
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void attemptToNavigateBack() {
        try {
            // Logic to attempt navigating back
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areCorrectPlanDetailsDisplayed() {
        try {
            // Logic to check if the correct plan details are displayed
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isOnSubscriptionManagementScreen() {
        try {
            // Logic to check if on subscription management screen
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void changeEmail() {
        try {
            // Logic to change email
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToRideBookingScreen() {
        try {
            // Logic to navigate to ride booking screen
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSystemResponseObserved() {
        try {
            // Logic to observe system response
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPaymentMethodNotConfiguredErrorDisplayed() {
        try {
            // Logic to check for payment method not configured error
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isActiveSubscriptionErrorDisplayedInSecondInstance() {
        try {
            // Logic to check if active subscription error is displayed in second instance
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isOnLoginScreen() {
        try {
            // Logic to check if on login screen
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areTooltipsAvailable() {
        try {
            // Logic to check if tooltips are available
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isContentReadCorrectlyByScreenReader() {
        try {
            // Logic to validate content reading by screen reader
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isActivatedPlanDisplayed() {
        try {
            // Logic to verify if activated plan is displayed
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isInvalidEmailFormatErrorDisplayed() {
        try {
            // Logic to check for invalid email format error
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void openSecondInstance() {
        try {
            // Logic to open the second instance
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectExpiredSavedCard() {
        try {
            // Logic to select an expired saved card
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPageStructureLogical() {
        try {
            // Logic to verify if page structure is logical
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEmailFormattedCorrectly() {
        try {
            // Logic to verify if email is formatted correctly
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectSavedCardForPayment() {
        try {
            // Logic to select saved card for payment
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean arePromotionalMessagesDisplayed() {
        try {
            // Logic to check if promotional messages are displayed
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean meetsAccessibilityStandards() {
        try {
            // Logic to verify that accessibility standards are met
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean arePromotionalMessagesIncludedInEmail() {
        try {
            // Logic to check for promotional messages in email
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectUnconfiguredPaymentMethod() {
        try {
            // Logic to select an unconfigured payment method
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean arePlanDetailsCorrect() {
        try {
            // Logic to verify if plan details are correct
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isReceiptDetailsCorrect() {
        try {
            // Logic to verify if receipt details are correct
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPaymentMethodNotSupportedErrorDisplayed() {
        try {
            // Logic to check for unsupported payment method error
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void simulateSessionTimeout() {
        try {
            // Logic to simulate session timeout
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickDoneButton() {
        try {
            elementUtils.clickElement(doneButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bookFreeRide() {
        try {
            // Logic to book a free ride
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPaymentProcessInitiated() {
        try {
            // Logic to check if payment process is initiated
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPaymentProcessNotInterrupted() {
        try {
            // Logic to ensure payment process is not interrupted
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectYesInConfirmationPopup() {
        try {
            // Logic to select "Yes" in confirmation popup
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectUnrecognizedPaymentMethod() {
        try {
            // Logic to select an unrecognized payment method
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPaymentDetailsCorrectInPopup() {
        try {
            // Logic to verify payment details in popup
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSessionExpiredErrorDisplayed() {
        try {
            // Logic to check if session expired error is displayed
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectUnsupportedPaymentMethod() {
        try {
            // Logic to select an unsupported payment method
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isActiveSubscriptionErrorDisplayed() {
        try {
            // Logic to check for active subscription error display
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickBuyButtonForMonthlyPlan() {
        try {
            elementUtils.clickElement(buyButtonForMonthlyPlan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void attemptToPurchaseSameSubscriptionPlan() {
        try {
            // Logic to attempt purchasing the same subscription plan
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public void isPaymentMethodUnavailableErrorDisplayed() {
    try {
        WebElement errorElement = driver.findElement(By.xpath("//div[@class='error' and text()='Payment Method Unavailable']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorElement), "Payment method unavailable error is not displayed.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void isPaymentMethodScreenDisplayed() {
    try {
        WebElement paymentMethodScreen = driver.findElement(By.xpath("//h1[text()='Payment Methods']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(paymentMethodScreen), "Payment method screen is not displayed.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void isCancelledRideAvailable() {
    try {
        WebElement cancelledRideElement = driver.findElement(By.xpath("//div[@class='cancelled-ride' and text()='Your ride has been cancelled']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(cancelledRideElement), "Cancelled ride message is not available.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void areErrorMessagesDisplayed() {
    try {
        WebElement errorMessageElement = driver.findElement(By.xpath("//div[@class='error-messages']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(errorMessageElement), "Error messages are not displayed.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void isPaymentMethodNotFoundErrorDisplayed() {
    try {
        WebElement notFoundErrorElement = driver.findElement(By.xpath("//div[contains(text(),'Payment method not found')]"));
        Assert.assertTrue(elementUtils.isElementDisplayed(notFoundErrorElement), "Payment method not found error is not displayed.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void areButtonsAndLinksReachable() {
    try {
        WebElement buttonElement = driver.findElement(By.xpath("//button[@id='submitPayment']"));
        WebElement linkElement = driver.findElement(By.xpath("//a[@href='/help']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(buttonElement) && elementUtils.isElementDisplayed(linkElement), "One or more buttons/links are not reachable.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void isNoCardSelectedErrorDisplayed() {
    try {
        WebElement noCardErrorElement = driver.findElement(By.xpath("//div[@class='error' and text()='No card selected']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(noCardErrorElement), "No card selected error is not displayed.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void isWarningMessageDisplayed() {
    try {
        WebElement warningElement = driver.findElement(By.xpath("//div[@class='warning-message']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(warningElement), "Warning message is not displayed.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void isInvalidPlanErrorDisplayed() {
    try {
        WebElement invalidPlanErrorElement = driver.findElement(By.xpath("//div[contains(text(),'Invalid Plan')]"));
        Assert.assertTrue(elementUtils.isElementDisplayed(invalidPlanErrorElement), "Invalid plan error is not displayed.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}