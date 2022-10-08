package javacamphafta3odev3.business.manager;

import javacamphafta3odev3.business.service.KategoriService;
import javacamphafta3odev3.core.logging.Logger;
import javacamphafta3odev3.dataAccess.kategori.KategoriDao;
import javacamphafta3odev3.entities.Kategori;

public class KategoriManager implements KategoriService {

	private KategoriDao kategoriDao;
	private Logger[] loggers;
	private Kategori[] kategoriler;

	public KategoriManager(KategoriDao kategoriDao, Logger[] loggers, Kategori[] kategoriler) {
		super();
		this.kategoriDao = kategoriDao;
		this.loggers = loggers;
		this.kategoriler = kategoriler;
	}

	@Override
	public void add(Kategori kategori) throws Exception {

		for (Kategori kategoriarray : kategoriler) {
			if (kategori.getName() == kategoriarray.getName()) {
				throw new Exception("Bu isimde bir kategori zaten mevcut!");
			}

			kategoriDao.add(kategori);

			for (Logger logger : loggers) {
				logger.log(kategori.getName());
			}
		}
	}

}
