import javax.persistence.*;
import java.util.List;

public class ReadStudent {
    public static void main(String[] args) {
        EntityManagerFactory fact= Persistence.createEntityManagerFactory("StudentExample");
        EntityManager entityManager = fact.createEntityManager( );

        Query query = entityManager.createQuery("SELECT s FROM Student s");
        List<Student> list= (List<Student>)query.getResultList();

        for(Student e:list) {
            System.out.println("Student Details :"+e);
        }
    }
}
