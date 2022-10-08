package javacamphafta3odev3.business.manager;

import javacamphafta3odev3.business.service.EgitmenService;
import javacamphafta3odev3.core.logging.Logger;
import javacamphafta3odev3.dataAccess.egitmen.EgitmenDao;
import javacamphafta3odev3.entities.Egitmen;

public class EgitmenManager implements EgitmenService {

	private EgitmenDao egitmenDao;
	private Logger[] loggers;

	public EgitmenManager(EgitmenDao egitmenDao, Logger[] loggers) {
		this.egitmenDao = egitmenDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Egitmen egitmen) {

		egitmenDao.add(egitmen);

		for (Logger logger : loggers) {
			logger.log(egitmen.getName());
		}
	}

}
