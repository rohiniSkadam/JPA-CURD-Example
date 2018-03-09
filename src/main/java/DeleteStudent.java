import javax.persistence.*;
import java.util.List;

public class DeleteStudent {
    public static void main(String[] args) {
        EntityManagerFactory fact= Persistence.createEntityManagerFactory("StudentExample");
        EntityManager entityManager = fact.createEntityManager( );
        EntityTransaction entityTransaction=entityManager.getTransaction();

        entityTransaction.begin();
        Query deleteQuery = entityManager.createQuery("DELETE FROM Student s WHERE s.roll_no=102");//.executeUpdate();
        deleteQuery.executeUpdate();
        entityTransaction.commit();

        Query query = entityManager.createQuery("SELECT s FROM Student s");
        List<Student> list= (List<Student>)query.getResultList();

        for(Student e:list) {
            System.out.println("Student Details :"+e);
        }

    }
}
