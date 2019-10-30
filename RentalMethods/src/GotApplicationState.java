import java.util.Random;

public class GotApplicationState implements State {
    AutomatInterface automat;
    Random random;

    public GotApplicationState(AutomatInterface a){
        automat = a;
        random = new Random(System.currentTimeMillis());
    }
    @Override
    public String gotApplication() {
        return "We already got your application";
    }

    @Override
    public String checkApplication() {
        int yesno  = random.nextInt(5);
        if(yesno >= 0 & automat.getCount() > 0){
            automat.setState(automat.getApartmentRentedState());
            return "Congrats, you were approved";
        }
        else if(yesno < 0 & automat.getCount() > 0){
            automat.setState(automat.getWaitingState());
            return "Sorry, you were not approved";
        }
        else {
            automat.setState(automat.getFullyRentedState());
            return null;
        }
    }

    @Override
    public String rentApartment() {
        return "You must have your application checked";
    }

    @Override
    public String dispenseKeys() {
        return "You must have your application checked";
    }
}
