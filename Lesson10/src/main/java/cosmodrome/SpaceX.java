package cosmodrome;

public class SpaceX implements IStart {
    @Override
    public boolean checkSystem() {
        int randomNumber1 = (int) (Math.random() * 5);
        boolean checkController1;
        if (randomNumber1 % 2 == 0) {
            checkController1 = true;
        } else {
            checkController1 = false;
        }
        int randomNumber2 = (int) (Math.random() * 5);
        boolean checkController2;
        if (randomNumber2 % 2 == 0) {
            checkController2 = true;
        } else {
            checkController2 = false;
        }
        int randomNumber3 = (int) (Math.random() * 5);
        boolean checkController3;
        if (randomNumber3 % 2 == 0) {
            checkController3 = true;
        } else {
            checkController3 = false;
        }

        if (checkController1 && checkController2 && checkController3) {
            return true;
        } else {
            return false;
        }
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
