package command.step2;

public class MyService {
    public static int A_B_C = 1;
    public static int C_B   = 2;
    public static int A_C   = 3;

    public void request(int methodPattern) {
        if (methodPattern == A_B_C) {
            serviceA();
            serviceB();
            serviceC();
        }
        else if (methodPattern == C_B) {
            serviceC();
            serviceB();
        }
        else if (methodPattern == A_C) {
            serviceA();
            serviceC();
        }
    }

    private void serviceA() {
        System.out.println("Service A");
    }

    private void serviceB() {
        System.out.println("Service B");
    }

    private void serviceC() {
        System.out.println("Service C");
    }
}
