package by.teachmeskills.eshop.model;

public enum PagesPath {

    SIGN_IN_PAGE_PATH("signin.jsp"),
    HOME_PAGE_PATH("home.jsp"),
    CATEGORY_PAGE_PATH("category.jsp"),
    PRODUCT_PAGE_PATH("product.jsp"),
    PRODUCT_CONTROLLER_PATH("/eshop?command=product&productId=product.getId()"),
    CART_PAGE_PATH("cart.jsp"),
    CART_CONTROLLER_PATH("/eshop?command=cart-get");

    private final String path;

    PagesPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}