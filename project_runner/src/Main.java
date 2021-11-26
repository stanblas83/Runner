import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.animation.AnimationTimer;

public class Main extends Application{



    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello world");
        Group root = new Group();
        Pane pane = new Pane(root);
        Camera camera = new Camera(600.0,400.0);
        GameScene theGameScene = new GameScene(pane,camera);

        root.getChildren().add(theGameScene.getBackLeft());
        root.getChildren().add(theGameScene.getBackRight());
        root.getChildren().add(theGameScene.getHero());

        primaryStage.setScene(theGameScene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
