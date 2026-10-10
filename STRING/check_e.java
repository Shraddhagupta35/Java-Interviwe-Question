// write a program to check if the 'e' is present in the word 'Umbrella'.
package STRING;

public class check_e {
    public static void main(String[] args) {
        
        String str = "Umbrella";
        boolean str2 = false;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e'){
                str2 = true;
                break;    
            }
        }
        System.out.println(str2);
    }
    
}
