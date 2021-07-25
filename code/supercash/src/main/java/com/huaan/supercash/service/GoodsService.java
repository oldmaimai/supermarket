package com.huaan.supercash.service;

import com.huaan.supercash.config.GoodsProps;
import com.huaan.supercash.dao.mapper.GoodsMapper;
import com.huaan.supercash.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsService {
    @Autowired
    private GoodsProps goodsProps;

    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> getGoodsByPage(int page) {
        Map<String, Object> params = new HashMap<>();
        params.put("offset", (page - 1) * goodsProps.getPageSize());
        params.put("rows", goodsProps.getPageSize());
        return goodsMapper.goodsByPage(params);
    }
}
