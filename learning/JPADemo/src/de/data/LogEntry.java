package de.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LogEntry {

	@Id
	private Integer id;
	
	private Date date;
	private String message;

	public LogEntry(Date d, String message) {
		this.date = d;
		this.message = message;
	}

}
