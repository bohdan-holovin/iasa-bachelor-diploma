package corp;

public class HelloWorld {

    public String helloWorld() {

        extracted();
        return "Hello world";
    }

    private void extracted() {
        System.out.println("Hello world");
    }
}