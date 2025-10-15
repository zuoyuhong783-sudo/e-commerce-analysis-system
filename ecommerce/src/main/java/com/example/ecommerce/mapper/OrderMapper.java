package com.example.ecommerce.mapper;

import com.example.ecommerce.dto.GoodsSalesDTO;
import org.apache.ibatis.annotations.Mapper;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    /**
     * 根据动态条件统计订单数量
     * @param map
     * @return
     */
    Integer countByMap(Map<String, Object> map);

    /**
     * 根据动态条件统计订单金额
     * @param map
     * @return
     */
    Double sumByMap(Map<String, Object> map);
    
    /**
     * 统计指定时间区间内的销量排名前十
     * @param begin
     * @param end
     * @return
     */
    List<GoodsSalesDTO> getSalesTop10(LocalDateTime begin, LocalDateTime end);
}
