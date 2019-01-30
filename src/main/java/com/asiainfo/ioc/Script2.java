package com.asiainfo.ioc;

/**
 * 剧本
 *
 * @author zhangzhiwang
 * @date 2019年1月24日 下午11:16:28
 */  
public class Script2 {
	private static Master master;// 此时剧本已经完全不用关心角色由具体的谁去演。控制反转就是将对被调用接口（大师）实现类（成龙）的控制移交到第三方（导演）去完成。

	// 注入方式1:通过构造方法来注入
	public Script2(Master m) {
		master = m;
	}

	public Script2() {
	}
	
	public void saySth() {
		master.say();
	}

}
