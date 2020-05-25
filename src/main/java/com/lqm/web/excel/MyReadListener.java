package com.lqm.web.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyReadListener<T> implements ReadListener<T>{

    private List<T> list = new ArrayList();

    public List<T> getList() {
        return list;
    }

    @Override
    public void invoke(Object data, AnalysisContext context) {
        list.add((T)data);
    }

    @Override
    public void onException(Exception exception, AnalysisContext context) throws Exception {
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }

    @Override
    public boolean hasNext(AnalysisContext context) {
        return true;
    }

    @Override
    public void invokeHead(Map headMap, AnalysisContext context) {

    }
}
