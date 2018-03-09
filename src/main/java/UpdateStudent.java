import javax.persistence.*;
import java.util.List;

public class UpdateStudent {
    public static void main(String[] args) {
        EntityManagerFactory fact= Persistence.createEntityManagerFactory("StudentExample");
        EntityManager entityManager = fact.createEntityManager( );
        EntityTransaction entityTransaction=entityManager.getTransaction();

        Query updateQuery = entityManager.createNativeQuery("UPDATE stud s SET s.name = 'John' WHERE s.roll_no=101");
        entityTransaction.begin();
        updateQuery.executeUpdate();
        entityTransaction.commit();

        Query query = entityManager.createQuery("SELECT s FROM Student s");
        List<Student> list= (List<Student>)query.getResultList();

        for(Student e:list) {
            System.out.println("Student Details :"+e);
        }
    }
}
