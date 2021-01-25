package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author HaveDate
 * @email 734873995@qq.com
 * @date 2020-12-31 23:28:18
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
