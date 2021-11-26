import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

public class Hero extends AnimatedThing{
    private Double m;
    private Double g;
    private Double a_y;
    private Double v_y;
    private Double f_y;


    public Hero(Double x, Double y, String fileName, Integer attitude){
        super(x, y, fileName, attitude);
        g = 0.7;
        m = 20.0;
        a_y = 0.0;
        v_y = 0.0;
        f_y = 14.0;
    }

    public void update(long time){

        a_y = (g-f_y/m);
        v_y += a_y;
        super.y = super.y+v_y;

        if (super.y<250){
            f_y=0.0;
        }

        if (super.y<50){
            v_y=0.0;
        }

        if (super.y>=250){
            f_y=14.0;
            v_y=0.0;
        }

        super.attitude = (super.attitude+1)%60;
        ImageView hero = super.getImage();
        if (v_y<0){
            hero.setViewport(new Rectangle2D(20.0,160.0,60.0,105.0));
        }
        else if (v_y>0){
            hero.setViewport(new Rectangle2D(95.0,160.0,70.0,105.0));
        }
        else if (attitude<=9){
            hero.setViewport(new Rectangle2D(20.0,0.0,60.0,100.0));
        }
        else if (attitude<=19){
            hero.setViewport(new Rectangle2D(95.5,0.0,70.0,100.0));
        }
        else if (attitude<=29){
            hero.setViewport(new Rectangle2D(170,10.0,85.0,90.0));
        }
        else if (attitude<=39){
            hero.setViewport(new Rectangle2D(270,0.0,70.0,100.0));
        }
        else if (attitude<=49){
            hero.setViewport(new Rectangle2D(345.5,0.0,70.0,100.0));
        }
        else if (attitude<=59){
            hero.setViewport(new Rectangle2D(425.5,15.0,80.0,85.0));
        }
        hero.setX(100);
        hero.setY(super.y);

    }

    @Override
    public ImageView getImage() {
        return super.getImage();
    }

    public void jump(){
        if (super.y>=250){
            f_y=+350.0;
        }
    }


}
