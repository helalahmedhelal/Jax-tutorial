package com.project.Restproject.model;



public class messages {
  private long id;
  private String name;
  private String author;
  
public messages() {}	

public messages(int id, String name, String author) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
  
	

}
