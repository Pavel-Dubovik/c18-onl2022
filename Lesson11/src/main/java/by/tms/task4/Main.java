package by.tms.task4;

import by.tms.task4.model.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Задача4*(звездочка)
         * Используя перечисления(enum), реализовать программу по вычислению площади фигуры (метод getSquare).
         * Создать классы Фигура, Линия, Треугольник, Прямоугольник. Можно пользоваться интерфейсами, при необходимости!
         * Если у фигуры нельзя вычислить площадь, то метод не должен быть реализован в этом классе.
         * Добавить фигуры в массив, пробежать по массиву и вызвать метод getSquare.
         * Внимание!!! пользоваться instanceof НЕЛЬЗЯ, тут нужно применить перечисления.
         */

        Figure[] figures = new Figure[3];
        figures[0] = Rectangle.builder()
                .sideA(3)
                .sideB(2)
                .build();
        figures[1] = Triangle.builder()
                .base(4)
                .height(2)
                .build();
        figures[2] = Line.builder()
                .length(5)
                .build();

        for (Figure figure : figures) {
            if (figure.getType() != FigureType.LINE) {
                System.out.println("Площадь фигуры " + figure.getType() + " = " + ((ISquare) figure).getSquare());
            }
        }
    }
}
