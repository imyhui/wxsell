package com.imyhui.service;

import com.imyhui.dataobject.ProductCategory;

import java.util.List;

/**
 * Class CategoryService
 *
 * @author lyh
 * @date 18/6/11
 */
public interface CategoryService {


    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
