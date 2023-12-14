package classObjectDataEncapsulation;

public class Student3 {
    //    Thuộc tính
    private String studentId;
    private FullName fullName;
    private float avgGrade;
    private String address;
    private String email;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId.isEmpty()) {
            showError("Id không hợp lệ");
        } else {
            this.studentId = studentId;
        }
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        String[] names = fullName.split(" ");
        FullName myName = new FullName();
        myName.firstName = names[names.length - 1];
        myName.lastName = names[0];

        if (!isValid(myName)) {
            showError("Tên không hợp lệ");
        } else {
            this.fullName = myName;

        }
    }

    /**
     * phương thức dùng để kiểm tra tên có hợp lệ hay không
     * tên hợp lệ chỉ chứa chữ cái và khoảng trắng
     *
     * @param fullName
     * @return
     */
    private boolean isValid(FullName fullName) {
        if (fullName.firstName.isEmpty()) {
            return false;
        }
        if (fullName.firstName.matches(".*[^a-zA-Z\\s]+.*")) {
            return false;
        }
        return true;
    }

    private void showError(String msg) {
        System.out.println(msg);
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.isEmpty()) {
            showError("Địa chỉ không hợp lệ");
        } else {
            this.address = address;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private class FullName {
        private String firstName;
        private String lastName;
        private String middleName;
    }
}
