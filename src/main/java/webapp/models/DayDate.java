package webapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "day_date")
public class DayDate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private Long dateTimeLong;
	private int year;
	private int month;
	private int day;
	private boolean valid;
	private int date;
	@OneToOne(targetEntity = CreationDateTime.class)
	private CreationDateTime creationDateTime;

	public CreationDateTime getCreationDateTime() {
		return creationDateTime;
	}


	public void setCreationDateTime(CreationDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}


	public DayDate() {
		// TODO Auto-generated constructor stub
	}	
	
	
	public DayDate(Long dateTimeLong, int year, int month, int day, boolean valid, int date) {
		
		this.dateTimeLong = dateTimeLong;
		this.year = year;
		this.month = month;
		this.day = day;
		this.valid = valid;
		this.date = date;
	}






	public Long getDateTimeLong() {
		return dateTimeLong;
	}
	public void setDateTimeLong(Long dateTimeLong) {
		this.dateTimeLong = dateTimeLong;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "DayDate [ dateTimeLong=" + dateTimeLong + ", year=" + year + ", month=" + month + ", day="
				+ day + ", valid=" + valid + ", date=" + date +  "]";
	}
}
