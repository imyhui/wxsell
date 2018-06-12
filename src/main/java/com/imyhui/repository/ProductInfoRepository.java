package com.imyhui.repository;

import com.imyhui.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Class ProductInfoRepository
 *
 * @author lyh
 * @date 18/6/12
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
