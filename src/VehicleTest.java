public class VehicleTest  {
    public static void main(String[] args){

        Car benz= new Car(4);
        lorry pusher= new lorry(6);
        Bicycle bmx= new Bicycle(2);
        System.out.println(" Car have "+ benz.getWheel()+" wheels");
        System.out.println(" Bicycle have "+ bmx.getWheel()+" wheels");
        System.out.println(" lorry have "+ pusher.getWheel()+" wheels");

        benz.setOwner("John");
        System.out.println(benz.getOwner());

        bmx.setWheel(10);
        System.out.println(bmx.getWheel());

        benz.setRegistration("T");
        System.out.println(benz.getRegistration());

        pusher.setWheel(8);
        System.out.println(pusher.getWheel());

        pusher.setOwner("Obutey");
        System.out.println(pusher.getOwner());
    }
}
