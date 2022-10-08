package javacamphafta3odev3.dataAccess.kategori;

import javacamphafta3odev3.entities.Kategori;

public class HibernateKategoriDao implements KategoriDao {

	public void add(Kategori kategori) {
		System.out.println(kategori.getName() + " adlı kategori Hibernate ile veri tabanına eklendi.");

	}
}
