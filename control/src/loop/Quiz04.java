package loop;

import java.math.BigInteger;

public class Quiz04 {

	public static void main(String[] args) {
		int total=0, i;
		for (i = 1;i<=1000;i++) {
			if(i%4==1&&i%6==1) {
				total = total + i;
			}
		}
		System.out.println(total);
		
		
		total=0;
		i=1;
		for (int j = 1;j<=30;j++) {
				total = total + i;
				i = i * 2;	
			}
		System.out.println("총저축금액" + total);
		
		
		BigInteger miltotal = new BigInteger("0");
		BigInteger milseed = new BigInteger("1");
		for(i = 0; i <= 64; i++) {
			miltotal = miltotal.add(milseed);
			milseed = milseed.multiply(BigInteger.valueOf(2));
		}
		System.out.println("총밀알 : " + miltotal);
		
		
	
	
	}

}
