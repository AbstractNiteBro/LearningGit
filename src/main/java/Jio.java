import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim {
/*public Jio(){
    System.out.println("jio constructor called"); } */
    @Override
    public void calling() {
        System.out.println(" calling using jio sim");
    }

    @Override
    public void data() {
        System.out.println(" browsing using jio sim");
    }
}
