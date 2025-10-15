package com.example.ecommerce.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.Map;

@Mapper
public interface SetmealMapper {

    /**
     * 根据动态条件统计套餐数量
     * @param map
     * @return
     */
    Integer countByMap(Map<String, Object> map);
}


