package javacamphafta3odev3.entities;

public class Kurs {

	private int id;
	private String name;
	private int egitmenId;
	private double price;

	public Kurs(int id, String name, int egitmenId, double price) {
		super();
		this.id = id;
		this.name = name;
		this.egitmenId = egitmenId;
		this.price = price;
	}

	public Kurs() {
		super();
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

	public int getEgitmenId() {
		return egitmenId;
	}

	public void setEgitmenId(int egitmenId) {
		this.egitmenId = egitmenId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
