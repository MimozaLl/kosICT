package com.example.kosict;

public class Day {

	private String title;
	private String timeStart;

	private String speaker;
	private String description;
	private String room;

	public Day(String tit, String tS, String tE, String sp, String de, String ro) {
		setTitle(tit);
		setTimeStart(tS);

		setSpeaker(sp);
		setDescription(de);
		setRoom(ro);
	}

	// Getters and Setters for class variables

	public String getTitlef() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

}
