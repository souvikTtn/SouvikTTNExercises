package Entity;

import javax.persistence.*;
import java.util.Date;


@Entity
public class AuthorEntity4 {

    @Id
    private String firstName;
    @Transient
    private String lastName;
    private Integer age;

    @Temporal(TemporalType.DATE)
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
