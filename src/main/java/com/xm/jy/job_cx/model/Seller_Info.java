package com.xm.jy.job_cx.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @auther 方翔鸣
 * @date 2020/3/8 16:14
 */
@Data
@DynamicUpdate
@Entity
@Table(name = "seller_info")
public class Seller_Info {
    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;

    private Date createTime;

    private Date updateTime;

}
