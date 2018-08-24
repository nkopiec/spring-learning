package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DateTime {

	@Id
	private long id;
	
	private java.sql.Date data;
	private java.sql.Time time;
	private java.sql.Timestamp timestamp;
	
	@Temporal(TemporalType.DATE)
	private java.util.Date utilTime;
	
	@Temporal(TemporalType.TIME)
	private java.util.Date utilTimestamp;
	
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date utilDate;
	
	@Temporal(TemporalType.DATE)
	private java.util.Calendar utilCalendar;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public java.sql.Date getData() {
		return data;
	}
	public void setData(java.sql.Date data) {
		this.data = data;
	}
	public java.sql.Time getTime() {
		return time;
	}
	public void setTime(java.sql.Time time) {
		this.time = time;
	}
	public java.sql.Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(java.sql.Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public java.util.Date getUtilTime() {
		return utilTime;
	}
	public void setUtilTime(java.util.Date utilTime) {
		this.utilTime = utilTime;
	}
	public java.util.Date getUtilTimestamp() {
		return utilTimestamp;
	}
	public void setUtilTimestamp(java.util.Date utilTimestamp) {
		this.utilTimestamp = utilTimestamp;
	}
	public java.util.Date getUtilDate() {
		return utilDate;
	}
	public void setUtilDate(java.util.Date utilDate) {
		this.utilDate = utilDate;
	}
	public java.util.Calendar getUtilCalendar() {
		return utilCalendar;
	}
	public void setUtilCalendar(java.util.Calendar utilCalendar) {
		this.utilCalendar = utilCalendar;
	}
	
}
