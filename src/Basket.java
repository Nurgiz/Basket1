public class Basket {

    public static String items = "";

    public static void main(String[] args) {
        add("Колбаса", 76);
        add("Молоко",91);
        add("Масло",134);
        print("Содержимой карзины: ");
        clear();
        print("Cодержимое карзины ");
    }

    public static void add(String name, int price) {
        items = items + "\n" + name + "-" + price;
    }

    public static void clear() {
        items = "";
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
