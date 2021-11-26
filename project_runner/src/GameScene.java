import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.animation.AnimationTimer;

public class GameScene extends Scene {
    private Camera camera;
    private StaticThing backLeft;
    private StaticThing backRight;
    private Hero hero;

    public GameScene(Pane pane ,Camera camera){
        super(pane, 600, 400);
        this.backLeft = new StaticThing(0, 0,"/desert.png");
        this.backRight = new StaticThing(0,0,"/desert.png");
        this.hero = new Hero(100.0,250.0,"/heros.png",0);

        AnimationTimer timer = new AnimationTimer() {
            public void handle(long time){
                hero.update(time);
                camera.update(time);
                ImageView backgroundLeft = backLeft.getImage();
                backgroundLeft.setViewport(new Rectangle2D(camera.getX()%800, 0,800,400));
                backgroundLeft.setX(0);
                backgroundLeft.setY(0);
                ImageView backgroundRight = backRight.getImage();
                backgroundRight.setViewport(new Rectangle2D(0,0,camera.getX()%800,400));
                backgroundRight.setX(800-camera.getX()%800);
                backgroundRight.setY(0);
                setOnMouseClicked( (event)->{
                    System.out.println("Jump");
                    hero.jump();
                });
            }
        };
        timer.start();
    }

    public ImageView getBackLeft() {
        return backLeft.getImage();
    }

    public ImageView getBackRight(){return backRight.getImage();}

    public ImageView getHero(){return hero.getImage();}

}
