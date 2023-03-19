package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.model.Category;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class CategoryHelper {

    public static final List<Category> categories = List.of(
            new Category(1, "Mobile phones", "mobile.jpg"),
            new Category(2, "Laptops", "laptop.jpg"),
            new Category(3, "GPS Navigators", "jps_nav.jpg"),
            new Category(4, "Fridges", "fridge.jpg"),
            new Category(5, "Cars", "car.jpg"),
            new Category(6, "Cameras", "camera.jpg")
    );
}