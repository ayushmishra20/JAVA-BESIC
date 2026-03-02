import java.util.Arrays;

public class array {
    public static void main(String[] args){
// array has 5 value and index will start from 0

        // char vovels = new char [5];

        char vovels[] = { 'a', 'e', 'o', 'i', 'u'};
        Arrays.sort(vovels);

        System.out.println(Arrays.toString(vovels));
        System.out.println(vovels.length);

        int startingIndex = 1;
        int endingIndex = 4;

        Arrays.sort(vovels1 , startingIndex, endingIndex);
        System.out.println(Arrays.toString(vovels1));

// if search fail will give you negative value

        char vovels1[] = {'e','a','o','u','i'};

        Arrays.sort(vovels1);

        int startingIndex = 1;
        int endingIndex = 4;
        char key = 'o';

        int foundIndexItem = Arrays.binarySearch(vovels1,startingIndex, endingIndex, key);

        System.out.println(Arrays.toString(vovels1));

        System.out.println(foundIndexItem);
// copy array with index limit with change values

        char vovels1[] = {'e','a','o','u','i'};

        int startingIndex = 1;
        int endingIndex = 2;

        Arrays.fill(vovels1, startingIndex, endingIndex, 'y');
        System.out.println(Arrays.toString(vovels1));

// copy array with the indexes
        int numbers[] = {'1', '2', '3','4','5','6'}

        int startingIndex = 1;
        int endingIndex = 2;

        int copyofNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);
        Arrays.fill(numbers, 0);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyofNumbers));

// this copy the array of same length
        int copyofNumbers[] = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.equals(numbers, copyofNumbers));


        // ----------these all code with eror use it after debuging--------//

    }
}
