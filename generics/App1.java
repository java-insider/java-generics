package generics;

public class App1 {

    public static void main(String[] args) {
        Holder h1 = new Holder("Hello!");
        String obj1 = (String) h1.getObj();
        System.out.println(obj1);

        Holder h2 = new Holder(10);
        String obj2 = (String) h2.getObj();
        System.out.println(obj2);
    }
}
