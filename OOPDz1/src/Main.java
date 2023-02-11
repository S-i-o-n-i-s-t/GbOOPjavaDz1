public class Main {
    public static void main(String[] args) {
        System.out.println("-------Напитки---------");

        VendingtMachine vendingtMachine = new VendingtMachine();
        vendingtMachine.tragingAutomatList(new Produkt("cola", 32))
                .tragingAutomatList(new Produkt("Buratino",39))
                .tragingAutomatList(new Produkt("Kyvaka", 10));
        System.out.println(vendingtMachine.getProdukts());

        System.out.println("Ввести имя товара");
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();
        vendingtMachine.getProduct(hotDrinksVendingMachine.getName());


        System.out.println("Ввести индекс интересующего напитка");
        hotDrinksVendingMachine.hotDrinksVend(vendingtMachine.getProdukts());
        System.out.println(hotDrinksVendingMachine.getDrink());



        System.out.println("-------Коллекция кофе---------");

        VendingtMachine hotDirks = new VendingtMachine();
        hotDirks.tragingAutomatList(new HotDrink("Lalle", 60,80)) //Полиморфизм - метод реализует дочерний класс от Produkt
                .tragingAutomatList(new HotDrink("Amerikano", 90,60))
                .tragingAutomatList(new HotDrink("Amerikano", 90,60));
        System.out.println(hotDirks.getProdukts());
        System.out.println("Ввести индекс интересующего напитка");
        hotDrinksVendingMachine.hotDrinksVend(hotDirks.getProdukts());
        System.out.println(hotDrinksVendingMachine.getDrink());

        System.out.println("-------Коллекция чая---------");

        VendingtMachine tea = new VendingtMachine();
        tea.tragingAutomatList(new Tea("Цейлонский",150,80))
                .tragingAutomatList(new  Tea("Королевский", 130, 75));
        System.out.println(tea.getProdukts());
    }
}