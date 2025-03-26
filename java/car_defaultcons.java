public class car_defaultcons {
    ///default constructior with no arguments
    int year;
    float millege;
    String model;

    public car_defaultcons(){
        year= 0;
        millege=0;
        model="unknown";

    }
    public static void main(String[] args) {
        car_defaultcons mycar= new car_defaultcons();
        System.out.println( "my car model"+mycar.model);
        System.out.println("manufacturing year"+mycar.year);
        System.out.println("the millige of car"+mycar.millege);
    }
}
