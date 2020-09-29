package com.lqm.web;

import com.lqm.web.excel.ExcelResolver;
import com.lqm.web.vo.Goods;
import com.lqm.web.vo.Order;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Liqm
 * @Date 2020/9/8 0008
 */
@SpringBootTest(classes = ExcelApplication.class)
public class WebTest {

    private String path = "D:/file/";

    @Test
    public void test() throws FileNotFoundException {

        Order order = new Order();
        order.setOrderCode("1111111");
        order.setOrderDate("2020-09-09");
        List<Goods> goodsList = new ArrayList<>();
        order.setGoods(goodsList);
        goodsList.add(new Goods("玉米", "1212"));
        goodsList.add(new Goods("土豆", "1213"));
        ExcelResolver.writeExcel(Order.class,goodsList,new FileOutputStream(path));
        System.out.println("完成");
    }



}
