package com.imyhui.repository;

import com.imyhui.dataobject.OrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Class OrderDetailRespository
 *
 * @author lyh
 * @date 18/6/14
 */
public interface OrderDetailRespository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
