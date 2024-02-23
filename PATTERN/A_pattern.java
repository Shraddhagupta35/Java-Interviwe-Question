/* to print   ****** 
             *      *
             *      *
             ********
             *      *
             *      *
             *      *
 */

package PATTERN;

public class A_pattern {

    public static void A_hollow(int trow , int tcol ){
        for(int i=0; i<=trow; i++){
            for(int j=0; j<=tcol; j++){
                if(i==0 && j>0 && j<(tcol-1)/2 || j==0 && i>0 || i==(trow-1)/2 && j<=(tcol-1)/2 || j==(tcol-1)/2 && i>0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        A_hollow(7, 8);
    }
    
}
