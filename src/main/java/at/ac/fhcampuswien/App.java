package at.ac.fhcampuswien;

public class App {

    public boolean checkPassword(String password) {
        return password != null
                && checkLength(password)
                && containsLowercaseUppercase(password)
                && containsNumber(password)
                && containsSpecialChar(password)
                && hasNoConsecutives(password)
                && hasNoRepeatNumbers(password);
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


    public boolean hasNoRepeatNumbers(String password) {
        if (password == null) {
            return false;
        }

        char[] chars = password.toCharArray();

        char helper = 0;
        int counter = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                if (helper == 0) {
                    helper = c;
                    counter++;
                } else if (c == helper) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 3) {
                    return false;
                }
            } else {
                counter = 0;
            }
        }
        return true;
    }
}
