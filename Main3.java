import java.util.ArrayList;

public class Main3 {
    public static void main(String[]args){
        CarList car=new CarList();
        car.size();
        car.SetCar();
        car.clear();
    }
}

class CarList{


    ArrayList<String> cars = new ArrayList<String>();



    CarList(){
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Lamba");
    }

    public void SetCar(){
        cars.set(1, "Lada");
        System.out.println(cars);
    }

    public void remove(){
        cars.remove(4);
        System.out.println(cars);
    }

    public void clear(){
        cars.clear();
        System.out.println(cars);

    }
    public void size(){
        cars.size();
        System.out.println(cars.size());

    }



}
