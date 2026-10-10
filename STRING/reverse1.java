// to print reverse string "hey rabbit" -> 'tibbar yeh'


package STRING;
public class reverse1 {
    public static void main(String[] args) {
        
        String str = "hey rabbit";
        String str2 = "";

        for(int i=str.length()-1; i>=0; i--){
            str2 += str.charAt(i);
        }
        System.out.println("Before reversing string: " + str);
        System.out.println("After revering string: " + str2);
    }
}
