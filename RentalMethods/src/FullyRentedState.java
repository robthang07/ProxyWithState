public class FullyRentedState implements State {
    AutomatInterface automat;

    public FullyRentedState(AutomatInterface a){
        automat = a;
    }

    @Override
    public String gotApplication() {
        return "Sorry we are fully rented";
    }

    @Override
    public String checkApplication() {
        return "Sorry we are fully rented";
    }

    @Override
    public String rentApartment() {
        return "Sorry we are fully rented";
    }

    @Override
    public String dispenseKeys() {
        return "Sorry we are fully rented";
    }
}
