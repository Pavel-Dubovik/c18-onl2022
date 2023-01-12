package by.tms.model;

import java.util.ArrayList;
import java.util.ListIterator;

public class Shop {
    private ArrayList<Product> productList;

    public Shop(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        if (!productList.contains(product)) {
            productList.add(product);
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

    public void editProduct(Product product) {
        for (Product item : productList) {
            if (item.getId() == product.getId()) {
                item.setName(product.getName());
                item.setPrice(product.getPrice());
            }
        }
    }
}
