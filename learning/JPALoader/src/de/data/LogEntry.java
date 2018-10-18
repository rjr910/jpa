package de.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogEntry implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	private Date date;
	private String message;

	public LogEntry() {}
	
	
	public LogEntry(Date d, String message) {
		this.date = d;
		this.message = message;
	}


	@Override
	public String toString() {
		return "LogEntry [date=" + date + ", message=" + message + "]";
	}
	
	

}
