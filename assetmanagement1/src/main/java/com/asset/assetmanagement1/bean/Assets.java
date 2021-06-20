package com.asset.assetmanagement1.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assets")
public class Assets implements Serializable {

	@Id
	@GenericGenerator(name = "asset_auto", strategy = "increment")
	@GeneratedValue(generator ="asset_auto")
	

	@Column(name="asset_id")
	private long Assetid;
	
	@Column(name="asset_name")
	private String Assetname;
	
	@Column(name="category")
	private String Category;
	
	
	public long getAssetid() {
		return Assetid;
	}

	public void setAssetid(long assetid) {
		Assetid = assetid;
	}

	public String getAssetname() {
		return Assetname;
	}

	public void setAssetname(String assetname) {
		Assetname = assetname;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	

	@Override
	public String toString() {
		return "Assets [Assetid=" + Assetid + ", Assetname=" + Assetname + ", Category=" + Category + "]";
	}
}
