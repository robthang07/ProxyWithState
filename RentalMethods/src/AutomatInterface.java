public interface AutomatInterface {
     void gotApplication();
     void checkApplication();
     void rentApartment();
     void setState(State s);
     State getWaitingState();
     State getGotApplicationState();
     State getApartmentRentedState();
     State getFullyRentedState();
     int getCount();
     void setCount(int n);
}
