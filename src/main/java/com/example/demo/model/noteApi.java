package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class noteApi {
	@Override
	public String toString() {
		return "bookApi [Id=" + Id + ", Main_Title=" + Main_Title + ", Author=" + Author + ", Date=" + Date
				+ ", Content=" + Content + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getMain_Title() {
		return Main_Title;
	}
	public void setMain_Title(String title) {
		Main_Title= title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	@Id
	@GeneratedValue
	private int Id;
	private  String Main_Title;
	private String Author;
	private String Date;
	private  String Content;
}
