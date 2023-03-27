import com.atguigu.spring6.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author: dev_guo
 * @Date: 2023/3/21 17:59
 */
public class TestUser {
    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    public void testUserObject(){
        //加载配置文件
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean.xml");

        //获取对象
        User user = (User)context.getBean("user");
        System.out.println(user);
        //使用对象调用方法
        System.out.println("2:");
        user.add();
        logger.info("测试结束");
    }
    @Test
    public void testUserObject1() throws Exception {
        //获取类Class对象
        Class aClass = Class.forName("com.atguigu.spring6.User");
        User user = (User) aClass.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
