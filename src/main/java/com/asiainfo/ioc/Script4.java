package com.asiainfo.ioc;

/**
 * 剧本
 *
 * @author zhangzhiwang
 * @date 2019年1月24日 下午11:31:13
 */
public class Script4 implements ActorInjection{
	private Master master;

	// 注入方式3：接口注入。和属性注入没有什么本质的区别，而且还增加了一个接口，一般不用此种方式。
	public void injectActor(Master m) {
		master = m;
	}
	
	public void saySth() {
		master.say();
	}
}
