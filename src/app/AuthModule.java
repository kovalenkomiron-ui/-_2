package app;

public class AuthModule implements EventListener {

    public void login() {
        EventManager.getInstance()
                .notifyAll("AuthModule: Користувач авторизувався");
    }

    @Override
    public void onEvent(String event) {
        System.out.println("AuthModule отримав подію: " + event);
    }
}
