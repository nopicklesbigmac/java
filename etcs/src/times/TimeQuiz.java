package times;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeQuiz {
	private Date date;
	private SimpleDateFormat sdf;
	
	public Date getDate() {
		date = new Date();
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public SimpleDateFormat getSdf() {
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		return sdf;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	public void time() throws InterruptedException {
		for(int i=0; i<10 ; i++) {
			System.out.println( getSdf().format(getDate()));
			Thread.sleep(1000);
		}
	}
	
	
}
