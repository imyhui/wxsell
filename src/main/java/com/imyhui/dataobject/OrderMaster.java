package com.imyhui.dataobject;

import com.imyhui.enums.OrderStatusEnum;
import com.imyhui.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Class OrderMaster 买家主表
 *
 * @author lyh
 * @date 18/6/14
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /** 订单id */
    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    /** 订单状态，默认0新下单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态，默认0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;

//    /** 数去库对应时会忽略
//     * 但逻辑会混乱 因此创建dto
//     * */
//    @Transient
//    private List<OrderDetail> orderDetailList;

}
