import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateStudent {
    public static void main(String[] args) {
        EntityManagerFactory fact= Persistence.createEntityManagerFactory("StudentExample");
        EntityManager entityManager = fact.createEntityManager( );
        entityManager.getTransaction( ).begin( );

        Student std1=new Student();
        std1.setRoll_no(101);
        std1.setName("John");
        std1.setAddress("Mumbai");
        entityManager.persist( std1 );
        entityManager.getTransaction( ).commit( );

        entityManager.close();
        fact.close();
    }
}
