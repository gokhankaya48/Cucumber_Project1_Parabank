package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class _04_NewAccountSteps {
    DialogContent dc = new DialogContent();
    @When("the user navigates to the account creation page")
    public void theUserNavigatesToTheAccountCreationPage() {
        dc.myClick(dc.openNewAccount);
    }

    @And("the user selects the account type as Checking")
    public void theUserSelectsTheAccountTypeAsChecking() {
        Select checking=new Select(dc.selectType);
        checking.selectByIndex(0);
    }

    @And("the user selects the initial balance for the checking account")
    public void theUserSelectsTheInitialBalanceForTheCheckingAccount() {
        Select minimumAccount=new Select(dc.minimumAccount);
        minimumAccount.selectByIndex(0);
    }

    @And("the user clicks on the Open New Account button")
    public void theUserClicksOnTheButton() {
        dc.myClick(dc.OpenNewAccountButton);
    }

    @Then("the user should receive a confirmation message with the new account number")
    public void theUserShouldReceiveAConfirmationMessageWithTheNewAccountNumber() {

        dc.verifyContainsText(dc.AccountOpenedText,"Account Opened!");
        dc.verifyContainsText(dc.newAccountId,dc.newAccountId.getText());
    }
}
