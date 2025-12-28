package app;

public class LogModule implements EventListener {

    @Override
    public void onEvent(String event) {
        System.out.println("LogModule записав у лог: " + event);
    }
}
