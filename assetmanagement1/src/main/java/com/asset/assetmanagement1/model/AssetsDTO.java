package com.asset.assetmanagement1.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;


public class AssetsDTO implements Serializable {
         @NotBlank(message="assetname should not be blank")
		private String Assetname;
		@NotBlank(message="category should not be blank")
		private String Category;

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
			return "AssetsDTO [Assetname=" + Assetname + ", Category=" + Category + "]";
		}
		
		
		

		

		
	}

