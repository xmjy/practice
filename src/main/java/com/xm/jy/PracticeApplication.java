package com.xm.jy;

import com.xm.jy.test.ioc.entity.ComponentAndBean;
import com.xm.jy.test.ioc.entity.People;
import com.xm.jy.test.ioc.entity.Person;
import com.xm.jy.test.ioc.entity.Pet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@EnableScheduling
@MapperScan(basePackages = "com.xm.jy.job_cx.dao")
public class PracticeApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PracticeApplication.class, args);
        Person person = ctx.getBean(Person.class);
        System.out.println(person.toString());
        People people = ctx.getBean(People.class);
        Pet pet = ctx.getBean(Pet.class);
        System.out.println(pet);
        System.out.println(people.toString());
        people.say();
        ComponentAndBean componentAndBean = ctx.getBean(ComponentAndBean.class);
        System.out.println(componentAndBean.toString());
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PracticeApplication.class);
    }
}
