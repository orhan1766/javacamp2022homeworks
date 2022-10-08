package javacamphafta3odev3.dataAccess.egitmen;

import javacamphafta3odev3.entities.Egitmen;

public class JdbcEgitmenDao implements EgitmenDao{

	@Override
	public void add(Egitmen egitmen) {
		System.out.println(egitmen.getName() + " adlı eğitmen Jdbc ile veri tabanına eklendi.");
		
	}

}
