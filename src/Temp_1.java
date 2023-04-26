//import static java.lang.Thread.sleep;
//
//@predefined
//Feature: VP Test set for Teacher: Setting password
//
//@protsiuk_scenario_1
//  Scenario: VP Change Password Happy Path
//          Given VP login as "teacher" 'teacher' or 'student' or 'newPasswordTeacher'
//          Given VP set "new" password 'old or 'new'
//          Given VP Log Out
//
//@protsiuk_scenario_2
//  Scenario: VP Return Password Happy Path
//          Given VP login as "newPasswordTeacher" 'teacher' or 'student' or 'newPasswordTeacher'
//          Given VP set "old" password 'old or 'new'
//          Given VP Log Out
//
//@protsiuk_scenario_3
//  Scenario: VP try to set new password 7 char with leading space
//          Given VP try to set "new password 7 char with leading space"
//
//@protsiuk_scenario_4
//  Scenario: VP try to set new password 7 char with trailing space
//          Given VP try to set "new password 7 char with trailing space"
//
//@protsiuk_scenario_5
//  Scenario: VP try to set new password with two words with space between words
//          Given VP try to set "new password with two words with space between words"
//
//@protsiuk_scenario_6
//  Scenario: VP try to set leave field New Password empty
//          Given VP try to set "leave field New Password empty"
//
//@protsiuk_scenario_7
//  Scenario: VP try to set password with less than 5 char
//          Given VP try to set "set password with less than 5 char"
//
//@protsiuk_scenario_8
//  Scenario: VP try to set password with more then 32 char
//          Given VP try to set "set password with more then 32 char"
//
//@protsiuk_scenario_9
//  Scenario: VP try to set try to confirm invalid new password
//          Given VP try to set "try to confirm invalid new password"
//
//@protsiuk_scenario_10
//  Scenario: VP try to set invalid old password_3
//          Given VP try to set "invalid old password"
//
//
//
//          package definitions;
//
//          import cucumber.api.java.en.Given;
//          import org.openqa.selenium.*;
//          import org.openqa.selenium.interactions.Actions;
//          import org.openqa.selenium.support.ui.ExpectedConditions;
//          import org.openqa.selenium.support.ui.WebDriverWait;
//          import support.ProtsiukCredentials;
//          import support.ProtsiukXpathLib;
//          import support.thomasDorai_XpathLib;
//
//          import static java.lang.Thread.sleep;
//        import static org.assertj.core.api.Assertions.assertThat;
//        import static support.TestContext.getDriver;
//
//public class protsiukDefinitions {
//    @Given("VP login as \"([^\"]*)\" 'teacher' or 'student' or 'newPasswordTeacher'$")
//    public void login(String asWho) throws InterruptedException {
//        String login = "";
//        String password = "";
//        switch (asWho){
//            case "teacher":
//                login= ProtsiukCredentials.teacherEmail;
//                password= ProtsiukCredentials.teacherPassword;
//                break;
//            case "student":
//                login=ProtsiukCredentials.studentEmail;
//                password=ProtsiukCredentials.studentPassword;
//                break;
//            case "newPasswordTeacher":
//                login= ProtsiukCredentials.teacherEmail;
//                password= ProtsiukCredentials.teacherNewPassword;
//            default:
//                System.out.println("incorrect credential requested");
//        }
//        getDriver().get(ProtsiukXpathLib.askURL_xpathLib);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.teacherEmailField_xpathlib)).sendKeys(login);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.teacherPasswordField_xpathlib)).sendKeys(password);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.loginButton_xpathlib)).click();
//        sleep(1000);
////        WebElement roleLabel = getDriver().findElement(By.xpath("//div[@class='info']//p"));
////        System.out.println(roleLabel.getText());
////        String role = roleLabel.getText();
//    }
//
//    @Given("VP Log Out")
//    public void logOut() throws InterruptedException {
//        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutButton_xpathLib))).perform();
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutButton_xpathLib)).click();
//        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ProtsiukXpathLib.lodOutConfirmationButton_xpathLib)));
//        sleep(1000);
//        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutConfirmationButton_xpathLib))).perform();
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutConfirmationButton_xpathLib)).click();
//    }
//
//    @Given("VP set \"([^\"]*)\" password 'old or 'new'$")
//    public void ChangePassword(String pass) throws InterruptedException {
//        String password1 = "";
//        String password2 = "";
//        switch (pass){
//            case "old":
//                password1 = ProtsiukCredentials.teacherNewPassword;
//                password2= ProtsiukCredentials.teacherPassword;
//                break;
//            case "new":
//                password1 = ProtsiukCredentials.teacherPassword;
//                password2 = ProtsiukCredentials.teacherNewPassword;
//                break;
//
//            default:
//                System.out.println("incorrect credential requested");
//        }
//        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ProtsiukXpathLib.settingButton_xpathLib)));
//        sleep(1000);
//        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.settingButton_xpathLib))).perform();
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.settingButton_xpathLib)).click();
//        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ProtsiukXpathLib.changeYourPasswordButton_xpathLib)));
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changeYourPasswordButton_xpathLib)).click();
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordPasswordField_xpathLib)).sendKeys(password1);
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordNewPasswordField_xpathLib)).sendKeys(password2);
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmNewPasswordField_xpathLib)).sendKeys(password2);
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).click();
//        sleep(1000);
//    }
//
//    @Given("VP try to set \"([^\"]*)\"$")
//    public void vpTryToSet(String step) throws InterruptedException {
//        login("teacher");
//        String oldPassword = "";
//        String newPassword = "";
//        String confirmNewPassword = "";
//        String error = "";
//
//        switch (step){
//            case "invalid old password":
//                oldPassword = ProtsiukCredentials.teacherWrongPassword;
//                newPassword = ProtsiukCredentials.teacherNewPassword;
//                confirmNewPassword = ProtsiukCredentials.teacherNewPassword;
//                error = "//snack-bar-container[@role = 'alert']";
//                break;
//            case "new password 7 char with leading space":
//                oldPassword = ProtsiukCredentials.teacherPassword;
//                newPassword = " 1234567";
//                confirmNewPassword = " 1234567";
//                error = "//mat-error[contains(text(), 'Whitespaces')]";
//                break;
//            case "new password 7 char with trailing space":
//                oldPassword = ProtsiukCredentials.teacherPassword;
//                newPassword = "1234567 ";
//                confirmNewPassword = "1234567 ";
//                error = "//mat-error[contains(text(), 'Whitespaces')]";
//                break;
//            case "new password with two words with space between words":
//                oldPassword = ProtsiukCredentials.teacherPassword;
//                newPassword = "12345 12345";
//                confirmNewPassword = "12345 12345";
//                error = "//mat-error[contains(text(), 'Whitespaces')]";
//                break;
//            case "leave field New Password empty":
//                oldPassword = ProtsiukCredentials.teacherPassword;
//                newPassword = "";
//                confirmNewPassword = "";
//                error = "//mat-error[contains(text(), 'This field')]";
//                break;
//            case "set password with less than 5 char":
//                oldPassword = ProtsiukCredentials.teacherPassword;
//                newPassword = "1234";
//                confirmNewPassword = "1234";
//                error = "//mat-error[contains(text(), 'Too short')]";
//                break;
//            case "set password with more then 32 char":
//                oldPassword = ProtsiukCredentials.teacherPassword;
//                int x = 33;
//                while (x > 0){
//                    newPassword += "1";
//                    x--;
//                }
//                confirmNewPassword = newPassword;
//                error = "//mat-error[contains(text(), 'Too long')]";
//                break;
//            case "try to confirm invalid new password":
//                oldPassword = ProtsiukCredentials.teacherPassword;
//                newPassword = "123456789";
//                confirmNewPassword = "123456";
//                error = "//mat-error[contains(text(), 'Entered')]";
//                break;
//
//            default:
//                System.out.println("incorrect credential requested");
//        }
//        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ProtsiukXpathLib.settingButton_xpathLib)));
//        sleep(1000);
//        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.settingButton_xpathLib))).perform();
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.settingButton_xpathLib)).click();
//        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ProtsiukXpathLib.changeYourPasswordButton_xpathLib)));
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changeYourPasswordButton_xpathLib)).click();
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordPasswordField_xpathLib)).sendKeys(oldPassword);
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordNewPasswordField_xpathLib)).sendKeys(newPassword);
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmNewPasswordField_xpathLib)).sendKeys(confirmNewPassword);
//        sleep(1000);
//        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordPasswordField_xpathLib)).click();
//        sleep(1000);
//
//        WebElement w = getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib));
//        boolean actual = w.isEnabled();
//        isClickable(w);
//
//        if (actual) {
//            System.out.println("Clickable");
//            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).click();
//            sleep(2000);
//            new WebDriverWait(getDriver(), 3, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
//            sleep(1000);
//        }
//        else {
//            System.out.println("Unclickable");
//            new  WebDriverWait(getDriver(), 2,200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
//            sleep(1000);
//            new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib))).perform();
//            sleep(1000);
//            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib)).click();
//            sleep(1000);
//        }
//        logOut();
//    }
//
//    public static boolean isClickable(WebElement w)
//    {
//        try
//        {
//            WebDriverWait wait = new WebDriverWait(getDriver(), 5);
//            wait.until(ExpectedConditions.elementToBeClickable(w));
//            return true;
//        }
//        catch (Exception e)
//        {
//            return false;
//        }
//    }
//}
//
////        WebElement w = getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib));
////        boolean actual = w.isEnabled();
////        isClickable(w);
//
////        if (actual) {
////            System.out.println("Clickable");
////            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).click();
////            sleep(2000);
////            new  WebDriverWait(getDriver(), 3,200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
////            sleep(1000);
//
//
////            new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib))).perform();
////            sleep(1000);
////            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).click();
////            sleep(1000);
////            new  WebDriverWait(getDriver(), 3,200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
////            sleep(1000);
////            logOut();
////        }
////        else {
////            System.out.println("UnClickable");
//
//
////
//
//
////            getDriver().switchTo().defaultContent();
////            getDriver().manage().window().maximize();
////            getDriver().switchTo().frame(getDriver().findElement(By.xpath("//mat-icon[contains(text(), 'power_settings_new')]")));
////            sleep(5000);
//
////            getDriver().findElement(By.xpath("//mat-dialog-container")).click();
////
////            new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib))).perform();
////            sleep(5000);
////
////            String actualText = getDriver().findElement(By.xpath(error)).getText();
////            assertThat(actualText).isEqualTo("Whitespaces are not allowed");
////            new  WebDriverWait(getDriver(), 5,200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
////            sleep(1000);
////            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib)).click();
////
////            WebElement element = getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib));
////            JavascriptExecutor executor = (JavascriptExecutor) getDriver();
////            executor.executeScript("arguments[0].click();", element);
////
////            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib)).click();
////            sleep(1000);
////            logOut();
////            logOut(); getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).isDisplayed() &&
//
//package support;
//
//public class ProtsiukXpathLib {
//    public static String askURL_xpathLib = "http://ask-stage.portnov.com";
//    public static String teacherEmailField_xpathlib = "//input[@formcontrolname='email']";
//    public static String teacherPasswordField_xpathlib = "//input[@formcontrolname='password']";
//    public static String loginButton_xpathlib = "//button[@type='submit']";
//    public static String lodOutButton_xpathLib = "//h5[contains(text(),'Log Out')]";
//    public static String lodOutConfirmationButton_xpathLib = "//span[contains(text(),'Log Out')]";
//    public static String settingButton_xpathLib = "//h5[contains(text(),'Settings')]";
//    public static String changeYourPasswordButton_xpathLib = "//span[contains(text(),'Change Your Password')]";
//    public static String changingPasswordButton_xpathLib = "//h1[contains(text(), 'Changing')]";
//    public static String changingPasswordPasswordField_xpathLib = "//input[@formcontrolname='password']";
//    public static String changingPasswordNewPasswordField_xpathLib = "//input[@formcontrolname='newPassword']";
//    public static String changingPasswordConfirmNewPasswordField_xpathLib = "//input[@formcontrolname='confirmPassword']";
//    public static String changingPasswordConfirmationButton_xpathLib = "//button[@aria-label = 'Close dialog'] [.//span[text() = 'Change']]";
//    public static String changingPasswordConfirmationCancelButton_xpathLib = "//button[@aria-label = 'Close dialog'] [.//span[text() = 'Cancel']]";
//    public static String whitespacesAreNotAllowed = "///mat-error[contains(text(), 'Whitespace')]";
//
//
//    //    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
////            #    And I wait for element with xpath "//h1[contains(text(),'Confirmation')]" to be present
////#    And I wait for 1 sec
////#    And I click on element with xpath "//span[contains(text(),'Log Out')]"
//
//
//
//
//
//
//    public static String controlName_xpathlib = "//h3[contains(text(),'VitProtStudentTeacher')]";
//    public static String quizzesButton_xpathlib = "//h5[contains(text(),'Quizzes')]";
//    public static String listOfQuizzesButton_xpathlib = "//h4[contains(text(),'List of Quizzes')]";
//    public static String createNewQuizButton_xpathlib = "//span[contains(text(),'Create New Quiz')]";
//    public static String addQuestionButton_xpathlib = "//span[@class='mat-button-wrapper' and contains(., 'Add Question')]";
//    public static String selectTextualQuestion_xpathlib = "//div[@class='mat-radio-label-content' and contains(., 'Textual')]";
//    public static String textualQuestionTitle_xpathlib = "//textarea[@formcontrolname='question']";
//    public static String showStopper_xpathlib = "//span[contains(text(), 'Show-Stopper')]";
//
//
//
//
////    public static String emailField = "//input[@formcontrolname = 'email']";
////    public static String passwordfield = "//input[@formcontrolname = 'password']";
////    public static String loginButton = "//*[text() = 'Sign In']";
////    public static String userRole = "//div[@class='info']//p";
////    public static String quizzesButton = "//h5[contains(text(), 'Quizzes')]";
////    public static String createNewQuizButton = "//span[contains(text(), 'Create New Quiz')]";
////    public static String quizTitle = "//input[contains(@placeholder, 'Title Of The Quiz')]";
////    public static String addQuestionButton = "//button [.//*[contains(., 'Add Question')]]";
////    public static String previewButton = "//span[contains(text(), 'Preview')]";
////    public static String role = "//p[contains(text(), 'TEACHER')]";
////    public static String thisFieldIsRequired = "//mat-error[contains(text(), 'This field is required')]";
////    public static String lengthError = "//mat-error";
////    public static String textualChoice = "//mat-expansion-panel[ .//*[contains(text(), 'Q1')]]//label[ .//*[contains(., 'Textual')]]";
////    public static String textualQuestion = "//mat-expansion-panel[ .//*[contains(text(), 'Q1')]]//textarea[contains(@placeholder, 'Question *')]";
////    public static String questionSaveButton = "//span[contains(text(), 'Save')]";
//
//
//}
//package support;
//
//public class ProtsiukCredentials {
//    public static String teacherEmail = "thamilinylove@wuupr.com";
//    public static String teacherPassword = "123456Aa";
//    public static String teacherNewPassword = "123456789Aa";
//    public static String teacherWrongPassword = "123456789101112131415";
//    public static String studentEmail = "kolianzidan1@squaresilk.com";
//    public static String studentPassword = "123456Aa";
//}
//
//
//
