package PROJECT;
//  import java.util.random;
 import java.util.Scanner;

class TTT{
  static  char[][] board;

    public TTT(){
        board = new char[3][3];
        initBoard();
    }

    // initialize the
    void initBoard(){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = ' ';
            }
        }
    }

    void dispBoard(){
        System.out.println("-------------");
        for(int i=0; i<board.length; i++){
            System.out.print("| ");
            for(int j=0; j<board[i].length; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
            
        }
    }

    static void placeMark(int row , int col , char mark){
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2){
            board[row][col] = mark;
        }else{
            System.out.println("Invalid Position");
        }
    }

    static boolean checkColWin(){
        for(int j=0; j<=2; j++){
            if(board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]){
                return true;
            }
        }
        return false;   
    }

    static boolean checkRowWin(){
        for(int i=0; i<=2; i++){
            if( board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return true;
            }
        }
        return false;
    } 

   
    static boolean checkDiagnWin(){

        if( board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] != ' ' && 
               board[0][2]  == board[1][1] && board[1][1] == board[2][0] ){
                 return true;
            }else{
                  return false;
        }
    }



}

  class HumanPlayer{

        String name;
        char mark;

        HumanPlayer(String name , char mark){
            this.name = name;
            this.mark = mark;
        }

        void makeMove(){
           Scanner Scan = new Scanner(System.in);
           int row; 
           int col;
           do{
               System.out.println("Enter the row and col : ");
               row = Scan.nextInt();
               col = Scan.nextInt();
            //    Scan.close();
            }while(!isValidMove(row, col));

            TTT.placeMark(row, col, mark);
            

        }

        boolean isValidMove( int row , int col){

            if(row >=0 && row <=2 && col >=0 && col <=2){

                if(TTT.board[row][col] == ' '){
                    return true;
                }
            }
            return false;
        }
}


public class TicTacToe1 {
    public static void main(String[] args) {
        TTT t = new TTT();

        HumanPlayer P1 = new HumanPlayer("Rabbit", 'X');
        HumanPlayer P2 = new HumanPlayer("Harry", 'O');

        HumanPlayer cp;
        cp = P1;
      

        while(true){

            System.out.println(cp.name + " turn ");
            cp.makeMove();
            t.dispBoard();

            if(TTT.checkColWin() || TTT.checkRowWin() || TTT.checkDiagnWin()){

                System.out.println(cp.name + " has won ");
                break;

            }else{
                
                if(cp == P1){
                    cp = P2;
                }else{
                    cp = P1;
                }
            }
       
        }

        
    }
    
}
