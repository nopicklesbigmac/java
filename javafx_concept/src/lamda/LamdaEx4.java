package lamda;


interface LamInterEx4{
	public void lam(Object data);
}

public class LamdaEx4 {
	public static void main(String[] args) {
		LamInterEx4 lc = (data)-> System.out.println("매개변수:"+data);
		lc.lam(10);
		lc.lam(1.1);
		lc.lam("String");
		
		
		lc =  (param)->{
			System.out.println("람다식을 이용하여");
			System.out.println("인터페이스의 추상메소드의 내용을");
			System.out.println("현위치에서 구현.");
			System.out.println("매개변수:"+param);
		};
		lc.lam(10);
		lc.lam(1.1);
		lc.lam("String");
		
	}

}
