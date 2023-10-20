package entities;

public class Course implements Entity {
	private int id;
	private int kategoriId;
	//private String[] educatorName;
	private String educatorName;
	private String name;
	private double unitPrice;

	public Course() {
		super();
	}

	public Course(
			int id, 
			int kategoriId, 
			String educatorName, 
			String name, 
			double unitPrice) {
		super();
		this.id = id;
		this.kategoriId = kategoriId;
		this.educatorName = educatorName;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKategoriId() {
		return kategoriId;
	}

	public void setKategoriId(int kategoriId) {
		this.kategoriId = kategoriId;
	}

	public String getEducatorName() {
		return educatorName;
	}

	public void setEducatorName(String educatorName) {
		this.educatorName = educatorName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
