import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------Напитки---------");

        VendingtMachine vendingtMachine = new VendingtMachine();
        vendingtMachine.tragingAutomatList(new Produkt("cola", 32))
                .tragingAutomatList(new Produkt("Buratino",39))
                .tragingAutomatList(new Produkt("Kyvaka", 10));
        System.out.println(vendingtMachine.getProdukts());

        System.out.println("-------Сортировка vendingtMachine по цене---------");
        Collections.sort(vendingtMachine.getProdukts());
        System.out.println(vendingtMachine.getProdukts());

        System.out.println("Ввести имя товара");
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();
        vendingtMachine.getProduct(hotDrinksVendingMachine.getName());


        System.out.println("Ввести индекс интересующего напитка");
        hotDrinksVendingMachine.hotDrinksVend(vendingtMachine.getProdukts());
        System.out.println(hotDrinksVendingMachine.getDrink());

        System.out.println("-------Коллекция кофе---------");

        VendingtMachine hotDirks = new VendingtMachine();
        hotDirks.tragingAutomatList(new HotDrink("Lalle", 120,80))
                .tragingAutomatList(new HotDrink("Amerikano", 90,60))
                .tragingAutomatList(new HotDrink("Amerikano", 100,70));
        System.out.println(hotDirks.getProdukts());

        System.out.println("-------Сортировка кофе по цене---------");
        hotDirks.getProdukts().sort((w1,w2)-> Integer.compare(w1.cost, w2.cost));
        //hotDirks.getProdukts().sort(new ProduktComporator());
        //Collections.sort(hotDirks.getProdukts());
        System.out.println(hotDirks.getProdukts());

        System.out.println("-------Итерация VendingMachine (hotDirks)---------");
        Iterator<Produkt> iterator = hotDirks;
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Ввести индекс интересующего напитка");
        hotDrinksVendingMachine.hotDrinksVend(hotDirks.getProdukts());
        System.out.println(hotDrinksVendingMachine.getDrink());
        System.out.println("-------Итерация класса Koffe---------");
        Koffe koffes = new Koffe("LATTE", 56,75);
        Iterator<String> koffe = koffes;
        while (koffe.hasNext()){
            System.out.println(koffe.next());
        }

        System.out.println("-------Коллекция чая---------");

        VendingtMachine tea = new VendingtMachine();
        tea.tragingAutomatList(new Tea("Цейлонский",150,80))
                .tragingAutomatList(new  Tea("Королевский", 130, 75));
        System.out.println(tea.getProdukts());
    }
}