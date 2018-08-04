package com.imyhui.repository;

import com.imyhui.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Class OrderDetailRespositoryTest
 *
 * @author lyh
 * @date 18/7/31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRespositoryTest {

    @Autowired
    private OrderDetailRespository respository;

    @Test
    public void saveTesT() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234567890");
        orderDetail.setOrderId("11111111");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("11111112");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(3);

        OrderDetail result = respository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() throws Exception{
        List<OrderDetail> orderDetails = respository.findByOrderId("11111112");
        Assert.assertNotEquals(0,orderDetails.size());
    }
}