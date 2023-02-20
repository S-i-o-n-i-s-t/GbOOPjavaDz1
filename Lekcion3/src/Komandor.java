import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Komandor extends Warrior{

    @Override
    public Iterator<Armament> iterator() {
        Iterator<Armament> iter = new Iterator<Armament>() {

            int index;

            @Override
            public boolean hasNext() {
                return index < armaments.size();
            }

            @Override
            public Armament next() {
                return armaments.get(index++);
            }
        };

        return iter;
    }
}
