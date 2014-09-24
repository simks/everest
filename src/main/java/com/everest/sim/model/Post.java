package com.everest.sim.model;

import java.util.Date;

/**
 * Created by simks on 2014. 9. 23..
 */

public class Post {
	long id;
	String writer;
	String title;
	String contents;
	Date writeDate;
	Date modifiedDate;

	public Post(Long id, String writer, String title, String contents, Date writeDate, Date modifiedDate) {
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.writeDate = writeDate;
		this.modifiedDate = modifiedDate;
	}

	public Post() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override public String toString() {
		return String.format("Post[id=%d, writer='%s', title='%s', contents='%s', writeDate='%s', modifiedDate='%s'",
			id, writer, title,contents, writeDate.toString(), modifiedDate.toString());
	}
}
