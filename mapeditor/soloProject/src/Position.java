public class Position {

    private int row;
    private int col;

    public Position (int col, int row){
        this.row=row;
        this.col=col;
    }

    public Position getPosition(){
        return new Position(this.col,this.row);
    }

    public void setPosition (Position position){
        position=getPosition();
    }






    public int getCol(){
        return this.col;
    }

    public void setCol(int col){
        this.col=col;
    }

    public void setRow(int row){
        this.row=row;
    }



    public int getRow(){
        return this.row;
    }




}
