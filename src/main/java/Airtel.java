public class Airtel implements Sim {

    @Override
    public void calling() {
        System.out.println(" calling using Airtel sim");
    }

    @Override
    public void data() {
        System.out.println(" browsing using Airtel sim");
    }
}
