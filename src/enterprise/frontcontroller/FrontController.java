package enterprise.frontcontroller;

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

    public void dispatchRequest(String request) {
        trackRequest(request);

        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }

    public static void main(String[] args) {
        FrontController fc = new FrontController();
        fc.dispatchRequest("HOME");
        fc.dispatchRequest("STUDENT");
    }

}