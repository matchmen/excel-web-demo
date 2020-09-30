package com.lqm.web.controller;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.lqm.web.excel.ExcelResolver;
import com.lqm.web.utils.ExcelUtils;
import com.lqm.web.vo.Goods;
import com.lqm.web.vo.Order;
import com.lqm.web.vo.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ExcelController {
    protected static final Logger LOGGER = LoggerFactory.getLogger(ExcelController.class);

    @GetMapping("/exportExcelTemplete")
    public void exportExcelTemplete( HttpServletResponse response) {

        try {
            ServletOutputStream out = response.getOutputStream();

            String fileName = new String("用户导入模板".getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);

            response.setContentType("multipart/form-data");

            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ExcelTypeEnum.XLSX.getValue());

            ExcelResolver.writeExcel(UserInfo.class, new ArrayList(), out);

            out.flush();

        } catch (IOException e) {
            LOGGER.error("下载Excel文件报错,Exception:{}", e);
        }
    }

    @GetMapping("/download")
    public void download( HttpServletResponse response) {

        List<Order> orderList = new ArrayList<>();

        Order order = new Order();
        order.setOrderCode("111aaa 1111");
        order.setOrderDate("2020-09-09");
        List<Goods> goodsList = new ArrayList<>();
        order.setGoods(goodsList);
        goodsList.add(new Goods("玉米", "1212"));
        goodsList.add(new Goods("土豆", "1213"));
        goodsList.add(new Goods("豆", "1213"));

        try {

            ExcelUtils.exportExcel(orderList, "订单", "订单", Order.class, "订单", response);

        } catch (IOException e) {
            LOGGER.error("下载Excel文件报错,Exception:{}", e);
        }
    }


}
