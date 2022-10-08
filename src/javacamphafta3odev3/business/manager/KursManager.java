package javacamphafta3odev3.business.manager;

import javacamphafta3odev3.business.service.KursService;
import javacamphafta3odev3.core.logging.Logger;
import javacamphafta3odev3.dataAccess.kurs.KursDao;
import javacamphafta3odev3.entities.Kurs;

public class KursManager implements KursService{

	private KursDao kursDao;
	private Logger[] loggers;
	
	public KursManager(KursDao kursDao, Logger[] loggers) {
		this.kursDao = kursDao;
		this.loggers = loggers;
	}
	@Override
	public void add(Kurs kurs) throws Exception {
		
		if (kurs.getPrice()<0) {
			throw new Exception("Kursun fiyatı 0'dan düşük olamaz.");
		}
		
		kursDao.add(kurs);
		for (Logger logger : loggers) {
			logger.log(kurs.getName());
		}
		
	}

}
