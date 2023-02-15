public class Foo {
    public Integer value;

    public static Integer count;

    public Foo(){}

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
