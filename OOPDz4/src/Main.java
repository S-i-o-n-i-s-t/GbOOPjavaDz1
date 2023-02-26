import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ParkTaxi<Auto> taxi = new ParkTaxi();
        taxi.addAuto(new RussCar("Lada","Blak",294,1995));
        taxi.addAuto(new Auto("Suzuki","Red",294,1990));
        taxi.addAuto(new Auto("Volvo","Blue",529,2009));
        taxi.addAuto(new Auto("Niva","Yellow",777,2003));
        taxi.addAuto(new Auto("Audi","White",027,2021));
        Collections.sort(taxi.getParkTaxi());
        Iterator<Auto> autoPark = taxi;
        while (autoPark.hasNext()){
            System.out.println(autoPark.next());
        }

        ParkTaxi<RussCar>  rusTaxi = new ParkTaxi();
        rusTaxi.addAuto(new RussCar("Lada","Blak",294,1995));
        System.out.println(rusTaxi.getParkTaxi());

        ParkTaxi<ForeignCar> foreignTaxi = new ParkTaxi();
        foreignTaxi.addAuto(new ForeignCar("Suzuki","Red",294,1990));
        foreignTaxi.addAuto(new ForeignCar("Volvo","Blue",529,2009));
        foreignTaxi.addAuto(new ForeignCar("Niva","Yellow",777,2003));
        foreignTaxi.addAuto(new ForeignCar("Audi","White",027,2021));

        System.out.println(foreignTaxi.getParkTaxi());
    }

}