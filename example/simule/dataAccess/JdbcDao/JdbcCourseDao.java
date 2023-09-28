package kodlama.io.simule.dataAccess.JdbcDao;

import kodlama.io.simule.dataAccess.Dao.CourseDao;
import kodlama.io.simule.entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
