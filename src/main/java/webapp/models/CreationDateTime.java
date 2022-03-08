package webapp.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "creation_time")
public class CreationDateTime implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(targetEntity=DayDate.class,cascade=CascadeType.ALL)  
	private DayDate dayDate;
	@OneToOne(targetEntity=DayTime.class,cascade=CascadeType.ALL)  
	private DayTime dayTime;
	private long time;
	@SerializedName(value = "null")
	private boolean isNull ;
	
	@OneToOne(targetEntity = Product.class)
	private Product product;
	
	public Product getProduct() {
		return product;
	}




	public void setProduct(Product product) {
		this.product = product;
	}




	public CreationDateTime() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public CreationDateTime(DayDate dayDate, DayTime dayTime, long time, boolean isNull) {
		
		this.dayDate = dayDate;
		this.dayTime = dayTime;
		this.time = time;
		this.isNull = isNull;
	}




	public DayDate getDayDate() {
		return dayDate;
	}
	public void setDayDate(DayDate dayDate) {
		this.dayDate = dayDate;
	}
	public DayTime getDayTime() {
		return dayTime;
	}
	public void setDayTime(DayTime dayTime) {
		this.dayTime = dayTime;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public boolean isNull() {
		return isNull;
	}
	public void setNull(boolean isNull) {
		this.isNull = isNull;
	}
	
	@Override
	public String toString() {
		return "CreationDateTime [dayDate=" + dayDate.toString() + ", dayTime=" + dayTime.toString() + ", time=" + time
				+ ", isNull=" + isNull + "]";
	}
}
