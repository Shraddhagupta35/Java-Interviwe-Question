/*siht  
 siht si
 siht si a
 siht si a koob
 siht si a koob ro
 siht si a koob ro ognam */


package STRING;

public class pattern_string {

    public static void main(String[] args) {
        
        String s1 = "this is a book or mango";
        String s2 = " ";

        String s3[] = s1.split(" ");

        for(String arr : s3){

            for(int i=arr.length()-1; i>=0; i--){
                s2 = s2 + arr.charAt(i);
            }
            s2 = s2 + " ";
            System.out.println(s2 + " ");
        }
    }
    
}
