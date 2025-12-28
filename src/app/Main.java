package app;

public class Main {
    public static void main(String[] args) {

        EventManager eventManager = EventManager.getInstance();

        AuthModule auth = new AuthModule();
        LogModule log = new LogModule();
        UserInterface ui = new UserInterface();

        eventManager.subscribe(auth);
        eventManager.subscribe(log);
        eventManager.subscribe(ui);

        auth.login();
    }
}
