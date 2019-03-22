package Entity;

import javax.persistence.*;

@Entity
public class BookEntity1 {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "BookId")
    private Integer bookId;
    private String bookName;

    @ManyToOne
    AuthorEntity11 author;

    public AuthorEntity11 getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity11 author) {
        this.author = author;
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
