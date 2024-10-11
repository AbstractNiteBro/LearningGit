import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobile {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        // System.out.println("config loaded");

        Sim sim=context.getBean(Sim.class, "sim");
        sim.calling();
        sim.data();
    }
}
