import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class StaticThing {
    private double x,y;
    private ImageView image;

    public StaticThing(double x,double y,String fileName ){
        this.x = x;
        this.y =y ;
        this.image = new ImageView(new Image(fileName));
    }

    public ImageView getImage() {
        return image;
    }
}
