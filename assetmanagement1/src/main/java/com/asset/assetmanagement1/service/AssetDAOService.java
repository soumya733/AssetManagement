package com.asset.assetmanagement1.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.asset.assetmanagement1.bean.Assets;
import com.asset.assetmanagement1.exception.AssetNotFoundException;
import com.asset.assetmanagement1.model.AssetsDTO;
@Repository
@Transactional
public interface AssetDAOService {
	public Assets createAsset(AssetsDTO assetsdto);

	public Assets getAssets(Long AssetsId) throws AssetNotFoundException;

	public List<Assets> list();
   
	
}

