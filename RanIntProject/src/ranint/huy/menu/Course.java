package ranint.huy.menu;

public class Course {
	private String name;
	private int credit;
	private double cost;

	public String getName() {
		return name;
	}
	public int getCredit() {
		return credit;
	}
	public double getCost() {
		return cost;
	}

	public Course(String name, int credit, double cost) {
		super();
		this.name = name;
		this.credit = credit;
		this.cost = cost;
	}
}
