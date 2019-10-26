package classproj;

public class Watch {
	
	// Field
	int hour;
	int minute;
	int second;
	
	//Method
	
	void setHour(int hour){
		this.hour = hour;
		switch(hour) {
		case 0:
			hour = 12;
			break;
		}
		System.out.println(hour+"시");
	}
	
	void setMinute(int minute) {
		this.hour   = minute/60;
		this.minute = minute%60;
		System.out.println(hour+"시 "+this.minute+"분");
	}
	
	void setSecond(int second) {
		this.hour = second/3600;
		this.minute = (second/60)%60;
		this.second = second%60;
		System.out.println(hour+"시 "+this.minute+"분 "+this.second+"초");
	}

}
