package STRING;

public class delete_constant {
    
        public static void main(String[] args) {
            String str = "Hello, have a good day";
            str = str.replaceAll("[^aeiouAEIOU\\s]", "");
            System.out.println(str);
        } 
    
}
