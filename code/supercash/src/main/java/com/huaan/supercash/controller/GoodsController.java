package com.huaan.supercash.controller;

import com.huaan.supercash.entity.Goods;
import com.huaan.supercash.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/goods", produces = "application/json")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/{page}")
    public List<Goods> goods(@PathVariable("page") int page) {
        return goodsService.getGoodsByPage(page);
    }
}
