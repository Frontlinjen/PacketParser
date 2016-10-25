package IR;

public class Timestamp {

	private int hour;
	private int minutes;
	private int seconds;
	private int miliseconds;
	
	public Timestamp(int hour, int minutes, int seconds, int miliseconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
		this.miliseconds = miliseconds;
	}
	
	public Timestamp(String st){
		String[] ts = st.split("[.:]");
		hour = Integer.parseInt(ts[0]);
		minutes = Integer.parseInt(ts[1]);
		seconds = Integer.parseInt(ts[2]);
		miliseconds = Integer.parseInt(ts[3]);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMiliseconds() {
		return miliseconds;
	}

	public void setMiliseconds(int miliseconds) {
		this.miliseconds = miliseconds;
	}	
}
