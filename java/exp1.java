public class exp1 {
    public static void main(String[] args) {
        System.out.println("this is my first program in jjava ");
        int age =18;

        if(age ==18){
            System.out.println("the person is of 18 yrs old");

        }

        else {
            System.out.println("thee person is either a small the 18 or person is bigger age then 18");
        }

        //switch statements
    int day = 3;
    String dayName;

    switch (day) {
        case 1:
            dayName = "Sunday";
            break;
        case 2:
            dayName = "Monday";
            break;
        case 3:
            dayName = "Tuesday";
            break;
        case 4:
            dayName = "Wednesday";
            break;
        default:
        dayName= "invalid day";
        break;
    }
    System.out.println("today is "+dayName);
   }
}