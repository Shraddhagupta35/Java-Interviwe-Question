// write a program to reverse the word "pussy cat" ->  cat pussy

package STRING;

public class reverse2 {
    public static void main(String[] args) {

         String str1 = "pussy cat";
         String str2 = "";

         // split() word ko array mai convert kr deta h aur space ko split krta hai ["pussy" , "cat"]

         String str3[] = str1.split(" ");

         for(int i=str3.length-1; i>=0; i--){
            str2 = str2 + str3[i] + " ";
         }

         System.out.println("Before reversing word : " + str1);
         System.out.println("After reversing word : " + str2);
         
    }
}
