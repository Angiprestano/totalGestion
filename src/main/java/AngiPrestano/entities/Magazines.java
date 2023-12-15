package AngiPrestano.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class Magazines extends principalElement {
    @Enumerated(EnumType.STRING)
   private Periodicity periodicity;

    public Magazines() {
    }

    public Magazines(String title, LocalDate yearPublished, int numberPage, Periodicity periodicity) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.numberPage = numberPage;
        this.periodicity = periodicity;
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "periodicity=" + periodicity +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", numberPage=" + numberPage +
                '}';
    }
}
