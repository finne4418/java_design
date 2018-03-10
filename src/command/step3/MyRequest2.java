package command.step3;

class MyRequest2 extends MyRequest {
    void procRequest() {
        // MyRequest2ではserviceCとAを実行する
        service.serviceC();
        service.serviceA();
    }
}
