package command.step1;

public class Client {
    public static void main(String[] args) {
        MyService service = new MyService();

        int i = new java.util.Scanner(System.in).nextInt();

        if (i == 1) {
            service.serviceA();
            service.serviceB();
            service.serviceC();
        }
        else if (i == 2) {
            service.serviceC();
            service.serviceB();
        }
        else if (i == 3) {
            service.serviceA();
            service.serviceC();
        }
    }
}
