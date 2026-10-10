// anagram means each words are make new word called anagram. eg -> keep -> peek 


package STRING;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        
        String str1 = "School Master";
        String str2 = "The Classroom java";


        //  remove whitespace and to convert empty string  -> SchoolMaster , TheClassroom

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" " , "");


        // to convert lowercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        // this method convert string to character array and returned array length = string length 
        // return a newly allocated character array

        char []arr1 = str1.toCharArray();
        char []arr2 = str2.toCharArray();


        // to sort char array in alphabetic order

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        if(Arrays.equals(arr1, arr2)){

            System.out.println("Its is an Anagram.");
        }else{

            System.out.println("not an Anagram.");
        }



    }
    
}
