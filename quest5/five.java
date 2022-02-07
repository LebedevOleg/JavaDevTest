import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Item implements Comparable<Item> {
    int index;
    int weight;
    int price;

    Item(int i, int w, int p) {
        this.index = i;
        this.weight = w;
        this.price = p;
    }

    @Override
    public int compareTo(Item o) {
        return o.price - this.price;
    }
}

class Backpack {
    final int maxWeight;
    List<Item> items;
    int currWeight;
    int currCost;

    Backpack(int w) {
        this.maxWeight = w;
        this.items = new ArrayList<>();
        this.currCost = 0;
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.currWeight += item.weight;
        this.currCost += item.price;
    }

    void getInfo() {
        for (Item item : items) {
            System.out.println("Индекс: " + item.index + " цена: " + item.price + " вес: " + item.weight + "\n");
        }
    }
}

public class five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Item> items = new ArrayList<>();
        System.out.println("Введите данные рюкзака");
        System.out.print("Введите объем рюкзака: ");
        int bag_weight = in.nextInt();
        Backpack bag = new Backpack(bag_weight);
        int index = 1;
        System.out.println(
                "Вводите данные о предметах. Данные вводятся о кажом предмете отдельно, если вы хотите закончить введите 0. Для удобства каждому предмету назначается индекс.");
        System.out.println("Сначала вводятся объем, потом ценность");
        int weight;
        int price;
        while (true) {
            System.out.println("Вводится " + index + " предмет");
            weight = in.nextInt();
            if (weight == 0)
                break;
            price = in.nextInt();
            items.add(new Item(index, weight, price));
            index++;
        }
        Collections.sort(items);
        fillBackpack(bag, items);
        System.out.println("Вес рюкзака состовляет - " + bag.currWeight +
                ", общая стоимость вещей в рюкзаке - " + bag.currCost);
        bag.getInfo();
    }

    public static void fillBackpack(Backpack bag, List<Item> items) {
        for (Item item : items) {
            if (bag.maxWeight >= bag.currWeight + item.weight) {
                bag.addItem(item);
            }
        }

    }
}
