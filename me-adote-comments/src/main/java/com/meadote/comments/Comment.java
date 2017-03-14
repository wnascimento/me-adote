package com.meadote.comments;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Valid
	@JsonIgnore
	private long petId;
	
	@NotNull
	@Valid
	@JsonIgnore
	private long ownerId;
	
	private String comment;
	private long posted;
	
	public Comment(long id, long petId, long ownerId, String comment) {
		this();
		this.id = id;
		this.petId = petId;
		this.ownerId = ownerId;
		this.comment = comment;
	}

	public long getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public long getPosted() {
		return posted;
	}
	
	Comment() {
		this.posted = new Date().getTime();
	}
	
}