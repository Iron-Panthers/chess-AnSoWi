public class Queen extends Piece {
    // private boolean isWhite;
    // private int x;
    // private int y;

    public Queen(int x, int y, boolean isWhite, String name)
    {
        super(x, y, isWhite, name);
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
        this.name = name;

    }
    
}