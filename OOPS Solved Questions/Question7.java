
// Write a Java program to create a class called "Inventory" with a collection
// of products and methods to add and remove products, and to check for low
// inventory.
// import java.util.*;

// class Products {
// String productname;
// int quantity;

// public Products(String productname, int quantity) {
// this.productname = productname;
// this.quantity = quantity;
// }

// }

// class Inventory {

// ArrayList<Products> products;

// public Inventory() {
// this.products = new ArrayList<Products>();
// }

// public void addProduct(Products product) {
// products.add(product);
// }

// public void removeProduct(Products product) {
// products.remove(product);
// }

// public ArrayList<Products> getproducts() {
// return products;
// }

// public void checkLowInventory() {
// for (Products product : products) {
// if (product.quantity <= 100) {
// System.out.println(
// "Product quantity of " + product.productname + " is running low which is = "
// + product.quantity);
// }
// }
// }

// }

// class Main {
// public static void main(String[] args) {
// Products p1 = new Products("TV", 500);
// Products p2 = new Products("Washing Machine", 50);
// Products p3 = new Products("refrigertaor", 40);
// Products p4 = new Products("AC", 400);

// Inventory I1 = new Inventory();
// I1.addProduct(p1);
// I1.addProduct(p2);
// I1.addProduct(p3);
// I1.addProduct(p4);

// System.out.println(I1.getproducts().get(0).productname);

// I1.checkLowInventory();

// }
// }