package by.tms.model;

import java.util.ArrayList;
import java.util.ListIterator;

public class Shop {
    private ArrayList<Product> productList;

    public Shop(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product pr) {
        if (!productList.contains(pr)) {
            productList.add(pr);
        }
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void deleteProduct(int id) {
        ListIterator<Product> iterator = productList.listIterator();
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (id == element.getId()) {
                iterator.remove();
            }
        }
    }

    public void editProduct(Product pr) {
        productList.remove(productList.size() - 1);
        productList.add(productList.size(), pr);
    }
}
