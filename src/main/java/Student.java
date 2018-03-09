import javax.persistence.*;

@Entity
@Table(name = "stud")
public class Student {

    @Id
    @Column(name = "roll_no")
    int roll_no;

    @Column(name = "name")
    String name;

    @Column(name = "address")
    String address;

    public Student(int roll_no, String name, String address) {
        super();
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    public Student(){
        super();
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
