package loop;

public class Quiz07 {
	public static void main(String[] args) {
		int count=0;
		for ( int x=1;x<=3;x++) {
			for (int y=1;y<=3;y++) {
				for (int z=1;z<=3;z++) {
					count++;
					if (count == 14) {
						System.out.println(x*100+y*10+z);
					}
				}
			}
		}
        int sum=0;
        for(int y=1; y<=1000; y++) {
            sum=0;
            for(int z=1; z<y; z++) { 
                if(y%z==0) {
                    sum = sum + z;
                    if(y==sum)
                        System.out.println(y);
            }
            }
        }
    }
}		
