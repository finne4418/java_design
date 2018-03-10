package command.step3;

public class example {
    public static void main(String[] args) {
        MyService service = new MyService();

        /* serviceAとBを実行するためコマンドオブジェクトを生成して
         * MyServiceに渡す
         */
        MyRequest request = new MyRequest1();
        service.request(request);
    }
}
