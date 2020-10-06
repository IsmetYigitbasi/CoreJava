
import java.util.Scanner;

public class ForEach {
    /*
        For each loop is used in Arrays. Also I would say that it can be used in Java Collection.
        In this loop every element is checked one by one like a counter.
        From index 0 to arrayName.length() or arrayListName.size()
        if you wanna to reach elements one by one, you can easily use it.
     */

    public static void main(String[] args) {
        String[] pcBrand = new String [] {"Apple", "Lenovo", "Asus", "Dell", "HP"};
        int order = 1;
        for (String s : pcBrand) {
            System.out.println(  order + ". Brand is " + s);
            order++;
        }

    }
}
