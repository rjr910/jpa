package de.data;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GameSession {

	@Id
	@GeneratedValue
	private Long Id;
	
	private String sessionName;
	private String playerName;
	private transient ArrayList<LogEntry> sessionLog = new ArrayList<>();
	
	public GameSession(String GameSessionName, String playerName) {
		this.sessionName = GameSessionName;
		this.playerName = playerName;
		sessionLog.add(new LogEntry(new Date(), "PlayerName: " + playerName + " opened new GameSession " + GameSessionName));
	}
	
	public void join(String name) {
		sessionLog.add(new LogEntry(new Date(), "PlayerName: " + name + " joined session " + sessionName));
	}
	
	public void startGame() {
		sessionLog.add(new LogEntry(new Date(), "PlayerName: " + playerName + " started game in session " + sessionName));
	}
	
}
