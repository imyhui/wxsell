package com.imyhui.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author lyh
 * Created by lyh on 18/6/10.
 */
// 注解此类为实体类
@Entity
// 默认会生成全部的update
@DynamicUpdate
// lombok 的注解, 自动生成Getter，Setter，toString，构造函数等
@Data
public class ProductCategory {

    /** 类目id  注意表明自增id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer categoryId;

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
