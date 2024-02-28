package database_connection.lesson1;

public class Student {
    private String id;
    private String fullName;
    private String address;
    private String email;
    private String major;
    private float avgGrade;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String fullName, String address, String email, String major, float avgGrade) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.major = major;
        this.avgGrade = avgGrade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", major='" + major + '\'' +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
