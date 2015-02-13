package com.group7.sclub;

public class EventCause {
	
	import javax.persistence.Embeddable;
	import javax.persistence.Entity; 
	import javax.persistence.Id;
	import javax.persistence.IdClass;
	import javax.persistence.Table;
	
	/**
	 * This class describe the
	 * failure cause within the Event Type.
	 * 
	 * @author giovanni
	 */
	
	@Entity 
	@Table(name="Event_Cause")
	public class EventCause{
		
		
		@Id
		@Column(name="Cause Code")
		private int CauseCode;
		
		@Id
		@Column(name="Event Id")
		private int eventId;
		
		@Column(name="Description")
		private String discription;
		
		

		public int getEventCode() {
			return eventCode;
		}

		public void setEventCode(int eventCode) {
			this.eventCode = eventCode;
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
