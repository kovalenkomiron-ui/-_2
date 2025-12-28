package app;

public class UserInterface implements EventListener {

    @Override
    public void onEvent(String event) {
        System.out.println("UserInterface: Ласкаво просимо!");
    }
}
