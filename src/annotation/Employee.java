package annotation;

@ClassPreamble(
//        author = "Thuy Giang",
        date = "23/02/2024",
//        currentRevision = 1,
//        lastModify = "23/02/2024",
//        lastModifyBy = "Thuy Giang",
        reviewers = {"I'm a bit tired today", "so I'll go to bed early", "good night"}

)
@JsonSerializable
public class Employee {
    @JsonElement
    private String empId;
    @JsonElement

    private String firstName;
    @JsonElement

    private String lastName;
    @JsonElement

    private String email;

    private String address;
    @JsonElement

    private float salary;

    public Employee() {

    }

    public Employee(String empId, String firstName,
                    String lastName, String email, String address, float salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Init
    private void initName() {
        this.firstName = this.firstName.substring(0, 1).
                toUpperCase() + this.firstName.substring(1);

        this.lastName = this.lastName.substring(0, 1).
                toUpperCase() + this.lastName.substring(1);
    }
}
