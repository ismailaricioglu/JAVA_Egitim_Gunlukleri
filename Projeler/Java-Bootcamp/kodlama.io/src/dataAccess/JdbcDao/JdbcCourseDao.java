package dataAccess.JdbcDao;

import dataAccess.Dao.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
