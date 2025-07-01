package HomeWork;


public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		System.out.println(saber.getName());
		saber.attackBehavior = new swingSword();
		saber.runBehavior = new run();
		
		saber.attack();
		saber.move();
		
		System.out.println(archer.getName());
		archer.attackBehavior = new shootingArrow();
		archer.runBehavior = new run();
		
		archer.attack();
		archer.move();
	}

}
