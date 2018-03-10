package command.step3;

class MyRequest1 extends MyRequest {
    void procRequest() {
        // MyRequest1ではserviceAとBを実行する
        service.serviceA();
        service.serviceB();
    }
}
