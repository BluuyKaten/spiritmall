package com.wj.spiritmall.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wj.spiritmall.product.entity.BrandEntity;
import com.wj.spiritmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SpiritmallProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("白酒1");
//        brandEntity.setName("白酒1");
//        brandService.save(brandEntity);
//        System.out.println("保存成功....");

//        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });

    }

}
