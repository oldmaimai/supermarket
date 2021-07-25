package com.huaan.supercash.dao.mapper;

import com.huaan.supercash.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {
    Goods selectByQrcode(String qrcode);
}
