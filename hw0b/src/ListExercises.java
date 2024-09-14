import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
    if (L.isEmpty()){
        return 0;
    }
    else{
        return L.get(0) + sum(L.subList(1,L.size()));
    }
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> even_L = new ArrayList<>();
        for (int i : L ){
            if (i % 2 == 0){
                even_L.add(i);

            }

        }
        return even_L;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> common_L = new ArrayList<>();
        for (int i : L1){
            for (int j : L2){
                if (i == j){
                    common_L.add(i);

                }

            }

        }
        return common_L;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
       int count = 0;
       for (String word : words){
           for (int i = 0; i < word.length() ; i++){
               if (word.charAt(i) == c){
                   count++;
               }
           }
       }
    return count;
    }
}
