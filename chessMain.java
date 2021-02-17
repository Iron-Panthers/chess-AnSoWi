public class chessMain
{
    public static Piece[][] chessBoard = new Piece[8][8];
    public static void main(String[] args)
    {
        // initialize chess pieces
        pieceInit();
        printBoard();
        Rook one = new Rook(8, 8, true);
    }



    public static void pieceInit()
    {
        // fill board with empty spaces
        for (int y = 0; y <= 7; y++)
        {
            for (int x = 0; x <= 7; x++)
            {
                    chessBoard[x][y] = null;
            }
            
        }


        // fill in all of the pieces.

    }


    public static void printBoard()
    {
         // fill board with empty spaces

         // for every row...
         for (int y = 0; y <= 7; y++)
         {
             // for every column
             for (int x = 0; x <= 7; x++)
             {
                 // print the value of the chess board piece
                 System.out.print("[" + chessBoard[x][y] + "]    ");
 
             }
             System.out.print("\n\n");
             System.out.println("");
         }
    }


}