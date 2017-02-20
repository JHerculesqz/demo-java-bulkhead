package com.huawei.client.provider.subprovider;

import com.huawei._1_fw.component.threadpool.ThreadPoolUtils;

public class SubProvider {
	// #region hello

	public static String hello() {
		// 1.init
		ThreadPoolUtils.getProvider().init(2, 4, 3, 3, 2, 4, 3, 3);

		// 1.BU new Thread
		ThreadPoolUtils.getProvider().submit4Bu(new Runnable() {
			@Override
			public void run() {
				String strTrName = Thread.currentThread().getName();
				System.out.println(strTrName);
			}
		});

		// 2.sys new Thread
		ThreadPoolUtils.getProvider().submit4Sys(new Runnable() {
			@Override
			public void run() {
				String strTrName = Thread.currentThread().getName();
				System.out.println(strTrName);
			}
		});

		return "ok";
	}

	// #endregion
}
