package com.xm.jy.test.io;

import com.xm.jy.job_cx.criteria.OrderDetailExample;
import com.xm.jy.job_cx.dao.OrderDetailMapper;
import com.xm.jy.job_cx.model.OrderDetail;
import com.xm.jy.job_cx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: albert.fang
 * @date: 2020/12/28 10:45
 * @description: 单元测试
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FxmTest implements ApplicationContextAware {


//    @Resource(type = String.class)
//    private String intheclass;
//
//    @Resource(type = String.class)
//    private String methodInTheClass2;

    @Resource
    private UserService userService;

    @Autowired @Qualifier("intheclass")
    private String intheclass1;

    @Autowired @Qualifier("methodInTheClass2")
    private String methodInTheClass21;

    private ApplicationContext ctx;

    @Resource
    private OrderDetailMapper orderDetailMapper;

    /**
     * 使用@Autowried来注入使用@Bean注入到IOC容器里的beans
     */
    @Test
    public void testBeanAnnotation(){
        System.out.println(intheclass1);
        System.out.println(methodInTheClass21);
    }

    @Test
    public void printIOCBeans(){
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println("Bean >>> " + beanDefinitionName);
        }
        System.out.println("*********************");
        System.out.println(ctx.getBeanDefinitionCount());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }

    public static String getRequestMappingUrls(ApplicationContext applicationContext) {
        RequestMappingHandlerMapping mapping = applicationContext.getBean(RequestMappingHandlerMapping.class);
        // 获取url与类和方法的对应信息
        Map<RequestMappingInfo, HandlerMethod> map = mapping.getHandlerMethods();
        StringBuffer sb = new StringBuffer();
        for (RequestMappingInfo info : map.keySet()) {
            // 获取url的Set集合，一个方法可能对应多个url
            Set<String> patterns = info.getPatternsCondition().getPatterns();
            for (String url : patterns) {
                // 把结果存入静态变量中程序运行一次次方法之后就不用再次请求次方法
                sb.append(url);
                sb.append(",");
            }
        }
        return sb.substring(0, sb.length() - 1).toString();
    }

    /**
     * 得到项目里的所有api接口
     */
    @Test
    public void testGetApiString(){
        String requestMappingUrls = getRequestMappingUrls(ctx);
        System.out.println(requestMappingUrls);
    }

    /**
     * 返回map的list
     * 返回map
     */
    @Test
    public void testMybatisReturnMap(){
        List<Map> userIdAndName = userService.getUserIdAndName();
        Map singleUserIdAndName = userService.getSingleUserIdAndName();
        System.out.println(userIdAndName.toString());
        System.out.println(singleUserIdAndName.toString());
    }

    /**
     * 验证mybatis generator逆向工程生成的XXXExample作用
     */
    @Test
    public void testMybatisGeneratorExampleCriteria(){
        OrderDetail orderDetail = new OrderDetail();
        OrderDetailExample orderDetailExample = new OrderDetailExample();
        OrderDetailExample.Criteria criteria = orderDetailExample.createCriteria();
//        criteria.andDetailIdLike("%6007959982568007%");
//        criteria.andDetailIdEqualTo("1556008207527681746");
        criteria.andDetailIdIn(Arrays.asList("1556007951656310027","1556008207527681746","1556008880393310158","2343"));
//        orderDetailExample.setOrderByClause("detail_id desc");
        List<OrderDetail> orderDetails = orderDetailMapper.selectByExample(orderDetailExample);
        Map<String, List<OrderDetail>> collect = orderDetails.stream().collect(Collectors.groupingBy(OrderDetail::getDetailId));
        collect.forEach((key,value) -> {
            System.out.println(key);
            value.forEach(v -> {
                System.out.println(v.toString());
            });
        });
    }
}
