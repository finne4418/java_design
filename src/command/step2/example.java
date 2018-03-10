package command.step2;

public class example {
    public static void main(String[] args) {
        MyService service = new MyService();

        //AとBとCを実行する
        service.request(MyService.A_B_C);
        //CとBを実行する
        service.request(MyService.C_B);
        //AとCを実行する
        service.request(MyService.A_C);
    }
}
