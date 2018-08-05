package com.imyhui.dto;

import com.imyhui.dataobject.OrderDetail;
import com.imyhui.enums.OrderStatusEnum;
import com.imyhui.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Class OrderDTO
 *
 * @author lyh
 * @date 18/8/4
 */
@Data
public class OrderDTO {

    /** 订单id */
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    /** 订单状态，默认0新下单*/
    private Integer orderStatus;

    /** 支付状态，默认0未支付 */
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
