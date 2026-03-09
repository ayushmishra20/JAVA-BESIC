import java.util.*;

public class hashmap {
    public static void main(String[] args){
        HashMap <String, Integer> Examscores = new HashMap <String, Integer>();

        Examscores.put("Math", 99);
        Examscores.put("Hindi", 98);
        Examscores.put("Social Science", 78);
        Examscores.put("Drawing", 75);
        Examscores.put("Science", 92);

        Examscores.putIfAbsent("Maths", 100);
        Examscores.replace("Maths", 100);
        Examscores.clear();
        Examscores.remove("Social Science");

        System.out.println(Examscores.toString());
        System.out.println(Examscores.size());
        System.out.println(Examscores.getOrDefault("religion", -1));
        System.out.println(Examscores.containsKey("Maths"));
        System.out.println(Examscores.containsValue(99));
        System.out.println(Examscores.isEmpty());

        Examscores.forEach((Subject, score) ->{
            System.out.println(Subject + "-" + score);
        });

        Examscores.forEach((Subject, score) ->{
            Examscores.replace(Subject, score - 10);
        });

        System.out.println(Examscores.toString());


    }
}
