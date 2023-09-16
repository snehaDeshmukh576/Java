class Cylinder{
    private int height;
    private int radius;

    public Cylinder(int r,int h){
        this.radius=r;
        this.height=h;
    }

    public void setRadius(int r){
       this.radius=r;
    } 
    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        this.height=h;
    }
    public int getHeight(){
        return height;
    }
    public double SurfaceArea(){
        return 2* Math.PI * radius * height + 2* Math.PI * radius * radius;
    }
    public double Volume(){
        return Math.PI * radius * radius *height;
    }
}

public class GetterSetter2{
    public static void main(String args[]){
        Cylinder c=new Cylinder(9,12);
       // c.setRadius(9);
       // c.setHeight(12);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
        System.out.println(c.SurfaceArea());
        System.out.println(c.Volume());
    }
}