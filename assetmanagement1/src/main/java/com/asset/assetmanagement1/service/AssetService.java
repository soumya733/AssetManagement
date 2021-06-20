package com.asset.assetmanagement1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asset.assetmanagement1.bean.Assets;

import com.asset.assetmanagement1.exception.AssetNotFoundException;

import com.asset.assetmanagement1.model.AssetsDTO;
import com.asset.assetmanagement1.repository.AssetRepository;

@Service
public class AssetService implements AssetDAOService{
@Autowired
  AssetRepository assetRepository;
@Override
public Assets createAsset(AssetsDTO assetdto) {
	Assets assets=new Assets();
	BeanUtils.copyProperties(assetdto,assets);	
	return assetRepository.save(assets);
}

@Override
public Assets getAssets(Long assetid) throws AssetNotFoundException {
	
	Optional<Assets> asset = assetRepository.findById(assetid);
	if (!asset.isPresent()) {
		throw new AssetNotFoundException("asset not found");
	} else {
		return asset.get();
	}
}

@Override
public List<Assets> list() {
	
	return (List<Assets>) assetRepository.findAll() ;
}


}
