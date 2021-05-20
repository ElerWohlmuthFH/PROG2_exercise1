package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    //App.checkPassword Tests
    @Test
    public void validPassword1() {

        App app = new App();
        //action
        boolean result = app.checkPassword("Passwort01!!"); //correct pwd
        //assertion
        assertTrue(result);
    }

    @Test
    public void validPassword2() {

        App app = new App();
        //action
        boolean result = app.checkPassword("PaSwOrD23//"); //correct pwd
        //assertion
        assertTrue(result);
    }

    @Test
    public void tooShort() {

        App app = new App();
        //action
        boolean result = app.checkPassword("Pwd01!!"); //shorter than 8 characters
        //assertion
        assertFalse(result);
    }

    @Test
    public void tooLong() {

        App app = new App();
        //action
        boolean result = app.checkPassword("TestPasswordThatIsTooLong01!!"); //longer than 8 characters
        //assertion
        assertFalse(result);
    }

    @Test
    public void noUppercase() {

        App app = new App();
        //action
        boolean result = app.checkPassword("password01!!"); //no uppercase/only lowercase
        //assertion
        assertFalse(result);
    }

    @Test
    public void NoLowercase() {

        App app = new App();
        //action
        boolean result = app.checkPassword("PASSWORD01!!"); //no lowercase/only uppercase
        //assertion
        assertFalse(result);
    }

    @Test
    public void noNumbers() {

        App app = new App();
        //action
        boolean result = app.checkPassword("Password!!"); //no numbers
        //assertion
        assertFalse(result);
    }

    @Test
    public void noSpecialCharacters() {

        App app = new App();
        //action
        boolean result = app.checkPassword("Password01"); //no special characters
        //assertion
        assertFalse(result);
    }

    @Test
    public void isConsecutive() {

        App app = new App();
        //action
        boolean result = app.checkPassword("Password123!!"); //is consecutive
        //assertion
        assertFalse(result);
    }

    @Test
    public void repeatNumbers() {

        App app = new App();
        //action
        boolean result = app.checkPassword("Password1111!!"); //more than 3 same numbers
        //assertion
        assertFalse(result);

    }






    private static String password = "Password1111!!";

    @Test
    public void checkLengthValid() {
        App app = new App();
        boolean result = app.checkLength("12345678");
        assertTrue(result);
    }

    @Test
    public void checkLengthFailed() {
        App app = new App();
        boolean result = app.checkLength("1234567");
        assertFalse(result);
    }

    @Test
    public void containsLowercaseUppercaseValid() {
        App app = new App();
        boolean result = app.containsLowercaseUppercase("Password01!!");
        assertTrue(result);
    }

    @Test
    public void containsLowercaseUppercaseFailed1() {
        App app = new App();
        boolean result = app.containsLowercaseUppercase("password01!!");
        assertFalse(result);
    }

    @Test
    public void containsLowercaseUppercaseFailed2() {
        App app = new App();
        boolean result = app.containsLowercaseUppercase("PASSWORD01!!");
        assertFalse(result);
    }

    @Test
    public void containsNumberValid() {
        App app = new App();
        boolean result = app.containsNumber("Password01!!");
        assertTrue(result);
    }
    @Test
    public void containsNumberFailed() {
        App app = new App();
        boolean result = app.containsNumber("Password!!");
        assertFalse(result);
    }

    @Test
    public void containsSpecialCharValid() {
        App app = new App();
        boolean result = app.containsSpecialChar("Password01!!");
        assertTrue(result);
    }

    @Test
    public void containsSpecialCharFailed() {
        App app = new App();
        boolean result = app.containsSpecialChar("Password01");
        assertFalse(result);
    }

    @Test
    public void hasNoConsecutivesValid() {
        App app = new App();
        boolean result = app.hasNoConsecutives("Password01!!");
        assertTrue(result);
    }

    @Test
    public void hasNoConsecutivesFailed() {
        App app = new App();
        boolean result = app.hasNoConsecutives("Password012!!");
        assertFalse(result);
    }

    @Test
    public void hasNoRepeatNumbersValid() {
        App app = new App();
        boolean result = app.hasNoRepeatNumbers("Password01!!");
        assertTrue(result);
    }

    @Test
    public void hasNoRepeatNumbersFailed() {
        App app = new App();
        boolean result = app.hasNoRepeatNumbers("Password111!!");
        assertFalse(result);
    }


}
