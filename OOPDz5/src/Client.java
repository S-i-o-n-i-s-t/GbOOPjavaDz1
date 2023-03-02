public class Client<T extends Transport> {
    private Worker worker;
    private T transportClient;
    public T setClient(T transport) {
        return transportClient = transport;
    }
    public Worker setWorkerClient(Worker worker){
        return this.worker = worker;
    }
    public T getClient() {
        return transportClient;
    }
}
