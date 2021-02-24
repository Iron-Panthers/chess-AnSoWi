public class Piece {
// Parent class for each piece
    int x,y;
    boolean isWhite;
    String name;


    public Piece(int x, int y, Boolean isWhite, String name)
    {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


}