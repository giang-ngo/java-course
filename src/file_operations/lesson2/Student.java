package file_operations.lesson2;

public class Student {
    private String studentId;
    private String fullName;
    private String address;
    private String major;
    private float gpa;

    public Student() {
    }

    public Student(String studentId, String fullName,
                   String address, String major, float gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return studentId + "," + fullName
                + "," + address + "," + major + "," + gpa;
    }
}
