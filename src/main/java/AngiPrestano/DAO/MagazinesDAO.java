package AngiPrestano.DAO;

import AngiPrestano.entities.Magazines;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MagazinesDAO {
    private final EntityManager em;

    public MagazinesDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Magazines magazines) {

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(magazines);

        transaction.commit();
    }

    public Magazines findByid(long id) {
        return em.find(Magazines.class, id);
    }

    public void findByIdAndDelete(long id) {
        Magazines found = this.findByid(id);

        if (found != null) {

            EntityTransaction transaction = em.getTransaction();

            transaction.begin();

            em.remove(found);

            transaction.commit();

            System.out.println("Magazine" + found.getTitle() + "is correct delete");

        } else {
            System.out.println("Magazine" + id + "is not found");
        }
    }
}
