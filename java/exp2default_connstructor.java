public class exp2default_connstructor {
    int year;
    String model;

    public exp2default_connstructor()
    {
        year =0;
        model="unknown";

    }
    public static void main(String[] args) {
        exp2default_connstructor mycar = new exp2default_connstructor();
        

        System.out.println("car model:"+ mycar.model);
        System.out.println("year :"+mycar.year);

    }
    







}
