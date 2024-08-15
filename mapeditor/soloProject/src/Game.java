import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Game {
    public final static int DISTANCEEMPIXEIS= 20;
    private Player p1= new Player(this);

    private Handler h1= new Handler(p1);
    private Position positionOnTheGrid;
    Set<Position> positionSet= new HashSet<>();
    //tenho de criar uma estrutura de dados que me guarde as posições
    //associar o meu floor à position da grid


//associar uma posição a cada retangulo da matriz para conseguir fazer o match!!

    private static Rectangle[][] field;
    //isto é o comprimento

    //comrpimento=11
    //largura=9
    //field.length- da me o numero de arrays da matriz e de rows
    //field[0].length- da me o numero de elemnetos de cada um dos array
    //field [i][j].length- da me o comprimento da string de uma determinada posição
    //field[i].length*field.length-da me o numero total de elementos

    public Game (){
        this.field=field;
        this.p1=p1;
        this.h1=h1;
        this.positionOnTheGrid=new Position(0,0);

    }
    public Set<Position> getPositionSet(){
        return this.positionSet;
    }

    public Position getPositionOnTheGrid(){
        return this.positionOnTheGrid;
    }



    public static Rectangle[][] getField(){
        return field;
    }

    public void init(){
        drawField();
    }


    public static int getComprimento (){
        return field.length-1;
    }

    public static int getAltura() {
        return field[0].length-1;

    }

    public void drawField(){
       field=new Rectangle[10][10];

        for(int i=0; i<10;i++){
          for (int j=0; j<10;j++){
              positionOnTheGrid.setRow(i);
              positionOnTheGrid.setCol(j);
              //positionOnTheGrid=new Position(i,j);//a cada criação iteração ele vai criar uma posiçao
              //positionSet.add(positionOnTheGrid);//adiciona essa posição à lista
              field[i][j]= new Rectangle(positionOnTheGrid.getCol()*DISTANCEEMPIXEIS, positionOnTheGrid.getRow()*DISTANCEEMPIXEIS, DISTANCEEMPIXEIS,DISTANCEEMPIXEIS);//estou a atualizar a posição do retangulo mas nao estou a guarda-la, vou ter de a guardar na estrutura de dados
              field[i][j].draw();
              //duvida: como é que depois eu associo essa posição guardada à posição do retangulo
              System.out.println("x= " + positionOnTheGrid.getCol() + "y= " + positionOnTheGrid.getRow());
//teoricamente ja tenho uma grid com uma posição


          }
      }
        ;
    }

    public void drawPlayer(){
        p1.getRectangle().draw();//Aqui coloco o rectangulo
        p1.getRectangle().fill();

    }



}
