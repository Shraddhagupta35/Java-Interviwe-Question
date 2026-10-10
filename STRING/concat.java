package STRING;

public class concat {
    public static void main(String[] args) {
        
        String s1 = "apple";  // scp mai bnega 
        String s2 = s1.concat("singh"); // ye heap area mai memory lega
        String s3 = "apple" + "ball" + "cat";
        String s4 = s1 + s2;  // reference variable ke vjh se heap area mai bnega 
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        // concat method bs ek bar kisi ko add krega ek sath nhi kr skta but + ke through hum 
        // bahut sari string ko add kr skte h
    }
    
}
