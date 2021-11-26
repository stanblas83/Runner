import javafx.scene.image.ImageView;

abstract public class AnimatedThing {
    private Double x;
    protected Double y;
    private ImageView image;
    protected Integer attitude;

    public AnimatedThing(Double x, Double y, String fileName, Integer attitude){
        this.x=x;
        this.y=y;
        this.image = new ImageView(fileName);
        this.attitude = attitude;
    }

    public ImageView getImage() {
        return image;
    }

    public Integer getAttitude() {
        return attitude;
    }

    public Double getY() {
        return y;
    }
}
