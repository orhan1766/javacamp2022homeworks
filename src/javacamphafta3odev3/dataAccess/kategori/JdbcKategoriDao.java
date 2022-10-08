package javacamphafta3odev3.dataAccess.kategori;

import javacamphafta3odev3.entities.Kategori;

public class JdbcKategoriDao implements KategoriDao{

	@Override
	public void add(Kategori kategori) {
		System.out.println(kategori.getName() + " adlı kategori Jdbc ile veri tabanına eklendi.");
		
	}

}
