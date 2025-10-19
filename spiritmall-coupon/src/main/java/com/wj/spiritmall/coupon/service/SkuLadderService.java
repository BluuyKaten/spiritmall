package com.wj.spiritmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.common.utils.PageUtils;
import com.wj.spiritmall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author wj
 * @email asd1808660458@gmail.com
 * @date 2025-08-29 17:41:10
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

