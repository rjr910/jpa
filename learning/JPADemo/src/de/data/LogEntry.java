package de.data;

import java.util.Date;

@Entity
public class LogEntry {

	private Date date;
	private String message;

	public LogEntry(Date d, String message) {
		this.date = d;
		this.message = message;
	}

}