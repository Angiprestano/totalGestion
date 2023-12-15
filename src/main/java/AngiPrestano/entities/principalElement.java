package AngiPrestano.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class principalElement {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private LocalDate yearPublished;
    private int numberPage;

    public principalElement() {
    }

    public principalElement(String title, LocalDate yearPublished, int numberPage) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.numberPage = numberPage;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(LocalDate yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return "principalElement{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", numberPage=" + numberPage +
                '}';
    }
}