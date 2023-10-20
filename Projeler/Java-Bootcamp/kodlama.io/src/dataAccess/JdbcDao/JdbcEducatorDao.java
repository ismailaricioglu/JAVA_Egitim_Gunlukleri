package dataAccess.JdbcDao;

import dataAccess.Dao.EducatorDao;
import entities.Educator;

public class JdbcEducatorDao implements EducatorDao {
	public void add(Educator Educator) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
