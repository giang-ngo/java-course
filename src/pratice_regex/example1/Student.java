package pratice_regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private String id;
    private String fullName;
    private String major;

    public Student() {
    }

    public Student(String id) throws InvalidStudentIdException {
        setId(id);
    }

    public Student(String id, String fullName, String major) throws InvalidStudentIdException {
        this(id);
        this.fullName = fullName;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws InvalidStudentIdException {
        var regex = "^(a|b|c){1}\\d{2}[a-z]{4}\\d{3}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(id);
        if (matcher.matches()) {
            this.id = id.toUpperCase();
        } else {
            this.id = null;
            var msg = "Mã sinh viên không hợp lệ, vui lòng kiểm tra lại";
            throw new InvalidStudentIdException(msg, id);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
