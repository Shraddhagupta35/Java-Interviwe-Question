package STRING.MUTABLE;

public class Trimtosize {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(150);   // iski capacity 150 initilize kr diya to fix kr diya iski capacity
        System.out.println(sb.capacity());
        sb.append("java");   // 4 character
        System.out.println(sb);
        sb.trimToSize();      // trimToSize() jo original capacity - add chatacter -> 150-4 = 146 || ish method ka mtlb jitna sting add kra rhe h bs utna uski capacity btata h
        System.out.println(sb.capacity());


        StringBuilder st = new StringBuilder("Shraddha Gupta");
        System.out.println(st.reverse());                                // reverse the string
    }
    
}
