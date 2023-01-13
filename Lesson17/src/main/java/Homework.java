import by.tms.model.Product;
import by.tms.model.Shop;
import by.tms.servise.ProductPriceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {
    /**
     * Необходимо реализовать магазин продуктов.
     * Создать класс Товар, поля:
     * • id(целое число)
     * • name(строка)
     * • price(целое число)
     * Создать класс Магазин, поля:
     * • Список товаров (изначально пустой)
     * методы:
     * • добавить товар(принимает объект товара и добавляет его в список
     * товаров). При попытке добавить товар с id уже существующем в списке,
     * вставка производится не должна
     * • получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в
     * магазине)
     * • удалить товар (метод принимает id товара и удаляет из списка товар с
     * соответствующим id)
     * • редактировать товар(принимает объект товара и редактирует им список
     * товаров)
     * Обратите внимание что id товара и индекс товара в списке — это разные вещи, не перепутайте.
     * Id товара — это поле вашего объекта, вы при его создании его задаете. А индекс товара в списке товаров, это по сути его порядковый номер в списке(начинается с 0).
     * (обязательное к выполнению): В main:
     * • создаем объект магазина
     * • создаем пару тройку товаров и добавляем эти товары в магазин
     * • получаем список товаров из магазина, сортируем по цене(по
     * возрастанию) и выводим в консоль.
     * • удаляем один товар
     * • получаем список товаров из магазина, сортируем по порядку
     * добавления(последние добавленные в начале) и выводим в консоль.
     * • редактируем один товар
     * • получаем список товаров и выводим в консоль
     * Если вы выполнили обязательную часть, можете переходить к более интересному пункту.
     * Для работы с магазином используем не вызовы методов из main(все что до этого написали можно удалить),
     * а разрабатываем консольное меню для работы с магазином.
     * <p>
     * Вторая часть!(Не обязательно, но попробовать можно сделать.)
     * <p>
     * Алгоритм работы магазина:
     * • Выберите действие:
     * ◦ Вывод всех товаров. При выборе этого действия, было бы отлично спросить у пользователя в какой сортировке вывести:
     * ▪ по цене(возрастание)
     * ▪ по цене(убывание)
     * ▪ по добавлению(сначала новые, потом более старые)
     * После выбора сортировки, из магазина получаете список товаров, сортируете их таким образом как выбрал пользователь и выводите в консоль.
     * ◦ Добавление товара. При выборе этого действия:
     * ▪ пользователь должен ввести из консоли 3 параметра (id, название, цена).
     * ▪ создаем объект товара(поля заполняются данными введенными пользователем)
     * ▪ добавляем товар в магазин(напоминаю, если в списке товаров уже существует товар с таким id, то новый товар не добавляется)
     * ◦ Удаление товара. При выборе этого действия:
     * ▪ пользователь вводит id товара который нужно удалить
     * ▪ удаляем товар из магазина
     * ◦ Редактирование товара. При выборе этого действия:
     * ▪ пользователь должен ввести из консоли 3 параметра (id товара для редактирования, новое название, новую цену).
     * ▪ создаем объект товара(поля заполняются данными введенными пользователем)
     * ▪ редактируем товар в магазине
     * ◦ Выход. При выборе этого действия, работа магазина завершается.
     * В main создаем объект вашей консольной менюшки (приложения, Application). И вызываем метод старт. Магазин должен работать по замкнутому циклу,
     * до тех пор пока пользователь в меню не выберет выход. Естественно незабываем про обработку всевозможных ошибок.))
     */
    public static void main(String[] args) {
        Shop shop = new Shop(new ArrayList<>());
        Product apple = new Product(100, "Каштель", 5);
        Product apple1 = new Product(101, "Белый налив", 3);
        Product tangerine = new Product(110, "Конференция", 6);
        Product potato = new Product(120, "Манифест", 1);

        shop.addProduct(apple);
        shop.addProduct(apple1);
        shop.addProduct(tangerine);
        shop.addProduct(potato);

        List<Product> list = shop.getProductList();
        ProductPriceComparator priceComparator = new ProductPriceComparator();
        list.sort(priceComparator);
        for (Product product : list) {
            System.out.println(product);
        }

        System.out.println();

        shop.deleteProduct(101);
        Collections.reverse(list);
        list.forEach(System.out::println);

        System.out.println();

        shop.editProduct(new Product(110, "Дюшес", 6));
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
