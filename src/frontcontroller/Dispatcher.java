package frontcontroller;

public class Dispatcher {

    public StudentView studentView;
    public HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }
    
}