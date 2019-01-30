package com.asiainfo.ioc;

/**
 * 剧本</br>
 * 剧本里面的剧情：大师说了一句话：“你会变成你想成为的人。”
 * 
 * @author zhangzhiwang
 * @date 2019年1月24日 下午10:58:13
 */
public class Script {
	// 传统的编程方式
	private static Master master = new JackieChan();// 剧本规定了大师这个角色说了一句话，但是剧本不关心大师这个角色谁去演。所以，把一个具体的演员（成龙）硬编码到剧本这个类里面是不是不太合适？造成了调用方（剧本类）对被调用接口（大师）实现类（成龙）的耦合。
													// 那么为了解除这种耦合，就要找第三方——导演。导演拿到剧本之后他来决定大师这个角色由谁去演，Spring在这个例子里面就充当导演的角色。相见Script2.java

	public static void main(String[] args) {
		master.say();
	}
}
