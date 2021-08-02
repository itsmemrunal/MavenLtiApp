package com.lti.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
public class Department //MODEL,VO,TO,Bean,POJO, Persistent class 
{

	private int deptno;
	private String deptname;
	private String location;
	
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptname=" + deptname + ", location=" + location + "]";
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Department(int deptno, String deptname, String location) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.location = location;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}*/

@Entity
@Table(name="department123")
public class Department //MODEL,VO,TO,Bean,POJO, Persistent class 
{

	@Id
	@Column(name="deptno")
	private int deptno;
	
	@Column(name="deptname")
	private String deptname;
	
	@Column(name="location")
	private String location;
	
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptname=" + deptname + ", location=" + location + "]";
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Department(int deptno, String deptname, String location) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.location = location;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
