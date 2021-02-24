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
    
}