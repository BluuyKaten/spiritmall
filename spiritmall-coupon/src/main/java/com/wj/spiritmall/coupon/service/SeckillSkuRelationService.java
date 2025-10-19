package com.wj.spiritmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.common.utils.PageUtils;
import com.wj.spiritmall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author wj
 * @email asd1808660458@gmail.com
 * @date 2025-08-29 17:41:09
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

