package cosmodrome;

public class Cosmodrome {
    private IStart aircraft;

    public void start(IStart aircraft) {
        if (aircraft.checkSystem()) {
            aircraft.startEngine();
            countdown();
            aircraft.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }

    private void countdown() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

}
