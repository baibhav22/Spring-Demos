import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapandFilterExample {

    public static void main(String[] args) {
        List<String> employees= Arrays.asList("baibhav", "Rama", "Saha");
        List<String> employeesconverted = employees.stream().filter(x->!"baibhav".equals(x)).collect(Collectors.toList());
        System.out.println("Using Lambda approcah");
        System.out.println(employeesconverted.toString());

        List<String> createBlankString= new ArrayList<>();
        for(String str:employees){
            if(!str.equals("baibhav")){
                createBlankString.add(str);
            }
        }
        System.out.println("Using classical approach");
        System.out.println(createBlankString.toString());
    }
}
