package com.lqm.web.vo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.List;

@Data
public class Order {

    @Excel(name = "订单编号")
    private String orderCode;


    @Excel(name = "订单时间")
    private String orderDate;

    @ExcelCollection(name = "商品")
    private List<Goods> goods;
}
