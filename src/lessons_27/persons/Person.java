package lessons_27.persons;

public class Person {
    private String email;

    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    //john@test.net
    /*
    1. @ должна присутствовать и должен быть только один
    2. точка после собаки
    3. точка не может быть сразу после собаки
    4. после последней точки должно быть не менее двух символов
    5. символы алфавита, цифры, '-', '_', '.', '@'
    6. место для @ - хотя бы один символ до @
     */
    private boolean isEmailValid(String email) {
        //проверяем что не null и не пустая строка
        if (email == null || email.isEmpty()) return false;

        //1. @
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) return false;

        //2. должна быть точка после @
        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) return false;

        //3.LastDot
        if (email.lastIndexOf('.') >= email.length() - 2) return false;


        // true - если первый символ является буквой алфавита
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic) return false;

        // 5. символы алфавита, цифры, '-', '_', '.', '@'

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            // true - если символ удовлетворяет хотя бы одному критерию
            boolean isCharValid = (Character.isAlphabetic(c)
                    || Character.isDigit(c)
                    || c == '-'
                    || c == '_'
                    || c == '.'
                    || c == '@');

            if (!isCharValid) return false;

        }
        // все проверки пройдены нигде не вернул false
        return true;
    }

    /* Требования к валидности пароля
    1. длинна пароля >= 8
    2. мин маленькая буква
    3. мин большая буква
    4. мин 1 спец символ (!%$@&*)
    5. мин 1 цифра

     */

    private boolean isPasswordValid(String password) {
        if (password == null || password.isEmpty()) return false;

        if (password.length() < 8) return false;


        for (int i = 0; i < password.length(); i++) {
            char p = password.charAt(i);

            // true - если символ удовлетворяет хотя бы одному критерию
            boolean isCharValid = (Character.isAlphabetic(p)
                    || Character.isDigit(p)
                    || p == '!'
                    || p == '%'
                    || p == '$'
                    || p == '@'
                    || p == '&'
                    || p == '*');

            if (!isCharValid) return false;

           String lowerCasePassword = password.toLowerCase();
           String upperCasePassword = password.toUpperCase();

           return !password.equals(lowerCasePassword) && !password.equals(upperCasePassword);
        }
        return true;
    }

        public String getPassword () {
            return password;
        }

        public void setPassword (String password){
            this.password = password;
        }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

