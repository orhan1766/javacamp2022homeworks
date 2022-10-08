package javacamphafta3odev3.dataAccess.kurs;

import javacamphafta3odev3.entities.Kurs;

public class HibernateKursDao implements KursDao {

	@Override
	public void add(Kurs kurs) {
		System.out.println(kurs.getName() + "  kursu Hibernate ile veri tabanına eklenmiştir.");
	}
}
