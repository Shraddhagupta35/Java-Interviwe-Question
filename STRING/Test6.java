package STRING;

public class Test6 {

    public static void main(String[] args) {
        
        System.out.println(""=="");    // empty string are true 
        System.out.println("");      // 
        System.out.println("A" == "A");  // char == char -> true
        System.out.println("a == A");  

        System.out.println();


        String s = "Hello World";
        s.trim();
        int i = s.indexOf(" ");
        System.out.println(i);

        System.out.println();

        String sr = "SACHIN TENDULKAR";
        int len = sr.trim().length();
        System.out.println(len);

        System.out.println();

        String s5 = " ";
        s5.trim();
        System.out.println(s5.equals("") + " " + s5.isEmpty());   // isempty is boolean value agr uski lenght 0 hogi to true return krega otherwise false
    }
    
}
