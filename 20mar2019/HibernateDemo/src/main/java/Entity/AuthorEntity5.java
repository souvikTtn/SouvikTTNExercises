package Entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "AuthorTable1")
public class AuthorEntity5 {

   // @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id @GeneratedValue(strategy=GenerationType.TABLE)
    @Column(name = "author_id")
    private Integer authorId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "Age")
    private Integer age;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
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
