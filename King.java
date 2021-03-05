class King extends Piece
{

    public King(int x, int y, boolean isWhite, String name)
    {
        super(x, y, isWhite, name);
        this.isWhite = isWhite;
        this.x = x;
        this.y = y;
        this.name = name;
    }
        //returns coradinates
   public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean isWhite() {
        return isWhite;
    }

        //Checks if it is still on board
    public boolean isOnBoard(int destination_x, int destination_y)
    {
        if(destination_x > 8 || destination_x < 0) {
            return false;
        }
        if(destination_y > 8 || destination_y < 0) {
            return false;
        }
        else
        {
            return true;
        }
    }

    //Where it can move
    public boolean canMove(int destination_x, int destination_y){
        if ((Math.abs(x - destination_x) == 1) || ((Math.abs(y - destination_y) == 1)) && (Math.abs(x - destination_x) >= 1) || ((Math.abs(y - destination_y) >= 1)));
            return true;
    }

}