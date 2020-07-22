import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//public class FilterExample {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Baibhav", "Hari", "Chari");
//
//        for (String name : names) {
//            if(name!="Hari"){
//                System.out.println(name);
//            }
//        }
//
//    }
//}

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Baibhav", "Hari", "Chari");
        names.stream().
                filter(new Predicate<String>() {
                    @Override
                    public boolean test(String name) {
                        return !name.equals("Hari");
                    }
                }).
                forEach(new Consumer<String>() {
                    @Override
                    public void accept(String name) {
                        System.out.println(name);
                    }
                });

    }
}


