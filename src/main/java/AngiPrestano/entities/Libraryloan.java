package AngiPrestano.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Libraryloan {
    @Id
    @GeneratedValue

    private long loanId;
    @ManyToOne

    private User user;
    @ManyToOne
    private Publication publication;

    private LocalDate initialDate;

    private LocalDate allDate;

    private LocalDate returnDate;

    public Libraryloan(){

    }

    public Libraryloan(User user, Publication publication, LocalDate initialDate, LocalDate allDate, LocalDate returnDate) {
        this.user = user;
        this.publication = publication;
        this.initialDate = initialDate;
        this.allDate = allDate;
        this.returnDate = returnDate;
    }

    public long getLoanId() {
        return loanId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getAllDate() {
        return allDate;
    }

    public void setAllDate(LocalDate allDate) {
        this.allDate = allDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Libraryloan{" +
                "loanId=" + loanId +
                ", user=" + user +
                ", publication=" + publication +
                ", initialDate=" + initialDate +
                ", allDate=" + allDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
