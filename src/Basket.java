public class Basket {

    public static String items = "";
    public static int totalPrice = 0;

    public static void main(String[] args) {
        add("Колбаса", 76);
        add("Молоко",91);
        add("Масло",134);
        print("Содержимой карзины: ");
        System.out.println(getTotalPrice());
        clear();
        print("Cодержимое карзины ");
        System.out.println(getTotalPrice());
    }

    public static void add(String name, int price) {
        items = items + "\n" + name + "-" + price;
        totalPrice = totalPrice + price;
    }

    public static void clear() {
        items = "";
        totalPrice = 0;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Карзина пуста");
        }
        else {
            System.out.println(items);
        }
    }
}
