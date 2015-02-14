package com.group7.sclub.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * email is the primary key so therefore will be unique
 * type is an int: 
 * 		1. Admin
 * 		2. Support Engineer
 * 		3. Customer Service rep
 * 
 * @author marc
 *
 */
@Entity
@Table(name="discs")
public class User {
	
	//Class varaibles
	@Id
	private String email;
	private String password;
	private int type; 
	

}
