package classObjectDataEncapsulation;

public class Student3 {
    //    Thuộc tính
    private String studentId;
    private String fullName;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (!isValid(fullName)) {
            showError("Tên không hợp lệ");
        } else {
            this.fullName = fullName;

        }
    }

    /**
     * phương thức dùng để kiểm tra tên có hợp lệ hay không
     * tên hợp lệ chỉ chứa chữ cái và khoảng trắng
     *
     * @param fullName
     * @return
     */
    private boolean isValid(String fullName) {
        if (fullName.isEmpty()) {
            return false;
        }
        if (fullName.matches(".*[^a-zA-Z\\s]+.*")) {
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
}
