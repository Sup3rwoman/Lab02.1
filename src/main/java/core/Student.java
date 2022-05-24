package core;

public class Student {
    private long id;
    private String firstName;
    private String surname;
    private String dept;
    private Double fees;

    public Student() {
        super();
    }

    public Student(long id, String firstName, String surname, String dept, Double fees) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.dept = dept;
        this.fees = fees;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getDept() {
        return dept;
    }

    public Double getFees() {
        return fees;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ",firstName=" + firstName + ",surName=" + surname + ",dept=" + dept + ",fees=" + fees + "]";
    }
}
