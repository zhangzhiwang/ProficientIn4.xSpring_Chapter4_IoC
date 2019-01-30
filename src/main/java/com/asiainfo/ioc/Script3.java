package com.asiainfo.ioc;

/**
 * 剧本
 *
 * @author zhangzhiwang
 * @date 2019年1月24日 下午11:31:13
 */
public class Script3 {
	private Master master;

	// 注入方式2：通过setter方法注入。通过setter方法注入和通过构造器注入的方式不一样的是：前者是需要的时候才注入，后者是不管需不需要都注进来。
	// 在本例中，大师很可能是个客串的角色，他说台词的时候很可能就在片尾，而剧本的生命周期是从电影正片开始到正片结束，如果通过剧本的构造器注入大师这个角色，那么正片一开始大师就已经被注入了进来，到片尾时才有用，是不是不恰当？到片尾时调用剧本的setter方法多好！
	public void setMaster(Master master) {
		this.master = master;
	}
	
	public void saySth() {
		master.say();
	}
}
