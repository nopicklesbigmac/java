package times;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		// 시간차를 구할때 사용 
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String timeFormat = sdf.format(date);
		System.out.println(timeFormat);
	}

}
