import org.example.dao.jobsDAO;
import org.example.models.jobs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
public class TestjobsDao {
    @Test
    public void testUpdateDao() throws SQLException, ClassNotFoundException {
        jobs j = new jobs(9,"test",400.0,500.7);
        jobsDAO dao = new jobsDAO();
        Assertions.assertDoesNotThrow(() -> dao.UPDATE_jobs(j));
        jobs newJ = dao.SELECT_ONE_id_job(j.getJob_id());
        Assertions.assertNotNull(newJ);
        Assertions.assertEquals(newJ.getJob_title(),j.getJob_title());
        Assertions.assertEquals(newJ.getMin_salary(),j.getMin_salary());
        Assertions.assertEquals(newJ.getMax_salary(),j.getMax_salary());



    }
}