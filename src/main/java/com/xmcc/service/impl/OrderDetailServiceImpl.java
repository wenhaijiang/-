package com.xmcc.service.impl;

import com.xmcc.dao.AbstractBatchDao;
import com.xmcc.entity.OrderDetail;
import com.xmcc.service.OrderDetailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class OrderDetailServiceImpl extends AbstractBatchDao<OrderDetail> implements OrderDetailService {


    @Override
    @Transactional //增删改触发事务
    public void  batchInsert(List<OrderDetail> orderDetailList){
        super.batchInsert(orderDetailList);
    }
}
