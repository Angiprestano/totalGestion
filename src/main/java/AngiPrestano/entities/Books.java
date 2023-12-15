package AngiPrestano.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class Books extends principalElement {
    private String author;
    @Enumerated(EnumType.STRING)
    private Generes generes;

    public Books() {

    }

    public Books(String title, LocalDate yearPublished, int numberPage, String author, Generes generes) {
        super(title, yearPublished, numberPage);
        this.title = title;
        this.yearPublished = yearPublished;
        this.numberPage = numberPage;
        this.author = author;
        this.generes = generes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Generes getGeneres() {
        return generes;
    }

    public void setGeneres(Generes generes) {
        this.generes = generes;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", generes=" + generes +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", numberPage=" + numberPage +
                '}';
    }
}
