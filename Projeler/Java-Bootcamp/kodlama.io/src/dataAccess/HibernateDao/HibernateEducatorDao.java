package dataAccess.HibernateDao;

import dataAccess.Dao.EducatorDao;
import entities.Educator;

public class HibernateEducatorDao implements EducatorDao {
	public void add(Educator Educator) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}
}
