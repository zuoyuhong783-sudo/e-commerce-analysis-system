package com.example.ecommerce.service;

import com.example.ecommerce.vo.OrderReportVO;
import com.example.ecommerce.vo.SalesTop10ReportVO;
import com.example.ecommerce.vo.TurnoverReportVO;
import com.example.ecommerce.vo.UserReportVO;

import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;

public interface ReportService {


    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);


    UserReportVO getUserStatistics(LocalDate begin, LocalDate end);


    OrderReportVO getOrderStatistics(LocalDate begin, LocalDate end);


    SalesTop10ReportVO getSalesTop10(LocalDate begin, LocalDate end);


    void exportBusinessData(HttpServletResponse response);
}
