package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;
    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement adress;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    public WebElement ssn;

    @FindBy(id = "customer.username")
    public WebElement userName;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement repeatedPassword;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement loginButton;
    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logOut;
    @FindBy(xpath = "//b[text()='Welcome']")
    public WebElement welcomeText;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//h1[text()='Error!']")
    public WebElement errorText;
    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement payBill;

    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payeeName;
    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement payeeAddress;
    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement payeeCity;
    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement payeeState;
    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement payeeZipCode;
    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    public WebElement payeePhoneNumber;
    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement payeeAccount;
    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement payeeVerifyAccount;
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement payeeAmount;
    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPayment;
    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    public WebElement paymentCompleteText;
    @FindBy(xpath = "//a[text()='Accounts Overview']")
    public WebElement accountsOverview;
    @FindBy(xpath = "//a[@class='ng-binding']")
    public WebElement paymentAccount;
    @FindBy(xpath = "//a[contains(text(),'Bill Payment to')]")
    public WebElement billPaymentText;
    @FindBy(xpath = "//td[@id='accountId']")
    public WebElement accountNumber;
    @FindBy(xpath = "(//option[contains(text(),'')])[1]")
    public WebElement fromAccount;
    @FindBy(xpath = "//span[@id='fromAccountId']")
    public WebElement successAcount;
    @FindBy(xpath = "//span[@id='amount']")
    public WebElement successAmount;
    @FindBy(xpath = "(//td[@class='ng-binding ng-scope'])[1]")
    public WebElement debitAmount;
    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;
    @FindBy(xpath = "//select[@id='type']")
    public WebElement selectType;
    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement minimumAccount;
    @FindBy(xpath = "//input[@value='Open New Account']")
    public WebElement OpenNewAccountButton;
    @FindBy(xpath = "//h1[text()='Account Opened!']")
    public WebElement AccountOpenedText;
    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountId;





    public WebElement getWebElement(String strElement) {

        switch (strElement){
            case "payBill" : return this.payBill;
            case "payeeName" : return this.payeeName;
            case "payeeAddress":return this.payeeAddress;
            case "payeeCity":return this.payeeCity;
            case "payeeState":return this.payeeState;
            case "payeeZipCode":return this.payeeZipCode;
            case "payeePhoneNumber":return this.payeePhoneNumber;
            case "payeeAccount":return this.payeeAccount;
            case "payeeVerifyAccount":return this.payeeVerifyAccount;
            case "payeeAmount":return this.payeeAmount;
            case "sendPayment":return this.sendPayment;
            case "accountsOverview":return this.accountsOverview;
            case "paymentAccount":return this.paymentAccount;

        }

        return null;
    }


}
