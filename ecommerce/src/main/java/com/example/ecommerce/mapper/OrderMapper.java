package com.example.ecommerce.mapper;

import com.example.ecommerce.dto.GoodsSalesDTO;
import org.apache.ibatis.annotations.Mapper;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {


    Integer countByMap(Map<String, Object> map);


    Double sumByMap(Map<String, Object> map);
    

    List<GoodsSalesDTO> getSalesTop10(LocalDateTime begin, LocalDateTime end);
}
