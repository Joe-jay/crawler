package com.joe.crawler.stock.controller;

import com.joe.crawler.stock.demo.StockBaseVO;
import com.joe.crawler.stock.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class InputController {
    private final Logger logger = LoggerFactory.getLogger(InputController.class);
    @Resource
    private StockService stockService;
    @GetMapping("/checkHealth")
    public String tranfer(){
        return "My Application is alive.";
    }
    @GetMapping("/getStokBase")
    public StockBaseVO queryStockBase(@RequestParam("name") String name){
        logger.info("requert param:"+name);
        return stockService.queryStockBaseByName(name);
    }
}
