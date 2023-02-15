import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    public BaseHero(String name, int maxHp, int hp) {
        this.name = name;
    }


    public BaseHero(){};


    public abstract String getInfo();

    public abstract void healed(int Hp);
    public abstract void GetDamage(int damage);
    public abstract void GetHill(int hill);

    public abstract void Attack(BaseHero target);
    public abstract void Hills(BaseHero target);
    public abstract void die();
}
