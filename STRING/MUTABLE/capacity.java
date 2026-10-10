package STRING.MUTABLE;

public class capacity {

    public static void main(String[] args) {
        
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());  // how many charcter you can add ?  

        //  /*  initially capacity is 16 but  if you are add extra of 16 character then change capacity  . [capacity = old capacity + 1 *2] */

        //  sb.append("shytreuioqwerabbit sjuir iut");
        //  System.out.println(sb.capacity());
        //  System.out.println(sb.length());      // how many character are present


         System.out.println();

         StringBuffer sb = new StringBuffer("Shraddha");
         System.out.println(sb);
         System.out.println(sb.capacity());  // agr object create krte time constructor mai value dete h to uski capacity mai add hota h 16 + 8 = 24
         System.out.println(sb.charAt(6));
         sb.setCharAt(3, 'R');  // iska return type void h isliye print nhi kr skte h
         System.out.println(sb);
                

    }
    
}
