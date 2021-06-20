package com.asset.assetmanagement1.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asset.assetmanagement1.bean.Assets;
import com.asset.assetmanagement1.exception.AssetNotFoundException;
import com.asset.assetmanagement1.model.AssetsDTO;
import com.asset.assetmanagement1.service.AssetDAOService;

@RestController

public class AssetsController {
@Autowired
  AssetDAOService assetDAOservice;
    
@GetMapping("/assets")
public List<Assets> getAllAssets(){
	return assetDAOservice.list();
}

@PostMapping("/create")
public Assets createAsset (@Valid @RequestBody AssetsDTO assetsDTO){
	return assetDAOservice.createAsset(assetsDTO);
}

@GetMapping("assets/{AssetsId}")
public Assets getAssets (@PathVariable Long AssetsId) throws AssetNotFoundException{
	return assetDAOservice.getAssets(AssetsId);
}





}
