package lamda;


interface LamInterEx3{
	public void lam();
}

public class LamdaEx3 {
	public static void main(String[] args) {
		LamInterEx3 lc = ()-> System.out.println("구현");
		
		
		lc.lam();
	}

}
