package times;

import java.text.SimpleDateFormat;

public class Ex02 {

	public static void main(String[] args) {
		// 시간차를 구할때 사용 
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String timeFormat = sdf.format(time);
		System.out.println(timeFormat);
	}

}
