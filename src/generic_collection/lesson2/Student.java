package generic_collection.lesson2;


class Student {
    private String studentId;
    private String fullName;
    private String email;
    private float avgGrade;

    public Student() {
    }

    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }

    public Student(String studentId, String fullName,
                   String email, float avgGrade) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
        this.avgGrade = avgGrade;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", avgGrade=" + avgGrade +
                '}';
    }
}