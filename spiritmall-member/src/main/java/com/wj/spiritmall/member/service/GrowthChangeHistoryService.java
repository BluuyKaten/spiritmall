package com.wj.spiritmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wj.common.utils.PageUtils;
import com.wj.spiritmall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author wj
 * @email asd1808660458@gmail.com
 * @date 2025-08-29 17:47:48
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

