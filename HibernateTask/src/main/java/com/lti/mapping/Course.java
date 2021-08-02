package com.lti.mapping;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/*
@Entity
@Table(name="CourseDetails")
public class Course {

	@Id
	//if column annotation is not specified then var name is taken as column
	private int courseid;
	private String courseName;
	private int duration;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Course(int courseid, String courseName, int duration) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.duration = duration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
*/

/*
//one to many
@Entity
@Table(name="CourseDetails")
public class Course {

	@Id
	//if column annotation is not specified then var name is taken as column
	private int courseid;
	private String courseName;
	private int duration;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="course_id")
	private Set<Student> students;
	
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Course(int courseid, String courseName, int duration) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.duration = duration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}*/

//many to many
@Entity
@Table(name="CourseDetails")
public class Course {

	@Id
	//if column annotation is not specified then var name is taken as column
	private int courseid;
	private String courseName;
	private int duration;
	
	@ManyToMany
	private Set<Student> students;
	
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Course(int courseid, String courseName, int duration) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.duration = duration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

