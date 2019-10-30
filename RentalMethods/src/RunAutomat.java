public class RunAutomat {
    Automat automat;

    public static void main(String[] args) {
        RunAutomat r = new RunAutomat();
    }

    public RunAutomat(){
        automat = new Automat(9);

        automat.gotApplication();
        automat.checkApplication();
        automat.rentApartment();
    }
}
