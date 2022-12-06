package human;

import human.jacket.AdidasJacket;
import human.jacket.NikeJacket;
import human.jacket.PumaJacket;
import human.pants.AdidasPants;
import human.pants.NikePants;
import human.pants.PumaPants;
import human.shoes.AdidasShoes;
import human.shoes.NikeShoes;
import human.shoes.PumaShoes;

public class Main {
    public static void main(String[] args) {
        /**
         * По аналогии с первым задание делаем след. задание.
         * Интерфейсы:
         * - Куртка
         * - Штаны
         * - Обувь
         * в каждом интерфейсе есть 2 метода (надеть и снять)
         * Делаем несколько реализации каждого интерфейса.
         * Создаём класс человек:
         * У человека поля:
         * -имя
         * -куртка
         * -штаны
         * -обувь
         * У человека есть 2 метода:
         * - одеться(вызываются методы надетьдеть у всех вещей)
         * - раздеться (вызываются методы снять у всех вещей)
         */

        Human human1 = new Human("Tom", new AdidasJacket(), new PumaPants(), new NikeShoes());
        human1.putOn();
        human1.undress();
        System.out.println("---------------------------------------------------------");

        Human human2 = new Human("Jack", new PumaJacket(), new AdidasPants(), new PumaShoes());
        human1.putOn();
        human1.undress();
        System.out.println("---------------------------------------------------------");

        Human human3 = new Human("Frank", new NikeJacket(), new NikePants(), new AdidasShoes());
        human1.putOn();
        human1.undress();
    }
}
