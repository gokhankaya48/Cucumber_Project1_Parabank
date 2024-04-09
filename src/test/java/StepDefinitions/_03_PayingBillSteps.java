package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _03_PayingBillSteps {
    DialogContent dc = new DialogContent();

    @When("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable link) {
        List<String> linkList = link.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(linkList.get(i));
            dc.myClick(linkWebElement);

        }
    }

    @And("the user enters the necessary payment details")
    public void theUserEntersTheNecessaryPaymentDetails(DataTable dataTable) {

        List<List<String>> listText = dataTable.asLists(String.class);
        for (int i = 0; i < listText.size(); i++) {
            WebElement txtBoxWebElemnt = dc.getWebElement(listText.get(i).get(0));
            dc.mySendKeys(txtBoxWebElemnt, listText.get(i).get(1));
        }
        //String id =dc.fromAccount.getText();
        //System.out.println(id);

    }

    @Then("the user should receive a confirmation message for the successful payment")
    public void theUserShouldReceiveAConfirmationMessageForTheSuccessfulPayment() {
        //System.out.println(dc.fromAccount.getText());
        dc.verifyContainsText(dc.paymentCompleteText,"Complete");
        dc.verifyContainsText(dc.successAcount,dc.fromAccount.getText());
        //System.out.println(dc.successAcount.getText());





    }

    @And("the user should verify that the electricity bill is added to the list of paid bills")
    public void theUserShouldVerifyThatTheElectricityBillIsAddedToTheListOfPaidBills() {
        System.out.println(dc.debitAmount.getText());
        //dc.verifyContainsText(dc.successAmount,dc.debitAmount.getText());


        dc.verifyContainsText(dc.billPaymentText,"Bill Payment to");


    }
}

