package com.group7.sclub.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class describe the failure cause within the Event Type.
 * 
 * @author giovanni
 */

@Entity
@Table(name = "Event_Cause")
public class EventCause {

	@Id
	@Column(name = "Cause Code")
	private int CauseCode;

	@Id
	@Column(name = "Event Id")
	private int eventId;

	@Column(name = "Description")
	private String discription;

	public int getEventCode() {
		return CauseCode;
	}

	public void setEventCode(int eventCode) {
		this.CauseCode = eventCode;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

}
