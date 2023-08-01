package Completed.Design;

//Submission: https://leetcode.com/problems/design-parking-system/submissions/959954578/

/* 
    There are 3 types of parking sizes: Big, Medium, Small

    Check if there is a parking space of carType for a given car that wants to get into the lot.
    1 = Big
    2 = Med
    3 = Small

    A Car can only park in the parking space of its carType.
    If there is no space available, return false, otherwise return true and update available space.
*/

class ParkingSystem {
    private int bigSize;
    private int medSize;
    private int smallSize;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSize = big;
        this.medSize = medium;
        this.smallSize = small;
    }
    
    public boolean addCar(int carType) {
        switch(carType){
            case 1:
                if(getBigSize() > 0){
                    setBigSize(getBigSize() - 1);
                    return true;
                }else
                    return false;
            case 2:
                if(getMedSize() > 0){
                    setMedSize(getMedSize() - 1);
                    return true;
                }else
                    return false;
            case 3:
                if(getSmallSize() > 0){
                    setSmallSize(getSmallSize() - 1);
                    return true;
                }else
                    return false;
        }
        return false;
    }

    public int getBigSize() {
        return bigSize;
    }
    public void setBigSize(int bigSize) {
        this.bigSize = bigSize;
    }
    public int getMedSize() {
        return medSize;
    }
    public void setMedSize(int medSize) {
        this.medSize = medSize;
    }
    public int getSmallSize() {
        return smallSize;
    }
    public void setSmallSize(int smallSize) {
        this.smallSize = smallSize;
    }
}