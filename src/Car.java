public class Car extends Vehicle  implements CarAndLorry{
    private String registration;


public Car( int wheel){
    super(wheel);
}

    public void setRegistration( String registration){
    this.registration=registration;
    }
    public String getRegistration(){
    return registration;
    }
}
