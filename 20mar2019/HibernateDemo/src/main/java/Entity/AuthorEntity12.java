package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class AuthorEntity12 {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "AuthorId")
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "author",cascade =CascadeType.PERSIST )
    List<BookEntity2> books=new ArrayList<>();

    public List<BookEntity2> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity2> books) {
        this.books = books;
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

