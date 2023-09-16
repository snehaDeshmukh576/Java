class Animal{
    public String ani;
    public void setAni(String x){
        this.ani=x;
    }
    public String getAni(){
        return ani ;
    }
    
}
class Dog extends Animal{
    public String prop;
    
    public String getProp(){
        return prop;
    }
    public void setProp(String y){
        this.prop=y;
    }
}
public class Inheritance{
    public static void main(String args[]){
        Animal a=new Animal();
        a.setAni("Dog");
        System.out.println(a.getAni());
    
        Dog d=new Dog();
        d.setProp("barks");
        System.out.println(d.getProp());
    }
}