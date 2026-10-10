package LOOP;

public class Foreach2_prac {
    public static void main(String[] args) {
        int nums[][] = {{3,5,6,7},
                         {9,0,5,3},
                         {7,1,2,4},
                         {4,5,6,9}};

         for(int a[] : nums){
            for(int b : a){
                System.out.print(b + " ");
            }
         }          
    }
    
}
