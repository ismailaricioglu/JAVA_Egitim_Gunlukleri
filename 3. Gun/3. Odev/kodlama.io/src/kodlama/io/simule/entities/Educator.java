package kodlama.io.simule.entities;

public class Educator implements Entity {
	private int id;
	private String name;

	public Educator() {
		super();
	}

	public Educator(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
