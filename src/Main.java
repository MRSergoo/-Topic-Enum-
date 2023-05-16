

public class Main {
    public static void main(String[] args) {

        Colors col = Colors.RED;

        switch (col){
            case RED:
                System.out.println("RED flag " + " sale " + Colors.RED.getSale());
                break;
            case GREEN:
                System.out.println("GREEN flag");
                break;
            default:
                System.out.println("nothing");
                break;
        }
        System.out.println(col.ordinal());
        System.out.println(col.name());
        System.out.println(Colors.RED.action(22,81));
    }

}
