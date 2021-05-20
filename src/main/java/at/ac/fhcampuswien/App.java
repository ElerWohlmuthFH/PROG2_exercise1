package at.ac.fhcampuswien;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public boolean checkPassword(String password) {
        if (password != null
                && checkLength(password)
                && containsLowercaseUppercase(password)
                && containsNumber(password)
                && containsSpecialChar(password)
                && hasNoConsecutives(password)
                && hasRepeatNumbers(password)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkLength(String password) {
        return password.length() >= 8 && password.length() <= 25;
    }

    public boolean containsLowercaseUppercase(String password) {
        return password.matches(".*[a-z].*")
                && password.matches(".*[A-Z].*");
    }

    public boolean containsNumber(String password) {
        return password.matches(".*\\d.*");
    }

    public boolean containsSpecialChar(String password) {

        return password.matches(".*[()#$?!%/@].*");
    }

    public boolean hasNoConsecutives(String password) {

        return !password.contains("012")
                && !password.contains("123")
                && !password.contains("234")
                && !password.contains("345")
                && !password.contains("456")
                && !password.contains("567")
                && !password.contains("678")
                && !password.contains("789");
    }

    public boolean hasRepeatNumbers(String password) {
        if (password == null) {
            return false;
        }

        char[] chars = password.toCharArray();

        char helper = 0;
        int counter = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                if(helper == 0){
                    helper = c;
                    counter++;
                } else if(c==helper){
                    counter++;
                } else {
                    counter=0;
                }
                if (counter == 3) {
                    return true;
                }
            } else{
                counter = 0;
            }
        }

        return false;

//        String regex = "\\b([0-9])\\1\\1+\\b";
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(password);
//
//        return m.matches();
    }


}
