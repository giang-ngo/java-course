package pratice_regex.example3;

import pratice_regex.example2.InvalidEmpIdException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String email;
    private String username;
    private String password;

    public User() {
    }

    public User(String email, String username, String password)
            throws InvalidEmpIdException, InvalidPasswordException {
        this.setEmail(email);
        this.username = username;
        this.setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmpIdException {
        var regex = "^[a-z]+[\\w._]*@gmail.com$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            this.email = email.toLowerCase();
        } else {
            this.email = null;
            var msg = "Email không hợp lệ: " + email;
            throw new InvalidEmpIdException(msg, email);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidPasswordException {
        var regex = "^(.){8,}$";
        var regex2 = "^.*[a-z]+.*$";
        var regex3 = "^.*[A-Z]+.*$";
        var regex4 = "^.*[0-9]+.*$";
        var regex5 = "^.*[~!@#$%^&.*]+.*$";
        var regex6 = email;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(password);

        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(password);

        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(password);

        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password);

        Pattern pattern6 = Pattern.compile(regex6, Pattern.CASE_INSENSITIVE);
        Matcher matcher6 = pattern6.matcher(password);

        if (matcher.matches() && matcher2.matches()
                && matcher3.matches() && matcher4.matches()
                && matcher5.matches() && !matcher6.matches()) {
            this.password = password;
        } else {
            var msg = "Mật khẩu không hợp lệ: " + password;
            throw new InvalidPasswordException(msg, password);
        }
    }
}
