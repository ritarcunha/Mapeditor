import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Handler implements KeyboardHandler {

    public Keyboard keyboard;
    public Player player;

    public Handler(Player player) {
        this.player = player;
        keyboard = new Keyboard(this);
        createKeyboardEvents();
    }

    private void createKeyboardEvents() {

            KeyboardEvent keyboardEventRight = new KeyboardEvent();
            keyboardEventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboardEventRight.setKey(KeyboardEvent.KEY_RIGHT);
            keyboard.addEventListener(keyboardEventRight);

            KeyboardEvent keyboardEventLeft = new KeyboardEvent();
            keyboardEventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboardEventLeft.setKey(KeyboardEvent.KEY_LEFT);
            keyboard.addEventListener(keyboardEventLeft);

        KeyboardEvent keyboardEventUp = new KeyboardEvent();
        keyboardEventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventUp.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(keyboardEventUp);

        KeyboardEvent keyboardEventDown = new KeyboardEvent();
        keyboardEventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventDown.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(keyboardEventDown);

        KeyboardEvent keyboardEventDelete = new KeyboardEvent();
        keyboardEventDelete.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventDelete.setKey(KeyboardEvent.KEY_A);
        keyboard.addEventListener(keyboardEventDelete);



        KeyboardEvent keyboardEventSpace = new KeyboardEvent();
            keyboardEventSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboardEventSpace.setKey(KeyboardEvent.KEY_SPACE);
            keyboard.addEventListener(keyboardEventSpace);
        }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                player.move(DIRECTION.RIGTH);//funcao que liga ao player
                break;

            case KeyboardEvent.KEY_LEFT:
                player.move(DIRECTION.LEFT);
                break;

            case KeyboardEvent.KEY_SPACE:
                System.exit(1);
                break;

            case KeyboardEvent.KEY_UP:
                player.move(DIRECTION.UP);
                break;

            case KeyboardEvent.KEY_DOWN:
                player.move(DIRECTION.DOWN);
                break;

            case KeyboardEvent.KEY_A:
                player.check(player.getPlayerPosition());
                //player.drawPath(player.getPlayerPosition());
                //player.setBoolean(true);

                //está pintado?
                //se sim se carregar no A faz delete
                //se não se carregar no A pinta

                /*while(player.getBoolean()){
                    player.drawPath();
                }
                if(!player.getBoolean()) {
                    player.drawPath();
                    player.setBoolean(true);
                }
                else{
                    player.drawPath();
                }/*/


                    //}
                    //
                break;



        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
