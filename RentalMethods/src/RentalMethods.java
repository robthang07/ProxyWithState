import java.util.Random;

public class RentalMethods {
    final static int FULLY_RENTED = 0;
    final static int WAITING = 1;
    final static int GOT_APPLICATION = 2;
    final static int APARTMENT_RENTED = 3;
    Random random;
    int numberApartments;
    int state =WAITING;

    public RentalMethods(int n){
        numberApartments = n;
        random = new Random(System.currentTimeMillis());
    }

    public void getApplication(){
        switch (state){
            case FULLY_RENTED:
                System.out.println("Sorry, Fully booked");
                break;
            case WAITING:
                state = GOT_APPLICATION;
                System.out.println("Thanks for the application.");
                break;
            case GOT_APPLICATION:
                System.out.println("We already got your application");
                break;
            case APARTMENT_RENTED:
                System.out.println("Hang on, we are renting you an apartment");
                break;
            }
        }

    public void checkApplication(){
        int yesno = random.nextInt()%10;
        switch (state){
            case FULLY_RENTED:
                System.out.println("Sorry, Fully booked");
                break;
            case WAITING:
                state = GOT_APPLICATION;
                System.out.println("You must submit application");
                break;
            case GOT_APPLICATION:
                if(yesno > 4 && numberApartments > 0){
                    System.out.println("Congrats, you were approved");
                    state = APARTMENT_RENTED;
                    rentApartment();
                }
                else{
                    System.out.println("Sorry, you were not approved");
                    state = WAITING;
                }
                break;
            case APARTMENT_RENTED:
                System.out.println("Hang on, we are renting you an apartment");
                break;
        }
    }

    public void rentApartment(){
        switch (state){
            case FULLY_RENTED:
                System.out.println("Sorry, Fully booked");
                break;
            case WAITING:
                state = GOT_APPLICATION;
                System.out.println("You have to submit an application");
                break;
            case GOT_APPLICATION:
                System.out.println("You must have your application checked");
                break;
            case APARTMENT_RENTED:
                System.out.println("Renting you an apartment...");
                numberApartments--;
                dispenseKey();
                break;
        }
    }

    private void dispenseKey(){
        switch (state){
            case FULLY_RENTED:
                System.out.println("Sorry, Fully booked");
                break;
            case WAITING:
                state = GOT_APPLICATION;
                System.out.println("You have to submit an application");
                break;
            case GOT_APPLICATION:
                System.out.println("You must have your application checked");
                break;
            case APARTMENT_RENTED:
                System.out.println("Here are your keys");
                state = WAITING;
                break;
        }
    }
}
