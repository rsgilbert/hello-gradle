package hello;
import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is" + currentTime);
    }
}