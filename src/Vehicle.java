public class Vehicle {
    private String owner;
    private int wheel;

    public void setOwner(String own){
        owner = own;
    }

    public String getOwner(){
        return owner;
    }
    public void setWheel(int wheel){
        this.wheel=wheel;
    }
    public int getWheel(){
        return wheel;
    }




    public Vehicle(int wheel){
        this.wheel=wheel;
    }


}