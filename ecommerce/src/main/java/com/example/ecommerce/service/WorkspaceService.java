package com.example.ecommerce.service;

import com.example.ecommerce.vo.BusinessDataVO;
import com.example.ecommerce.vo.DishOverViewVO;
import com.example.ecommerce.vo.OrderOverViewVO;
import com.example.ecommerce.vo.SetmealOverViewVO;

import java.time.LocalDateTime;

public interface WorkspaceService {


    BusinessDataVO getBusinessData(LocalDateTime begin, LocalDateTime end);


    OrderOverViewVO getOrderOverView();


    DishOverViewVO getDishOverView();


    SetmealOverViewVO getSetmealOverView();

}
