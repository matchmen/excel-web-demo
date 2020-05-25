package com.lqm.web.controller;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.lqm.web.excel.ExcelResolver;
import com.lqm.web.vo.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

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

}
