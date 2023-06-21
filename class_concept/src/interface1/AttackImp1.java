package interface1;

public class AttackImp1 implements IAttack, IDefense{
	
	@Override
	public void attack() {
		System.out.println("공격력 100");
	}
	@Override
	public void defense() {
		System.out.println("방어력 100");
	}
	
}
