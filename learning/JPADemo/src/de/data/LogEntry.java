package de.data;

import java.util.Date;

public class LogEntry {
	
	private Date date;
	private String message;
	
	public LogEntry(Date d, String message) {
		this.date = d;
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
