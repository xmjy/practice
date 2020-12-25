package com.xm.jy;

import com.xm.jy.job_51.aware.ApplicationContextAwareTest;
import com.xm.jy.job_cx.aspect.AllActionAspect;
import com.xm.jy.test.ioc.entity.ComponentAndBean;
import com.xm.jy.test.ioc.entity.People;
import com.xm.jy.test.ioc.entity.Person;
import com.xm.jy.test.ioc.entity.Pet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//@EnableScheduling
@MapperScan(basePackages = "com.xm.jy.job_cx.dao")
@EnableAsync
public class PracticeApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PracticeApplication.class, args);
        System.out.println("获取ApplicationContext这种IOC容器里的Beans");
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println("Bean >>> " + beanDefinitionName);
        }
        System.out.println("共有：" + ctx.getBeanDefinitionCount()+"个");
        System.out.println(ctx.getBean("methodInTheClass2").toString());
        System.out.println(ctx.getBean("detectBeans").toString());
        // 比较通过ApplicationContextWare获得的applicationContext是否和SpringApplication.run获取到的一致
        // 结论：一致的，同一个applicationContext对象
        ApplicationContextAwareTest applicationContextAwareTest = (ApplicationContextAwareTest)ctx.getBean("applicationContextAwareTest");
        System.out.println(applicationContextAwareTest.ctx.equals(ctx));
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PracticeApplication.class);
    }
}
