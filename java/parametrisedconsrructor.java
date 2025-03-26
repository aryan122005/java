public class parametrisedconsrructor {
    public String nameofcar;
    public parametrisedconsrructor(String wxy)
 {      
        System.out.println("parameterised constructor");
        this.nameofcar=wxy;
 }   
 public String getnameofcar(){
    return nameofcar;
 }
 public static void main(String[] args) {
    parametrisedconsrructor nameofourcar= new parametrisedconsrructor("toyota");
    System.out.println(nameofourcar.getnameofcar());;

 }
}
