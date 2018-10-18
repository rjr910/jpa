package de.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Gamesession")
public class GameSession {

	@Id
	@GeneratedValue
	private Long Id;
	
	private String sessionName;
	private String playerName;
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY) //
	private List<LogEntry> sessionLog = new ArrayList<>();
	
	public GameSession() {}
	
	public GameSession(String GameSessionName, String playerName) {
		System.out.println("GameSession Constructor call");
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

	@Override
	public String toString() {
		return "GameSession [Id=" + Id + ", sessionName=" + sessionName + ", playerName=" + playerName + ", sessionLog="
				+ sessionLog + "]";
	}
	
	
	
	
	
}
