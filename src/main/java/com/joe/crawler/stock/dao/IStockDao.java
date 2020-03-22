package com.joe.crawler.stock.dao;

import com.joe.crawler.stock.demo.StockBaseVO;


public interface IStockDao  {
    StockBaseVO getStockBaseByName(String name);
}
