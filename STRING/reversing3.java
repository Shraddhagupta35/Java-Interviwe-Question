// this is a book or mango -> siht si a koob ro ognam.

package STRING;
public class reversing3 {
    
    public static void main(String[] args) {
        
         String s1 = "this is a book or mango";
         String s2 = "";


         // to remove whitespaces and convert array 

         String s3[] = s1.split(" ");

         for (String arr: s3) {
            for(int i=arr.length()-1; i>=0; i--){

                s2 = s2 + arr.charAt(i);
            }
           s2 = s2 + " ";
            
         }
            System.out.println("Before reversing string : "  + s1);
            System.out.println("After reversing string : " + s2);


    }   
}
