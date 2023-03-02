import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method Pattern (Реализация через Client)");

        Client<Scooter> client = new Client<>();
        System.out.println(client.setClient(new Scooter(50,5)));
        System.out.println(client.getClient());

        Client<Moped> client2 = new Client<>();
        client2.setClient(new Moped(65,7, client2.setWorkerClient(new Worker("Yasya", 300))));
        System.out.println(client2.getClient());

        client2.setClient(new Moped(65,7));
        System.out.println(client2.getClient());
    }
}