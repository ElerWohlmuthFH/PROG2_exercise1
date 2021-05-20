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
    public void sameNumbers() {

        App app = new App();
        //action
        boolean result = app.checkPassword("Password1111!!"); //more than 3 same numbers
        //assertion
        assertFalse(result);
    }
}
