public class HomeWork4 {
    public static void main(String[] args) {
        //1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

/*
        char ch = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(ch + " ");
            ch++;
        }
*/
        char ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }


        //2)Проверка четности числа
        //Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
        // чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
        // Если пользователь введёт не целое число, то сообщать ему об ошибке.

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is not even.");
        }
*/

        //3) Меньшее по модулю число
        //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
        // пользователем вещественных чисел с консоли.

/*
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        System.out.println(Math.min(Math.abs(number1), Math.min(Math.abs(number2), Math.abs(number3))));
*/

        //4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
        // оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
        // когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
        // (т.е. рабочий день закончился).
        //Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
        // Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
        // сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
        //Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
        // далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
        // выводиться фраза о количестве полных часов, содержащихся в n секундах.

/*
        Random random = new Random();
        int n = random.nextInt(28801);
        System.out.println(n);
        System.out.println(n / 3600);
*/

//5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn

        /*String nya = "ня";
        String ya = "я";
        String no = "х";
        String t = "т";
        String by = "byte";
        String sh = "short";
        String ch = "char";
        String in = "int";
        String lo = "long";
        String fl = "float";
        String dou = "double";
        String bool = "boolean";
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", " ", by, sh, ch, in, lo, fl, dou, bool);
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", by, t, nya, nya, nya, nya, nya, nya, no);
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", sh, ya, t, ya, nya, nya, nya, nya, no);
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", ch, ya, ya, t, nya, nya, nya, nya, no);
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", in, ya, ya, ya, t, nya, nya, nya, no);
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", lo, ya, ya, ya, ya, t, nya, nya, no);
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", fl, ya, ya, ya, ya, ya, t, nya, no);
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", dou, ya, ya, ya, ya, ya, ya, t, no);
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", bool, no, no, no, no, no, no, no, t);*/


    }
}
