import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);
        numbers.add(1);
        numbers.add(7);
        numbers.add(8);

        // numbers.remove(Integer.valueOf(2));
        // numbers.clear();

        // numbers.sort(Comparator.naturalOrder());
        // numbers.sort(Comparator.reverseOrder());

        // System.out.println(numbers.get(2));
        // System.out.println(numbers.toString());
        // System.out.println(numbers.isEmpty());
        // System.out.println(numbers.size());
        // System.out.println(numbers.contains(Integer.valueOf(20)));
        numbers.sort(null);
        System.out.println("Before" + numbers.toString());

        numbers.forEach(number ->{
            numbers.set(numbers.indexOf(number), number *2);
            System.out.println(number *2);
        });
        numbers.sort(null);
    //    System.out.println(numbers.toString());
    System.out.println("After"+ numbers.toString());

        


    }

}
