package javacamphafta3odev3.entities;

public class Egitmen {
	private int id;
	private String name;

	public Egitmen(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Egitmen() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
