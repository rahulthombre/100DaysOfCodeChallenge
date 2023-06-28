// Problem :- https://leetcode.com/problems/design-parking-system/

// Solutin :-

class ParkingSystem {
    int availableBig, availableMedium, availableSmall;

    // parameterized constructor
    public ParkingSystem(int big, int medium, int small) {
        availableBig=big;
        availableMedium=medium;
        availableSmall=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(availableBig==0){
                return false;
            }else {
                availableBig--;
                return true;
            }
        }
        if(carType==2){
            if(availableMedium==0){
                return false;
            }else{
                availableMedium--;
                return true;
            }
        }
        if(carType==3){
            if(availableSmall==0){
                return false;
            }else{
                availableSmall--;
                return true;
            }
        }
        return false;//carTyp != 1 or 2 or 3
    }
}
