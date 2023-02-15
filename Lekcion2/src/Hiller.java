public class Hiller extends BaseHero{
    int bintMax;
    int bint;

    public Hiller(){
        super(String.format("Hero_Hiller #%d",++Magician.number),
                Hiller.r.nextInt(100,200));
        this.bintMax = Hiller.r.nextInt(50,150);
        this.bint = bintMax;
    }

    public String getInfo(){
        return String.format("%s Bint: %d", super.getInfo(), this.bint);
    }
}
