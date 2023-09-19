class Employee{
    private int id;
    private String name;

public Employee(){
     id=9;
     name="Sneha";
    
 }
 public Employee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public Employee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
       return name;
   }

   public void setName(String n){
       this.name=n;
   }

   public void setId(int i){
       this.id=i;
   }

   public int getId(){
       return id;
   }


}

public class Constructor{
    public static void main(String args[]){
        Employee e1=new Employee("Namu",12);
         System.out.println(e1.getName());
          System.out.println(e1.getId());
    } 
}