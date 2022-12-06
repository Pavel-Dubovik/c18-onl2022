package cosmodrome;

public class Cosmodrome {
    private IStart aircraft;

    public void start(IStart aircraft) {
        if (!aircraft.checkSystem()) {
            System.out.println("Предстартовая проверка провалена");
            return;
        } else {
            aircraft.startEngine();
        }
        countdown();
        aircraft.start();
    }

    private void countdown() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

}
