package HomeWork;


public abstract class Hero {
	// 省略 getter/setter...
	public iAttack attackBehavior;
	public iMove runBehavior;
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	protected void attack() {
		attackBehavior.attack();
	}
	
	protected void move() {
		runBehavior.move();
	}
}
