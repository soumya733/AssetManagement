package com.asset.assetmanagement1.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="requestasset")
public class RequestAssets implements Serializable{

	@Id
	@GenericGenerator(name = "request_auto", strategy = "increment")
	@GeneratedValue(generator ="request_auto")
	
	@Column(name="id")
	private long id;
	
	@Column(name="request_date")
	private String Requestdate;
	
	@Column(name="approve_date")
	private String Approvedate;
	
	
	@Column(name="status")
	private String Status;
	
	
	@Column(name="comment")
	private String Comment;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private Employee employee_details;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "asset_id")
	private Assets assets;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRequestdate() {
		return Requestdate;
	}

	public void setRequestdate(String requestdate) {
		Requestdate = requestdate;
	}

	public String getApprovedate() {
		return Approvedate;
	}

	public void setApprovedate(String approvedate) {
		Approvedate = approvedate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public Employee getEmployee_details() {
		return getEmployee_details();
	}

	public void setUser_details(Employee employee_details) {
		this.employee_details = employee_details;
	}

	public Assets getAssets() {
		return assets;
	}

	public void setAssets(Assets assets) {
		this.assets = assets;
	}

	@Override
	public String toString() {
		return "RequestAssets [id=" + id + ", Requestdate=" + Requestdate + ", Approvedate=" + Approvedate + ", Status="
				+ Status + ", Comment=" + Comment + ", user_details=" + employee_details + ", assets=" + assets + "]";
	}
		

}
