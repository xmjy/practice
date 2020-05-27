package com.xm.jy.job_51.mianTest;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author: albert.fang
 * @date: 2020/4/15 17:50
 * @description: File类的成员变量测试
 */
public class FilePropertiesTest {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(readPropertiesFile("application.properties"));
        System.out.println(properties.getProperty("fxm"));
        System.out.println(properties.get("fxm"));
    }

    /**
     * 通过Thread.currentThread().getContextClassLoader().getResourceAsStream(path)获取到classpath路径
     * @throws IOException
     */
    public static InputStream readPropertiesFile(String path) throws IOException {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
        /*// 测试输出到控制台
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }*/
        return is;
    }
}
