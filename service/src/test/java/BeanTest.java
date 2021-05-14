import com.xm.practice.ServiceApplication;
import com.xm.practice.component.StringComponents;
import com.xm.practice.service.Human;
import com.xm.practice.service.impl.Man;
import com.xm.practice.utils.BeanUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: albert.fang
 * @date: 2021/5/14 13:44
 * @description: 服务块测试
 */
@SpringBootTest(classes = ServiceApplication.class)
@RunWith(SpringRunner.class)
public class BeanTest implements ApplicationContextAware {

    @Resource(name = "stringComponents")
    private StringComponents stringComponents;

    @Resource(name = "getAWord")
    private String word;

    @Resource(name = "getAnotherWord")
    private String wordAnotherWord;

    @Resource
    private Human human;

    @Resource
    private Man man;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanUtils.applicationContext = applicationContext;
    }

    @Test
    public void testF(){
        man.say();
    }

    @Test
    public void testE(){
        human.say();
        Human bean = BeanUtils.getBean(Human.class);
        bean.say();
    }

    @Test
    public void testD(){
        String bean = BeanUtils.getBean(String.class);
        System.out.println(bean);
    }

    @Test
    public void testC(){
        StringComponents bean = BeanUtils.getBean(StringComponents.class);
        bean.getVoid();
    }

    @Test
    public void testB(){
        System.out.println(word);
        System.out.println(wordAnotherWord);
    }

    @Test
    public void testA(){
        System.out.println(stringComponents.getAWord());
    }

}
