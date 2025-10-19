package com.wj.spiritmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.common.utils.PageUtils;
import com.wj.spiritmall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author wj
 * @email asd1808660458@gmail.com
 * @date 2025-08-11 17:00:43
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

