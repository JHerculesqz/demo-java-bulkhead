#设计目标#
 
实现对服务中线程的管控。
	
#实现原理#
	
提供一个的工具类用来新启线程，业务侧调用此工具类创建的线程都在BU线程池中，系统侧创建的线程则都在sys线程池中，保证二者互不干扰。

	调用方式如下
	// #region hello

	public static String hello() {
		// 1.init
		ThreadPoolUtils.getProvider().init(2, 4, 3, 3, 2, 4, 3, 3);

		// 1.BU new Thread
		ThreadPoolUtils.getProvider().submit4Bu(new Runnable() {
			@Override
			public void run() {
				System.out.println("BU ThreadPool!");
			}
		});
		// 2.sys new Thread
		ThreadPoolUtils.getProvider().submit4Sys(new Runnable() {
			@Override
			public void run() {
				System.out.println("SYS ThreadPool!");
			}
		});
		return "ok";
	}

	// #endregion

#reference#
	
	《Java并发编程》