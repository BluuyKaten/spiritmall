package com.wj.spiritmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.common.utils.PageUtils;
import com.wj.spiritmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wj
 * @email asd1808660458@gmail.com
 * @date 2025-08-11 17:00:43
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

