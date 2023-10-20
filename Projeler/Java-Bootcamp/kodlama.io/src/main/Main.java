package main;

import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateDao.HibernateCategoryDao;
import dataAccess.HibernateDao.HibernateCourseDao;
import dataAccess.HibernateDao.HibernateEducatorDao;
import dataAccess.JdbcDao.JdbcCategoryDao;
import dataAccess.JdbcDao.JdbcCourseDao;
import dataAccess.JdbcDao.JdbcEducatorDao;
import entities.Category;
import entities.Course;
import entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {

//		ExampProduct();
		ExampCourse();
		ExampCategory();
		ExampEducator();

	}

	public static void ExampCourse() {
		try {
			// add
			int id = 1;
			int kategoriId = 1;
			String educatorName = "İsmail Arıcıoğlu";
			String name = "C++";
			//double unitePrice = -1.0; // 0 dan küçük
			double unitePrice = 1.0;

			Course course = new Course(id, kategoriId, educatorName, name, unitePrice);

			List<Logger> loggers = new ArrayList<>();
			loggers.add(new DatabaseLogger());
			loggers.add(new MailLogger());
			loggers.add(new FileLogger());

			CourseManager courseManager;

			courseManager = new CourseManager(new JdbcCourseDao(), loggers);
			courseManager.add(course);

			courseManager = new CourseManager(new HibernateCourseDao(), loggers);
			courseManager.add(course);

			// getAllList
			for (Course crs : courseManager.getAll()) {
				System.out.println("Kategori : " + crs.getName());

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void ExampCategory() {
		try {
			// add
			int id = 1;
			String name = "Tüm";

			Category category = new Category(id, name);

			List<Logger> loggers = new ArrayList<>();
			loggers.add(new DatabaseLogger());
			loggers.add(new MailLogger());
			loggers.add(new FileLogger());

			CategoryManager categoryManager;

			categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
			categoryManager.add(category);

			categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
			categoryManager.add(category);

			// getAllList
			for (Category ctgry : categoryManager.getAll()) {
				System.out.println("Kategori : " + ctgry.getName());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void ExampEducator() {
		try {
			// add
			int id = 1;
			// String name = "İsmail Arıcıoğlu"; // tekrara düşürür
			String name = "İsrafil Arıcıoğlu";

			Educator educator = new Educator(id, name);

			List<Logger> loggers = new ArrayList<>();
			loggers.add(new DatabaseLogger());
			loggers.add(new MailLogger());
			loggers.add(new FileLogger());

			EducatorManager educatorManager;

			educatorManager = new EducatorManager(new JdbcEducatorDao(), loggers);
			educatorManager.add(educator);

			educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);
			educatorManager.add(educator);

			// getAllList
			for (Educator edctr : educatorManager.getAll()) {
				System.out.println("Eğitmen : " + edctr.getName());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}