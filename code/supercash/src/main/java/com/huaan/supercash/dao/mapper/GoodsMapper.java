package com.huaan.supercash.dao.mapper;

import com.huaan.supercash.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsMapper {
    Goods selectByQrcode(String qrcode);

    List<Goods> goodsByPage(Map<String, Object> params);
}
