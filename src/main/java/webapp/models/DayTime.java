package webapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "day_time")
public class DayTime implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private int dayTime;
	private int hour;
	private int minute;
	private int second;
	private Long dateTimeLong;
	@OneToOne(targetEntity = CreationDateTime.class)
	private CreationDateTime creationDateTime;
	
	
	
	public CreationDateTime getCreationDateTime() {
		return creationDateTime;
	}




	public void setCreationDateTime(CreationDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}




	public DayTime() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public DayTime(int dayTime, int hour, int minute, int second, Long dateTimeLong) {
		
		this.dayTime = dayTime;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.dateTimeLong = dateTimeLong;
	}




	public int getDayTime() {
		return dayTime;
	}
	public void setDayTime(int dayTime) {
		this.dayTime = dayTime;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public Long getDateTimeLong() {
		return dateTimeLong;
	}
	public void setDateTimeLong(Long dateTimeLong) {
		this.dateTimeLong = dateTimeLong;
	}
	
	@Override
	public String toString() {
		return "DayTime [dayTime=" + dayTime + ", hour=" + hour + ", minute=" + minute + ", second="
				+ second + ", dateTimeLong=" + dateTimeLong +  "]";
	}
}
