public class lorry extends Vehicle implements CarAndLorry {
    private String registration;
    public lorry(int wheel){
        super(wheel);
    }
    public void setRegistration( String registration){
        this.registration=registration;
    }
    public String getRegistration(){
        return registration;
    }
}
