package robot;

import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.SamsungLeg;
import robot.legs.SonyLeg;
import robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /**
         *  Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
         *          Класс SonyHead является примером реализацией головы от Sony.
         *          Создайте 3 робота с разными комплектующими.
         *          Например, у робота голова и нога от Sony а, рука от Samsung.
         *          У всех роботов вызовите метод action.
         *          Среди 3-х роботов найдите самого дорогого.
         */

        Robot robot1 = new Robot(new ToshibaHead(1500), new SonyHand(900), new SamsungLeg(600));
        robot1.action();
        System.out.println(robot1.getPrice());
        System.out.println("--------------------------------------------------");


        Robot robot2 = new Robot(new SonyHead(2100), new SamsungHand(1000), new ToshibaLeg(400));
        robot2.action();
        System.out.println(robot2.getPrice());
        System.out.println("--------------------------------------------------");

        Robot robot3 = new Robot(new SamsungHead(2500), new ToshibaHand(500), new SonyLeg(800));
        robot3.action();
        System.out.println(robot3.getPrice());
        System.out.println("--------------------------------------------------");

        System.out.println("Максимальная стоимость робота = " + Math.max(robot1.getPrice(), Math.max(robot2.getPrice(), robot3.getPrice())));
        System.out.println(getRobotWithMaxPrice(robot1, robot2, robot3));

    }

    public static IRobot getRobotWithMaxPrice(IRobot... robots) {
        int maxPrice = 0;
        for (int i = 0; i < robots.length; i++) {
            maxPrice = robots[0].getPrice();
            if (maxPrice < robots[i].getPrice()) {
                maxPrice = robots[i].getPrice();
            }
        }
        IRobot robotWithMaxPrice = new Robot();
        for (int i = 0; i < robots.length; i++) {
            if (maxPrice == robots[i].getPrice()) {
                robotWithMaxPrice = robots[i];
            }
        }
        return robotWithMaxPrice;
    }


}
