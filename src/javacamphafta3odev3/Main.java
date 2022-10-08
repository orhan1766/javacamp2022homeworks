package javacamphafta3odev3;

import javacamphafta3odev3.business.manager.EgitmenManager;
import javacamphafta3odev3.business.manager.KategoriManager;
import javacamphafta3odev3.business.manager.KursManager;
import javacamphafta3odev3.core.logging.DatabaseLogger;
import javacamphafta3odev3.core.logging.FileLogger;
import javacamphafta3odev3.core.logging.Logger;
import javacamphafta3odev3.core.logging.MailLogger;
import javacamphafta3odev3.dataAccess.egitmen.HibernateEgitmenDao;
import javacamphafta3odev3.dataAccess.kategori.HibernateKategoriDao;
import javacamphafta3odev3.dataAccess.kurs.JdbcKursDao;
import javacamphafta3odev3.entities.Egitmen;
import javacamphafta3odev3.entities.Kategori;
import javacamphafta3odev3.entities.Kurs;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Egitmen egitmen1 = new Egitmen(1, "Orhan");

		EgitmenManager egitmenManager = new EgitmenManager(new HibernateEgitmenDao(), loggers);
		egitmenManager.add(egitmen1);

		System.out.println("-----------------");

		Kurs kurs1 = new Kurs(10, "Yazılım Geliştirici Yetiştirme Kampı(C# & ANGULAR)", 1, 50);
		Kurs kurs2 = new Kurs(11, "Yazılım Geliştirici Yetiştirme Kampı(JAVA & REACT)", 1, 45);
		Kurs kurs3 = new Kurs(12, "Yazılım Geliştirici Yetiştirme Kampı(.NET)", 1, 55);
		Kurs kurs4 = new Kurs(13, "Programlamaya Giriş için Temel Kurs", 1, -1);

		Kurs[] kurslar = { kurs1, kurs2, kurs3 };

		KursManager kursManager = new KursManager(new JdbcKursDao(), loggers);

		for (Kurs kurs : kurslar) {
			kursManager.add(kurs);
			System.out.println("------");
		}

		kursManager.add(kurs4);

		System.out.println("-----------------");

		Kategori kategori1 = new Kategori(1, "Programlama");
		Kategori kategori2 = new Kategori(2, "Programlama");

		Kategori[] kategoriler = { kategori1, kategori2 };

		KategoriManager kategoriManager = new KategoriManager(new HibernateKategoriDao(), loggers, kategoriler);

		for (Kategori kategori : kategoriler) {
			kategoriManager.add(kategori);
		}
	}

}
