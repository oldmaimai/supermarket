package com.huaan.supercash.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "supercash.goods")
@Data
public class GoodsProps {
    private int pageSize = 10;
}
