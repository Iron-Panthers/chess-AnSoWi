public class Rook extends Piece {


    public Rook(int x, int y, boolean isWhite, String name)
    {
        super(x, y, isWhite, name);
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
        this.name = name;
    }

    //Has to go either forward or backwards (no diagonal)
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean isWhite() {
        return isWhite;
    }
    public boolean inMovingRange(int destination_x, int destination_y) 
    {
        if(destination_x == x || destination_y == y) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    //still on the board
    public boolean isOnBoard(int destination_x, int destination_y)
    {
        if(destination_x >= 8 || destination_x < 0) {
            return false;
        }
        if(destination_y >= 8 || destination_y < 0) {
            return false;
        }
        else
        {
            return true;
        }
    }


    public boolean canMove(int destination_x, int destination_y, boolean isWhite, boolean isBlack) {
        //can't kill our own piece
        Piece possiblePiece = chessMain.getPiece(destination_x, destination_y);
        
        if (possiblePiece != null)
        {
        if (possiblePiece.isWhite() && this.isWhite()) {
            return false;
        }
        if (!possiblePiece.isWhite() && !this.isWhite()) {
            return false;
        }
    }
        //has to move in a straight line
        if (this.getX() != destination_x && this.getY() != destination_y) {
            return false;
        }

<<<<<<< Updated upstream
    

=======
<<<<<<< Updated upstream
>>>>>>> Stashed changes
//     public Rook(boolean color, int number) //Rook sophie = new rook(false, 2)
=======







//     public Rook(boolean color, int number) 
>>>>>>> Stashed changes
//     {
//         if(color) 
//         {
//             isWhite = true;
//         }
//         if(!color) 
//         {
//             isWhite = false;
//         }
//         if(number == 2 && isWhite)
//         {
//             x = 100;
//             y = 100;
//         }

//         if(number == 1 && isWhite) {
//             x = 0;
//             y = 100;
//         }
//         if(number == 1 && !isWhite) {
//             x = 0;
//             y = 0;
//         }

//         if (number == 2 && !isWhite) {
//             x = 100;
//             y = 100;
//         }

//     }

//    //Has to go either forward or backwards (no diagonal)
//     public int getX() {
//         return this.x;
//     }
//     public int getY() {
//         return this.y;
//     }
//     public boolean isWhite() {
//         return this.isWhite;
//     }
//     public boolean inMovingRange(int destination_x, int destination_y) 
//     {
//         if(destination_x == x || destination_y == y) 
//         {
//             return true;
//         }
//         else 
//         {
//             return false;
//         }
//     }
//     //still on the board
//     public boolean isOnBoard(int destination_x, int destination_y)
//     {
//         if(destination_x > 100 || destination_x < 0) {
//             return false;
//         }
//         if(destination_y > 100 || destination_y < 0) {
//             return false;
//         }
//         else
//         {
//             return true;
//         }
//     }


//     public boolean canMove(int destination_x, int destination_y, boolean isWhite, boolean isBlack) {
//         //can't kill our own piece
//         Piece possiblePiece = chessMain.getPiece(destination_x, destination_y);
        
//         if (possiblePiece != null)
//         {
//         if (possiblePiece.isWhite() && this.isWhite()) {
//             return false;
//         }
//         if (!possiblePiece.isWhite() && !this.isWhite()) {
//             return false;
//         }
//     }
//         //has to move in a straight line
//         if (this.getX() != destination_x && this.getY() != destination_y) {
//             return false;
//         }

//         //can't jump over pieces
//         if (direction.equals()) {
//             int spaces_to_move = Math.abs(destination_y - this.getY());
//             for (int i = 0; i < spaces_to_move; i++) {
                
//             }
//         }
//         return true;
//     }


}