package com.asiainfo.ioc;

/**
 * 大师
 *
 * @author zhangzhiwang
 * @date 2019年1月24日 下午11:03:27
 */
public class Master {
	public void say() { 
		System.out.println("你会变成你想成为的人。");
	}
	
	public static void main(String[] args) {
		// 注入方式1
//		Script2 script2 = new Script2(new JackieChan());
//		script2.saySth();
		
		// 注入方式2
		Script3 script3 = new Script3();
		script3.setMaster(new JackieChan());
		script3.saySth();
	}
}
