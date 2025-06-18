public class conditionalstatements {
    public static void main(String[] args) {
        int money = 100;
        if (money>1000)
        {
        System.out.println("bada restro");
        }
        else if (money>90 && money<100)//checking both conditions otherwise gonna print else statement because of && if im gonna use || it will pint one statemnt if there will be one true 

        {
            System.out.println("tapri vala");
        }else {
            System.out.println("chota restro");}
        }
    }
     /*    //Logical AND (&&)
        boolean isAdult = true;
boolean hasLicense = true;
if (isAdult && hasLicense) {
    System.out.println("Can drive a car.");
}

//Logical OR (||)
boolean isWeekend = true;
boolean onVacation = false;
if (isWeekend || onVacation) {
    System.out.println("Relax and enjoy!");
}


} */


