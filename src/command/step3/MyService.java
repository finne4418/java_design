package command.step3;

public class MyService {
    // リクエストをコマンドオブジェクトで受け付けます
    void request(MyRequest request) {
        // コマンドオブジェクトにMyServiceをセットしておく
        request.setService(this);

        // コマンドオブジェクトにリクエストの実行
        // (MyServiceのメソッド呼び出し)を指示します
        request.procRequest();
    }

    void serviceA() {
        System.out.println("Service A");
    }

    void serviceB() {
        System.out.println("Service B");
    }

    void serviceC() {
        System.out.println("Service C");
    }
}
