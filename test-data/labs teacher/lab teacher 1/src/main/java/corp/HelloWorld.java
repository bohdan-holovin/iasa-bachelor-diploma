package corp;

public class HelloWorld {

    public String helloWorld() {

        return getString();
    }

    private String getString() {
        return getString1();
    }

    private String getString1() {
        System.out.println("Hello world");
        return "Hello world";
    }
}