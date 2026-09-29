public class Main {
    public static void main(String[] args) {
        System.out.println("~~ Тестирование класса Product ~~");
        Product product1 = new Product(1, "Смартфон", 50000, "Электроника");
        Product product2 = new Product(2, "Ноутбук", 80000, "Электроника");
        Product product3 = new Product(1, "Смартфон", 55000, "Электроника");
        Product product4 = new Product(1, "Смартфон", 50000, "Аксессуары");
        System.out.println("Товар 1: " + product1);
        System.out.println("Товар 2: " + product2);
        System.out.println("Товар 3: " + product3);
        System.out.println("Товар 4: " + product4);
        System.out.println("~~ Сравнение товаров ~~");
        System.out.println("product1.equals(product2): " + product1.equals(product2));
        System.out.println("product1.equals(product3): " + product1.equals(product3));
        System.out.println("product1.equals(product4): " + product1.equals(product4));
        System.out.println("product1.equals(product1): " + product1.equals(product1));
        System.out.println("product1.equals(null): " + product1.equals(null));
        System.out.println("~~ Тестирование класса Order ~~");
        Product[] basket1 = {product1, product2};
        Product[] basket2 = {product1, product2};
        Product[] basket3 = {product2, product1};
        Product[] basket4 = {product1};
        Order order1 = new Order("Иван", basket1);
        Order order2 = new Order("Иван", basket2);
        Order order3 = new Order("Иван", basket3);
        Order order4 = new Order("Петр", basket1);
        Order order5 = new Order("Иван", basket4);
        System.out.println("Заказ 1: " + order1);
        System.out.println("Заказ 2: " + order2);
        System.out.println("Заказ 3: " + order3);
        System.out.println("Заказ 4: " + order4);
        System.out.println("Заказ 5: " + order5);
        System.out.println("~~ Сравнение заказов ~~");
        System.out.println("order1.equals(order2): " + order1.equals(order2));
        System.out.println("order1.equals(order3): " + order1.equals(order3));
        System.out.println("order1.equals(order4): " + order1.equals(order4));
        System.out.println("order1.equals(order5): " + order1.equals(order5));
        System.out.println("order1.equals(order1): " + order1.equals(order1));
        System.out.println("order1.equals(null): " + order1.equals(null));
    }
}