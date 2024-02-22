package pratice_regex.example2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private String id;
    private String fullName;
    private String email;

    public Employee() {
    }

    public Employee(String id) throws InvalidEmpIdException {
        setId(id);
    }

    public Employee(String id, String fullName, String email)
            throws InvalidEmpIdException {
        this(id);
        this.fullName = fullName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws InvalidEmpIdException {
        var regex = "^(nv|emp)\\d{6}[a-z]{2,5}";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);// không phân biệt chữ hoa chữ,chữ thường
        Matcher matcher = pattern.matcher(id);
        if (matcher.matches()) {
            this.id = id.toUpperCase();
        } else {
            var msg = "Mã nhân viên không hợp lệ, vui lòng kiểm tra lại: " + id;
            this.id = null;
            throw new InvalidEmpIdException(msg, id);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
