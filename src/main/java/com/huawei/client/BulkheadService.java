package com.huawei.client;

import org.springframework.stereotype.Component;

import com.huawei.client.provider.MainProvider;

@Component
public class BulkheadService {

	// #region hello

	public String hello() {
		return MainProvider.hello();
	}

	// #endregion
}
