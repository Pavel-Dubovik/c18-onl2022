package cosmodrome;

public class Shuttle implements IStart {

    @Override
    public boolean checkSystem() {
        int randomNumber = (int) (Math.random() * 11);
        return randomNumber > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели шаттла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт шаттла");
    }
}
