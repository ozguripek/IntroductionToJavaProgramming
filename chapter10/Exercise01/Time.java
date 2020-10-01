package chapter10.Exercise01;

public class Time {
	private long hour;
	private long minute;
	private long second;
		
	public Time(){		
		setTime(System.currentTimeMillis());		 
	 }
	
	public Time (long elapseTime){		
		setTime(elapseTime);		
	}
	
	public Time (long hour, long minute, long second){		
		this.hour=hour;
		this.minute= minute;
		this.second= second;		
	}	
	
	public void setTime(long elapseTime)	{			
		long totalSecond = elapseTime / 1000;		
		second = totalSecond % 60;
		long totalMinutes= totalSecond / 60;
		minute = totalMinutes % 60;
		long totalHours= totalMinutes / 60;		
		hour = totalHours % 24;		
	}
			
	public long getHour() {
		return hour;
	}
	public long getMinute() {
		return minute;
	}
	public long getSecond() {
		return second;
	}	
}
