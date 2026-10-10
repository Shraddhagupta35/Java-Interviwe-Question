package ARRAYS;

        // without using array
//     public static int add(int a , int b){
//         int result = a + b;

//         return result;
//     }
// }
// public class Anonymous_array {
//     public static void main(String[] args) {
//         clc a = new clc();
//         int ans = a.add(7 , 8);
//         System.out.println(ans);
//     }   
// }
                 
        // using array
// public class Anonymous_array {

//     public static int add(int num[]){

//         int result = 0;
//         for (int i : num) {
//             result += i;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         int nums[] = {8,9,6,4};
//         int ans = add(nums);
//         System.out.println(ans);
//     }
// }


         // using anonymous array

public class Anonymous_array {

    public static int add(int num[]){
        
        int result = 0;
            for (int i : num) {
                    result += i;
            }
        return result;
    }
     public static void main(String[] args) {
                
                int ans = add( new int[]{8,9,6,4});
                System.out.println(ans);
    }
}
        
        
