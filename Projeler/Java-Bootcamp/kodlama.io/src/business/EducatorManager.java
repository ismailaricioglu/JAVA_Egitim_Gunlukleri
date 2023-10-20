package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.Dao.EducatorDao;
import entities.Educator;

public class EducatorManager {

	private EducatorDao educatorDao;
	private List<Logger> loggers;

	public EducatorManager(EducatorDao educatorDao, List<Logger> loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}

	public List<Educator> getAll() throws Exception {
		List<Educator> educator = new ArrayList<>();
		educator.add(new Educator(1, "İsmail Arıcıoğlu"));
		educator.add(new Educator(2, "Gökhan Arıcıoğlu"));
		return educator;
	}

	public void add(Educator educator) throws Exception {

		List<Educator> educatories = getAll();
		for (Educator edctr : educatories) {
			if (edctr.getName() == educator.getName())
				throw new Exception(educator.getName() + " için Eğitmen ismi tekrar edemez");
		}

		educatorDao.add(educator);

		for (Logger logger : loggers) {
			logger.log(educator.getName());
		}
	}
}