package by.tms.task2;

import by.tms.task2.service.WrongLoginException;
import by.tms.task2.service.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        /**
         * Создать статический метод "checkAuthorization" который будет вызваться из метода main и принимает на вход три параметра: login, password и confirmPassword. Поле login должен содержать:
         * - Tолько латинские буквы, цифры и знак подчеркивания.
         * - Длина login должна быть меньше 20 символов.
         * (Если не знаете как проверить первое условие, то проверяем только 2 условие - вызваем метод lenght())
         * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
         * Password должен содержать:
         * - Только латинские буквы, цифры и знак подчеркивания.
         * -  Длина password должна быть меньше 20 символов.
         * (Если не знаете как проверить первое условие, то проверяем только 2 условие - вызваем метод lenght())
         * Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
         * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
         * второй принимает сообщение исключения и передает его в конструктор класса Exception.
         * Обработка исключений проводится внутри метода "checkAuthorization".
         * Используем multi-catch block. Метод "checkAuthorization" возвращает true, если значения верны или false в другом случае.
         * В методе main вызваем метод checkAuthorization и печатаем на консоль результат выполнения метода.
         * PS: если не знаем как сделать проверку, то можно просто оставить пустую реализацию! Прорабатываем работу с исключениями
         */

        System.out.println(checkAuthorization("12048563238464637370", "123", "123"));
    }

    public static boolean checkAuthorization(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("The login must contain Latin letters, numbers and an underscore");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("The password must contain Latin letters, numbers and an underscore");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
