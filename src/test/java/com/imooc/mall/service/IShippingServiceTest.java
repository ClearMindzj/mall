package com.imooc.mall.service;

import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.enums.ResponseEnum;
import com.imooc.mall.form.ShippingForm;
import com.imooc.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by 廖师兄
 */
@Slf4j
public class IShippingServiceTest extends MallApplicationTests {

	@Autowired
	private IShippingService shippingService;

	private Integer uid = 2;

	private ShippingForm form;

	private Integer shippingId;

	@Before
	public void before() {
		ShippingForm form = new ShippingForm();
		form.setReceiverName("郑杰");
		form.setReceiverAddress("南京");
		form.setReceiverCity("北京");
		form.setReceiverMobile("18851752205");
		form.setReceiverPhone("010123456");
		form.setReceiverProvince("江苏 ");
		form.setReceiverDistrict("海淀区");
		form.setReceiverZip("000000");
		this.form = form;


	}

	public void add() {
		ResponseVo<Map<String, Integer>> responseVo = shippingService.add(uid, form);
		log.info("result={}", responseVo);
		this.shippingId = responseVo.getData().get("shippingId");
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}
	@Test
	public void delete() {
		ResponseVo responseVo = shippingService.delete(uid, shippingId);
		log.info("result={}", responseVo);
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}

	@Test
	public void update() {
		form.setReceiverCity("杭州");
		ResponseVo responseVo = shippingService.update(uid, 5, form);
		log.info("result={}", responseVo);
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}

	@Test
	public void list() {
		ResponseVo responseVo = shippingService.list(uid, 1, 10);
		log.info("result={}", responseVo);
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}
}