package AngiPrestano.entities;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


        @Entity
        public class User {

        @Id
        @GeneratedValue
        @Column(name="card_number")
        private long cardNumber;
        private String name;
        private String surname;
        private LocalDate dateOfBirth;
        @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
         private List<Libraryloan> listOfLoans;

        public User(){
        }

        public User(String name, String surname, LocalDate dateOfBirth) {
            this.name = name;
            this.surname = surname;
            this.dateOfBirth = dateOfBirth;
        }

        public long getCardNumber() {
            return cardNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    '}';
        }

}
