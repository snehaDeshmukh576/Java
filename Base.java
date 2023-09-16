class Base1{
    public int x;
    public void setX(int x){
        System.out.println("I am in a x setting x now");
        this.x=x;
    }
    public int getX(){
        return x;

    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base1{
    public int y;
    
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}

public class Base{
    public static void main(String args[]){
        Base1 b=new Base1();
        b.setX(24);
        System.out.println(b.getX());

        Derived d=new Derived();
        d.setY(2);
        System.out.println(d.getY());
    }
}
