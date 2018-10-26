package com.stackroute.keepnote.model;

//
import org.hibernate.annotations.Type;


import javax.persistence.*;
import java.time.LocalDateTime;

/*
 * The class "Note" will be acting as the data model for the note Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 */
@Entity
@Table(name = "Note")
public class Note {
	@Id
	@Column(name = "Id",nullable = false)
	private int NoteId;

	@Column(name = "Title",nullable = false)
	private String noteTilte;
	@Column(name = "Content",nullable = false)
	private String noteContent;
	@Column(name = "Status",nullable = false)
	private String noteStatus;

	@Column(name = "JOINING_DATE", nullable = false)

	public LocalDateTime dateTimeNow;

	public Note() {

	}

	public Note(int id,String noteTitle, String noteContent, String noteStatus, LocalDateTime dateTimeNow) {
		this.NoteId =id;
		this.noteTilte = noteTitle;
		this.noteContent = noteContent;
		this.noteStatus = noteStatus;
		this.dateTimeNow = dateTimeNow;
		System.out.println("in const"+id+noteTitle+noteContent+noteStatus+dateTimeNow);
	}

	public int getNoteId() {

		return NoteId;
	}

	public String getNoteTitle() {

		return noteTilte;
	}

	public String getNoteContent() {

		return noteContent;
	}

	public String getNoteStatus() {

		return noteStatus;
	}

	public void setNoteId(int parseInt) {
	 	this.NoteId= parseInt;

	}

	public void setNoteTitle(String parameter) {
		this.noteTilte =parameter;

	}

	public void setNoteContent(String parameter) {
		this.noteContent =parameter;
	}

	public void setNoteStatus(String parameter) {
		this.noteStatus =parameter;

	}

	public void setCreatedAt(LocalDateTime now) {
		this.dateTimeNow =now;

	}
	@Override
	public String toString() {
		return +NoteId+","+noteStatus+","+noteContent+","+noteStatus;
	}

}
