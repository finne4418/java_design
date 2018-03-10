package command.step3;

abstract class MyRequest {
    MyService service;

    void setService(MyService service) {
        this.service = service;
    }

    abstract void procRequest();
}
