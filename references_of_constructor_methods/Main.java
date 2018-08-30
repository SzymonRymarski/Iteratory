package references_of_constructor_methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] names={"Kowalski","Abacki","Wojnarek","Bednarek","Czyż"};
        Arrays.sort(names,Main::sortAscending);
        consumeArray(names,System.out::println);

        System.out.println(">>>");
        Arrays.sort(names,Main::sortDescending);
        consumerArray(names,System.out::println);
    }

}
