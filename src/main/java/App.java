import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat one = (Cat)applicationContext.getBean("cat");
        System.out.println(one.getCat());
        Cat two = (Cat)applicationContext.getBean("cat");
        System.out.println(two.getCat());

        System.out.println(bean.equals(bean2));
        System.out.println(one.equals(two));
    }
}