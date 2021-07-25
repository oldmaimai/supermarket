package com.huaan.supercash;

import com.huaan.supercash.dao.mapper.GoodsMapper;
import com.huaan.supercash.entity.Goods;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SuperCashApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SuperCashApplication.class, args);
		GoodsMapper bean = run.getBean(GoodsMapper.class);
		Goods x = bean.selectByQrcode("00000001");
		System.out.println(x);
	}
}
