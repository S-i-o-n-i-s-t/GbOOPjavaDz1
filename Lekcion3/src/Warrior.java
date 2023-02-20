import java.util.ArrayList;
import java.util.List;

public abstract class Warrior implements Iterable<Armament>{
    public List<Armament> armaments;
    private int index;

    public Warrior() {
        this.armaments = new ArrayList<>();
        this.index = 0;
    }
    public void addArmament(Armament armament){
        armaments.add(armament);
    }
}
