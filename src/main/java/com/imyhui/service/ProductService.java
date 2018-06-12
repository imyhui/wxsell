package com.imyhui.service;

import com.imyhui.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Class ProductService
 *
 * @author lyh
 * @date 18/6/12
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //todo 加库存

    //todo 减库存
}
