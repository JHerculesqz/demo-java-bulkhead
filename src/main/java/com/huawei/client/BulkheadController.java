package com.huawei.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class BulkheadController {
	// #region Fields

	@Autowired
	public BulkheadService bulkheadService;

	// #endregion

	// #region hello

	/**
	 * 注册时，保存用户信息<br>
	 * 
	 * @param oUser
	 */
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return bulkheadService.hello();
	}

	// #endregion
}
