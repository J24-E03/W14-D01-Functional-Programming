import java.util.function.BiConsumer;


public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<String, Integer> helloAgeAndName = (name,age)->{
            System.out.printf("Hello %s your age is %d\n",name,age);
        };
        helloAgeAndName.accept("Aron",44);




    }
}
