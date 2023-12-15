package AngiPrestano;

import AngiPrestano.DAO.BooksDAO;
import AngiPrestano.DAO.MagazinesDAO;
import AngiPrestano.entities.Books;
import AngiPrestano.entities.Generes;
import AngiPrestano.entities.Magazines;
import AngiPrestano.entities.Periodicity;

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

        MagazinesDAO md = new MagazinesDAO(em);
        Magazines Vogue = new Magazines("The fashion Week", LocalDate.of(2023, 12, 6), 50, Periodicity.MENSILE);
        md.save(Vogue);
    }
}
