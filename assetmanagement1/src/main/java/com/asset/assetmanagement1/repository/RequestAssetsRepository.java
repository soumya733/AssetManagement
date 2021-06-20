package com.asset.assetmanagement1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asset.assetmanagement1.bean.RequestAssets;
@Repository
public interface RequestAssetsRepository extends JpaRepository<RequestAssets,Long>{

}
