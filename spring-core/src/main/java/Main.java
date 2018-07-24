import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.HelloWorld;

/**
 * @author liusl12
 * @date 2018/7/24.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-web.xml");
        System.out.println("ApplicationName: " + ctx.getApplicationName());
        System.out.println("DisplayName: " + ctx.getDisplayName());
        System.out.println("Parent: " + ctx.getParent());
        System.out.println("AutowireCapableBeanFactory: " + ctx.getAutowireCapableBeanFactory());
        HelloWorld helloWorld2 = (HelloWorld) ctx.getAutowireCapableBeanFactory().getBean("hello");
        helloWorld2.hello();
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("hello");
        helloWorld.hello();
    }
}
