public class Camera {
    private Double x;
    private Double y;
    public Camera(Double x,Double y){
        this.x = x;
        this.y = y;

    }
    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void update(long time){
        this.x = (x+2)%800;
    }

    @Override
    public String toString(){
        return x.toString() +' '+ y.toString();
    }
}
