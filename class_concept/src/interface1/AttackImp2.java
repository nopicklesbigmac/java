package interface1;

public class AttackImp2 implements IAttack, IDefense{
	
	@Override
	public void attack() {
		System.out.println("공격력 200");
	}
	@Override
	public void defense() {
		System.out.println("방어력 200");
	}
	
}
