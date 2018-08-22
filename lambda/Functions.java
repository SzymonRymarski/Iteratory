package lambda;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args){
        Function<String,String> func=(String str)->str.toLowerCase();
        String orginal="WIELKI NAPIS";
        String lowerCaseTrim=func.apply(orginal);
        System.out.println(lowerCaseTrim);
    }
}
