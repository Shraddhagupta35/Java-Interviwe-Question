package STRING;

public class Test2 {

    public static void change(StringBuilder s){

        s.append("_Morning");
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Good");
        change(sb);
        System.out.println(sb);
    }
    
}
