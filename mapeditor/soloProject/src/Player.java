import java.awt.*;
import java.util.HashSet;
import java.util.Set;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.w3c.dom.ls.LSOutput;;

public class Player {

    private Rectangle rectangle;
   // private Rectangle path;
    private Position playerPosition;
    private Game game;
    private boolean isDraw=false;
    //private Position pathPosition;
    //Position [] positionArray;
    //Set<Position> positionSet= new HashSet<>();


    public Player(Game game) {
        this.playerPosition=new Position(0,0);
        this.rectangle = new Rectangle(playerPosition.getCol(), playerPosition.getRow(), 20, 20);
        //this.path= new Rectangle(game.getPositionOnTheGrid().getCol()* Game.DISTANCEEMPIXEIS,game.getPositionOnTheGrid().getRow()* Game.DISTANCEEMPIXEIS,20,20);
        //this.playerPosition = new Position(game.getPositionOnTheGrid().getCol(), 0);
        //this.pathPosition= new Position (0,0);
        rectangle.setColor(Color.GREEN);
        this.game = game;

    }
public Position getPlayerPosition(){
        return this.playerPosition;
}

   /* public Set<Position> getPositions() {
        return positionSet;
    }*/

    public boolean getBoolean(){
        return this.isDraw;
    }
    public void setBoolean(boolean isDraw){
        this.isDraw=isDraw;
    }

    public Rectangle getRectangle() {
        return this.rectangle;
    }

    public void move(DIRECTION direction) {

        switch (direction) {

            case RIGTH:
                System.out.println("estou aqui"); //se eu fizer Game.field[i][j] estou a aceder a uma posição espercífica

                if (playerPosition.getCol() < Game.getComprimento()) {
                    playerPosition.setCol(playerPosition.getCol() + 1);//aqui estou a alterar efetivamente a posição

//A POSIÇÃO DO PATH ESTA EM PIXEIS E A DO PLAYER ESTA EM X E Y
                    //o rectangle n tem qq relacao com a player position
                    //path = new Rectangle(playerPosition.getCol() * Game.DISTANCEEMPIXEIS, playerPosition.getRow() * Game.DISTANCEEMPIXEIS, 20, 20);

                    rectangle.translate(Game.DISTANCEEMPIXEIS, 0);//para o translate so importa a distancia que ele anda

                }
                break;
            case LEFT:
                if (playerPosition.getCol()> 0) {
                    playerPosition.setCol(playerPosition.getCol() - 1);
                    System.out.println("row: " + playerPosition.getRow() + " col: " + playerPosition.getCol());
                    //path = new Rectangle(playerPosition.getCol() * Game.DISTANCEEMPIXEIS, playerPosition.getRow() * Game.DISTANCEEMPIXEIS, 20, 20);
                    rectangle.translate(-Game.DISTANCEEMPIXEIS, 0);
                }
                break;

            case UP:
                System.out.println("row: " + playerPosition.getRow() + " col: " + playerPosition.getCol());
                if (playerPosition.getRow() > 0) {
                    playerPosition.setRow(playerPosition.getRow() - 1);
                    rectangle.translate(0, -Game.DISTANCEEMPIXEIS);
                    //path = new Rectangle(game.getPositionOnTheGrid().getCol() * Game.DISTANCEEMPIXEIS, playerPosition.getRow() * Game.DISTANCEEMPIXEIS, 20, 20);


                }
                break;

            case DOWN:
                if (playerPosition.getRow() < Game.getAltura()) {
                    playerPosition.setRow(playerPosition.getRow() + 1);
                    System.out.println("row: " + playerPosition.getRow() + " col: " + playerPosition.getCol());
                    rectangle.translate(0, Game.DISTANCEEMPIXEIS);
                    //path = new Rectangle(playerPosition.getCol() * Game.DISTANCEEMPIXEIS, playerPosition.getRow() * Game.DISTANCEEMPIXEIS, 20, 20);

                }
                break;


        }

    }
// boolean para esta pintado?
    //se estiver faz delete ou fizer parte da lista faz delete
    //se nao tiver faz set e acrescenta à lista


    /*public void drawPath(Position playerPosition) {//nao estou a associar o movimento do player a grid //hipotese 300000: percorrer a lista, quando a poição do player for igual à posição da grid ele vai ver se a posicao esta pintada

            if (!isDraw) {//se nao está pintado
                game.drawField().setColor(Color.MAGENTA);//pinta
                game.drawField().fill();
                isDraw = true;//fica pintado
                game.getPositionSet().add(game.getPositionOnTheGrid());
                //positionSet.add(game.getPositionOnTheGrid());//adiona a lista
            } else {
                game.drawField().setColor(Color.WHITE);
                game.drawField().fill();
                game.getPositionSet().remove(game.getPositionOnTheGrid());
            }
            //game.getPositionOnTheGrid().setCol(playerPosition.getCol());
            //game.getPositionOnTheGrid().setRow(playerPosition.getRow());
            //System.out.println("x,y PP=" + playerPosition.getCol() + " " + playerPosition.getRow() + "  x,y Path=" + path.getX() + " " + path.getY());

            //positionSet.add(playerPosition);//adiciona ao set a posição pintada
            //System.out.println("Adicionei uma posição à set");
            //System.out.println(positionSet.isEmpty());
//qual o critério para guardar

        //ESTA SEMPRE FALSE POR ISSO E QE NAO SAI DO CICLO

    }   */






        public void check (Position playerPosition){
            if(game.getField()[playerPosition.getRow()][playerPosition.getCol()].isFilled()){
                game.getField()[playerPosition.getRow()][playerPosition.getCol()].setColor(Color.BLACK);
                game.getField()[playerPosition.getRow()][playerPosition.getCol()].draw();

                System.out.println("tirei uma posição à set");
            }
            else {
                game.getField()[playerPosition.getRow()][playerPosition.getCol()].setColor(Color.MAGENTA);//pinta
                game.getField()[playerPosition.getRow()][playerPosition.getCol()].fill();

            }
        }
    }





                //while isDraw=true// se o quadrado tiver pintado e clicar no A fica apagado (path.delete), está livre
                //é apagado
                //se ele aceder a uma posição que esteja na lista signifca que o quadrado esta pintado





