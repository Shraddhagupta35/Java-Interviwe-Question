package STRING.MUTABLE;

public class Stringbuilder {
    
    public static void main(String[] args) {
        
      final  StringBuffer s = new StringBuffer("abcs");   // final keyword mutablity ko change nhi kr rha h uski reference variable ko change kr rha h isme kuch 
                                                                 // isme kuch bhi update or insert krna chahe to kr skte h but heap area mai sirf refrence ko change krega
        s.append("asdfg");
        System.out.println(s);

        
        StringBuffer sb = new StringBuffer("khushi");
        System.out.println(sb);
    }
}
