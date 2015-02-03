package frontcontroller;

public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("Auth'ed");

        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

}
