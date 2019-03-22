package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class BookEntity3 {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "BookId")
    private Integer bookId;
    private String bookName;

    @ManyToMany
    List<AuthorEntity13> authors=new ArrayList<AuthorEntity13>();

    public List<AuthorEntity13> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorEntity13> authors) {
        this.authors = authors;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
