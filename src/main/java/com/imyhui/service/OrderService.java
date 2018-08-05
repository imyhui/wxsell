package com.imyhui.service;

import com.imyhui.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Class OrderService
 *
 * @author lyh
 * @date 18/8/4
 */
public interface OrderService {

    /** 创建订单*/
    OrderDTO create(OrderDTO orderDTO);

    /** 查询单个 */
    OrderDTO findOne(String orderId);

    /** 查询列表 */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);


    /** 取消 */
    OrderDTO cancel(OrderDTO orderDTO);

    /** 完成 */

    OrderDTO finish(OrderDTO orderDTO);

    /** 支付 */
    OrderDTO paid(OrderDTO orderDTO);

}
