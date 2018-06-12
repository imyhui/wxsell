package com.imyhui.service.impl;

import com.imyhui.dataobject.ProductInfo;
import com.imyhui.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Class ProductServiceImplTest
 *
 * @author lyh
 * @date 18/6/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;


    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productService.findOne("100000");
        Assert.assertEquals("100000", productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
//        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0, productInfoPage.getTotalElements());

    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("100001");
        productInfo.setProductName("香辣鸡腿堡");
        productInfo.setProductPrice(new BigDecimal(9.0));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("凡仔套餐");
        productInfo.setProductIcon("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1528815011224&di=c0c297e825bf0f7b7a49535695596011&imgtype=0&src=http%3A%2F%2Fimg1.cache.netease.com%2Fcatchpic%2F1%2F18%2F1859E997AA2BDF36F107901DA394C4E1.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

}