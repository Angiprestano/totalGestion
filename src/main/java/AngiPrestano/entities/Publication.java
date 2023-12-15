package AngiPrestano.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
    @Inheritance(strategy = InheritanceType.JOINED)
    @NamedQuery(name="findByExactTitle",query="SELECT p FROM Publication p WHERE p.title = :title")
    @NamedQuery(name="findByTitle",query="SELECT p FROM Publication p WHERE LOWER(p.title) LIKE LOWER(CONCAT('%', :searchQuery,'%'))")
    public abstract class Publication {
        @Id
        protected String isbn;
        protected String title;
        protected LocalDate publicationDate;

        protected int numberOfPages;
        @OneToMany(mappedBy = "publication",cascade = CascadeType.REMOVE)
        private List<Libraryloan> loanHistory;
        public Publication(){
        }

        public Publication(String isbn, String title, LocalDate publicationDate, int numberOfPages) {
            this.isbn = isbn;
            this.title = title;
            this.publicationDate = publicationDate;
            this.numberOfPages = numberOfPages;
        }

        public String getIsbn() {
            return isbn;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public LocalDate getPublicationDate() {
            return publicationDate;
        }

        public void setPublicationDate(LocalDate publicationDate) {
            this.publicationDate = publicationDate;
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

        public List<Libraryloan> getLoanHistory() {
            return loanHistory;
        }

        @Override
        public String toString() {
            return "Publication{" +
                    "isbn='" + isbn + '\'' +
                    ", title='" + title + '\'' +
                    ", publicationDate=" + publicationDate +
                    ", numberOfPages=" + numberOfPages +
                    '}';
        }
}
