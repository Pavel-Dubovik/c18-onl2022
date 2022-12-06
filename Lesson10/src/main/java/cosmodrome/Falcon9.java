package cosmodrome;

public class Falcon9 implements IStart {

    @Override
    public boolean checkSystem() {
        int randomNumber1 = (int) (Math.random() * 5);
        boolean checkController1 = check(randomNumber1);
        int randomNumber2 = (int) (Math.random() * 5);
        boolean checkController2 = check(randomNumber2);
        int randomNumber3 = (int) (Math.random() * 5);
        boolean checkController3 = check(randomNumber3);
        return checkController1 && checkController2 && checkController3;
    }

    private boolean check(int number) {
        return number % 2 == 0;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт");
    }
}
