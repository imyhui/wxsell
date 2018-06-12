package com.imyhui.repository;

import com.imyhui.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Class ProductInfoRepositoryTest
 *
 * @author lyh
 * @date 18/6/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("100000");
        productInfo.setProductName("烤冷面");
        productInfo.setProductPrice(new BigDecimal(6.0));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("夜宵必备");
        productInfo.setProductIcon("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1528815011224&di=c0c297e825bf0f7b7a49535695596011&imgtype=0&src=http%3A%2F%2Fimg1.cache.netease.com%2Fcatchpic%2F1%2F18%2F1859E997AA2BDF36F107901DA394C4E1.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result =  repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }

}