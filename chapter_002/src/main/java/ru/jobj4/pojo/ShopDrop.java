package ru.jobj4.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        int len = (products.length - 1) - index;
        System.arraycopy(products, index + 1, products, index, len);
        products[products.length - 1] = null;
        return products;
    }
}
