package com.asiainfo.classpath;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * 资源加载器Demo
 *
 * @author zhangzhiwang
 * @date 2019年1月26日 上午9:42:14
 */
public class ResourceLoaderDemo {
	public static void main(String[] args) throws IOException {
//		ResourcePatternResolver resourceLoader = new PathMatchingResourcePatternResolver();
//		Resource[] resources = resourceLoader.getResources("classpath*:/**/*.xml");
//		for (Resource resource : resources) {
////			System.out.println(resource.getDescription());
//		}
		
		loadfile();
//		System.out.println("hello");
	}
	
	public static void loadfile() throws IOException {
		ResourceLoader resourceLoader2 = new DefaultResourceLoader();
		Resource resource = resourceLoader2.getResource("classpath:a/zzw.xml");
		
		InputStream input = resource.getInputStream();//resource.getFile();
		//准备一个1024数组
        byte data[]=new byte[1024 * 10];
        //这里有一个read（byte[] b）方法，将数据读取到字节数组中，同返回读取长度
        int len=input.read(data);
        input.close();
        //将读取得到的字节数组数据变为字符串进行输出
        System.out.println("【"+new String(data,0,len)+"】");
	}
}
