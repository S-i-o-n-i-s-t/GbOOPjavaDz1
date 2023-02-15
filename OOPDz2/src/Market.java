import java.util.ArrayList;
import java.util.List;
public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Actor> queue;

    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {//M
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {//Q
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {//Q
        for(Actor actor: queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void giveOrders() {//Q
        for(Actor actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {//Q
        List<Actor> releasedActors = new ArrayList<>();
        for(Actor actor: queue){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди и готов уходить");
            }
        }
        releaseFromMarket(releasedActors);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {//M
        for(Actor actor: actors){
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {//M
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
