public class chessMain
{

    // Variable names fit their uses
    public static Piece[][] chessBoard = new Piece[8][8];
    public static Piece[][] whitePieces = new Piece[8][8];
    public static Piece[][] blackPieces = new Piece[8][8];
    
    public static void main(String[] args)
    {
        // initialize chess pieces
        pieceInit();
        printBoard();
        
    }



    public static void pieceInit()
    {
        // fill piece arrays with null spaces (clear out anything if there)
        for (int y = 0; y <= 7; y++)
        {
            for (int x = 0; x <= 7; x++)
            {
                    chessBoard[x][y] = null;
                    whitePieces[x][y] = null;
                    blackPieces[x][y] = null;
            }
            
        }

            // assign each piece for piece array
        /*
        ATTENTION, FOR WHITE/BLACK PIECES, X = TYPE, Y = INDEX

        X~~
        0: PAWNS
        1: ROOKS
        2: BISHOPS
        3: KNIGHTS
        4: QUEEN
        5: KING
        
        */

        // assign Pawns
        for (int i = 0; i < 8; i++)
        {
            whitePieces[0][i] = new Pawn(i, 6, true, "WP - " + (i + 1));
            blackPieces[0][i] = new Pawn(i, 1, false, "BP - " + (i + 1));

            chessBoard[i][1] = blackPieces[0][i];
            chessBoard[i][6] = whitePieces[0][i];
        }

        // assign Rooks
        whitePieces[1][0] = new Rook(0, 7, true, "WR - 1"); whitePieces[1][1] = new Rook(7, 7, true, "WR - 2");
        blackPieces[1][0] = new Rook(0, 0, false, "BR - 1"); blackPieces[1][1] = new Rook(7, 0, false, "BR - 2");

        // assign rooks to board

        chessBoard[0][0] = blackPieces[1][0];   chessBoard[7][0] = blackPieces[1][1];
        chessBoard[0][7] = whitePieces[1][0];   chessBoard[7][7] = whitePieces[1][1];


        

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
                 if (chessBoard[x][y] != null)
                 {
                    System.out.print("[" + chessBoard[x][y].getName() + "]    ");
                 }else 
                 {
                    System.out.print("[" + chessBoard[x][y] + "]    ");
                 }

                 
 
             }
             System.out.print("\n\n");
             System.out.println("");
         }
    }

    


}