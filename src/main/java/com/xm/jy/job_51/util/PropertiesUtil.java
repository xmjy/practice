package com.xm.jy.job_51.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * 读取XX.properties的工具类
 * @author gaoqj
 *
 */
public class PropertiesUtil {
	private static final Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);
	private static Properties properties = new Properties();
	private PropertiesUtil() {
	}
	private static class SingletonInstance {
		private static final PropertiesUtil INSTANCE = new PropertiesUtil();
	}
	public static PropertiesUtil getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
	//设置加载配置文件名称
	private static Set<String> setProperty = new HashSet() {{
		add("util.properties");
	}};
	
	/**
	 * 初始化属性到内存中
	 */
	static{
		setProperty.forEach(prop -> {
			try {
				properties.load(Thread.currentThread().getContextClassLoader().getResource(prop).openStream());
			} catch (Exception e) {
				logger.error("加载配置文件失败,请检查文件及路径是否正确",e);
			}
		});
		//将属性加载到系统内存中可以使用${xxxx}获取
		System.getProperties().putAll(properties);
	}

	/**
	 * 根据key获取value
	 * @param key 键值
	 * @return value key对应的值
	 */
	public static String getProperty(String key){
		String value = "";
		if(properties.containsKey(key)){
			value = properties.getProperty(key);
		}
		return value;
	}
	
	/**
	 * 更改或者添加一个key-value;
	 * 当key存在时，更改；不存在时，添加
	 * @param key
	 * @param value
	 */
	public static void setProperty(String key,String value){
		properties.setProperty(key, value);
	}
	
	
	public static Properties getProperties(){
		return properties;
	}
	
	/**
	 * 清除properties文件中所有的key和value
	 */
	public void clear(){
		properties.clear();
	}
}
