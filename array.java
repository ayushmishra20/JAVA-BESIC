import java.util.Arrays;

import java.lang.reflect.Array;

public class array {
    public static void main(String[] args){
        char vovels[] = { 'a', 'e', 'i', 'o', 'u'};
        Array.sort(vovels);

        System.out.println(Array.toString(vovels));

    }
}
