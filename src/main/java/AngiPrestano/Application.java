package AngiPrestano;

import AngiPrestano.DAO.BooksDAO;
import AngiPrestano.entities.Books;
import AngiPrestano.entities.Generes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion_material");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        BooksDAO bd = new BooksDAO(em);
        Books HarryPotter=new Books("la camera dei segreti", LocalDate.of(2007,4,12),300,"J. K. Rowling", Generes.FANTASY);
        bd.save(HarryPotter);
    }
}
