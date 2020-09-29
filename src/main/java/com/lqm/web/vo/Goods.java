package com.lqm.web.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

    @ExcelProperty(value = "商品名称")
    private String goodsName;

    @ExcelProperty(value = "商品编码")
    private String goodsCode;

}
