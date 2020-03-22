package com.joe.crawler.stock.service;

import com.joe.crawler.stock.dao.IStockDao;
import com.joe.crawler.stock.demo.StockBaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StockService {
    @Autowired
    private IStockDao stockDao;
    public StockBaseVO queryStockBaseByName(String name) {
        return stockDao.getStockBaseByName(name);
    }
}
