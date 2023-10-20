package dataAccess.HibernateDao;

import dataAccess.Dao.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}
}
