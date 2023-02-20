import java.util.*;


public class Main {
    public static void main(String[] args) {
        Komandor komandor = new Komandor();
        komandor.addArmament(new Sword());
        komandor.addArmament(new Bow());
        komandor.addArmament(new Spear());
        for (var armaments:komandor) {
            System.err.println(armaments);
        }
        Random random = new Random();
        List<Integer> number = new ArrayList<>();
        for (int index = 0; index < 5; index++){
            number.add(random.nextInt(1,20));
        }
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);
    }

}