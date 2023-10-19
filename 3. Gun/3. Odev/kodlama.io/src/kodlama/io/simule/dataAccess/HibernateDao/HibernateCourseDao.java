package kodlama.io.simule.dataAccess.HibernateDao;

import kodlama.io.simule.dataAccess.Dao.CourseDao;
import kodlama.io.simule.entities.Course;

public class HibernateCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}
}
