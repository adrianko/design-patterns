package businessdelegate;

public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate bd) {
        businessService = bd;
    }

    public void doTask() {
        businessService.doTask();
    }

}