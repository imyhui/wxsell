package com.imyhui.service.impl;

import com.imyhui.dataobject.OrderDetail;
import com.imyhui.dataobject.ProductInfo;
import com.imyhui.dto.OrderDTO;
import com.imyhui.enums.ResultEnum;
import com.imyhui.exception.SellException;
import com.imyhui.repository.OrderDetailRespository;
import com.imyhui.service.OrderService;
import com.imyhui.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Class OrderServiceImpl
 *
 * @author lyh
 * @date 18/8/4
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderDetailRespository orderDetailRespository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO);

        //1. 查询商品
        for (OrderDetail orderDetail: orderDTO.getOrderDetailList()) {
            ProductInfo productInfo = productService.findOne(orderDetail.getProductId());
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            //2. 计算订单总价
            orderAmount = orderDetail.getProductPrice()
                    .multiply(new BigDecimal(orderDetail.getProductQuantity()))
                    .add(orderAmount);
            // 订单详情入库

//            orderDetail.setDetailId();
//            orderDetail.setOrderId();
            orderDetailRespository.save(orderDetail);
        }


        //3. 写入数据库

        //4. 扣库存

        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
