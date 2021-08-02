package com.lti.mapping;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*
@Entity
@Table(name="StudentData")
public class Student {

	@Id
	private int studid;
	
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="StudentCourse")
	private Course course;

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studid, String name, Course course) {
		super();
		this.studid = studid;
		this.name = name;
		this.course = course;
	}
	
}
*/

/*
//one to many
@Entity
@Table(name="StudentData")
public class Student {

	@Id
	@Column(name="studentid")
	private int studid;
	
	@Column(name="studentname")
	private String name;
	
	@Column(name="gender")
	private String gender;

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student(int studid, String name, String gender) {
		super();
		this.studid = studid;
		this.name = name;
		this.gender = gender;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
*/

//many to many

@Entity
@Table(name="StudentData")
public class Student {

	@Id
	@Column(name="studentid")
	private int studid;
	
	@Column(name="studentname")
	private String name;
	
	@Column(name="gender")
	private String gender;

	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(name="SMCDetails", joinColumns= {@JoinColumn(referencedColumnName="studentid")},
			inverseJoinColumns= {@JoinColumn(referencedColumnName="courseid")})
	private Set<Course> courses;
	
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	
	
	
	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student(int studid, String name, String gender) {
		super();
		this.studid = studid;
		this.name = name;
		this.gender = gender;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}