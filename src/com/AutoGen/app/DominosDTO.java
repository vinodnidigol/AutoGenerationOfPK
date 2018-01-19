package com.AutoGen.app;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="dominos_table")
@NamedQuery(name="getByNoOfOrders",
query="from DominosDTO where branch=:branch")

public class DominosDTO implements Serializable {
	@Column(name="branch")
	private String branch;
	@Column(name="contactno")
	private long contactno;
	@Id
	@GenericGenerator(name="generator" ,
	strategy="increment")
	@GeneratedValue(generator="generator")
	@Column(name="noOforders")
	private int noOforders;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public int getNoOforders() {
		return noOforders;
	}

	public void setNoOforders(int noOforders) {
		this.noOforders = noOforders;
	}
	public DominosDTO() {
		
	}
}
