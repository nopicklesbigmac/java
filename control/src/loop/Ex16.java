package loop;

public class Ex16 {

	public static void main(String[] args) {
		int count=0;
		for ( int x=1;x<=3;x++) {
			for (int y=1;y<=3;y++) {
				for (int z=1;z<=3;z++) {
					count++;
					System.out.println(x*100+y*10+z);
					if (count == 14) {
						break;
					}
				}
				if (count == 14) {
					break;
				}
			}
			if (count == 14) {
				break;
			}
		}
		
	}

}
