package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.Dao.CourseDao;
import entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private List<Logger> loggers;

	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public List<Course> getAll() throws Exception {
		List<Course> courses = new ArrayList<>();
		courses.add(new Course(1, 1, "İsmail Arıcıoğlu", "C#", 0));
		courses.add(new Course(2, 1, "İsmail Arıcıoğlu", "Java", 10));
		courses.add(new Course(3, 1, "İsmail Arıcıoğlu", "Pascal", 0));
		return courses;
	}

	public void add(Course course) throws Exception {
		
		List<Course> courses = getAll();
		for	(Course crs : courses) {
			if (crs.getName()==course.getName())
				throw new Exception(course.getName() + " için kurs ismi tekrar edemez");
		}

		if (course.getUnitPrice() < 0) {
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz!");
		}

		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}