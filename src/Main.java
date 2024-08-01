interface automobiles{
    public void add_gear(int val);


}
class car implements automobiles{
    int gear = 0;
    public void add_gear(int val){
        gear += val;
        System.out.println(gear);
    }
}

public class Main{

    public static void main(String[] args) {
        car obj = new car();
        obj.add_gear(5);
        System.out.println("Hello world!");
    }
}