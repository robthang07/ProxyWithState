public class WaitingState implements State {
    AutomatInterface automat;

    public WaitingState(AutomatInterface a){
        automat = a;
    }

    @Override
    public String gotApplication() {
        automat.setState(automat.getGotApplicationState());
        return "Thanks for application";
    }

    @Override
    public String checkApplication() {
        return "You have to submit an application";
    }

    @Override
    public String rentApartment() {
        return "You have to submit an application";
    }

    @Override
    public String dispenseKeys() {
        return "You have to submit an application";
    }
}
