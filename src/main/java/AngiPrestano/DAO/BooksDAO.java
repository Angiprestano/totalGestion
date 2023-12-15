package AngiPrestano.DAO;

import AngiPrestano.entities.Books;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.awt.print.Book;

public class BooksDAO {
    private final EntityManager em;

    public BooksDAO(EntityManager em) {
        this.em = em;
    }

    // metodo per salvare
    public void save(Books books) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(books);

        transaction.commit();
    }

    public Books findByid(long id) {
        return em.find(Books.class, id);
    }

    public void findByIdAndDelete(long id) {
        Books found = this.findByid(id);

        if (found != null) {
            EntityTransaction transaction = em.getTransaction();

            transaction.begin();

            em.remove(found);

            transaction.commit();

            System.out.println("The book is" + found.getTitle() + "correct delete");

        } else {
            // 3. Se non c'è --> "Non trovato"
            System.out.println("The book is " + id + "not found");
        }
    }
}
