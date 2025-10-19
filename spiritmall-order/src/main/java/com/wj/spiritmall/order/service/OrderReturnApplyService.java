package com.wj.spiritmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.common.utils.PageUtils;
import com.wj.spiritmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author wj
 * @email asd1808660458@gmail.com
 * @date 2025-08-29 17:54:17
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

