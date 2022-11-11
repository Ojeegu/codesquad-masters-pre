package week2.TF;

public class Problem1 { //CarTest를 통해 싱글톤패턴 익히기
    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();

        System.out.println("첫번째 차 번호는" + myCar.showCarNumber());
        System.out.println("두번째 차 번호는" + yourCar.showCarNumber());
    }
}


class Car {
    private static int serialNumber = 1000;
    private int carNumber;

    public Car(){
        carNumber = serialNumber;
        serialNumber++;
    }

    public int showCarNumber(){ //getter
        return carNumber;
    }
}


class HyundaiFactory { // 싱글톤 패턴
    private static HyundaiFactory instance = new HyundaiFactory(); //유일하게 생성한 인스턴스

    public static HyundaiFactory getFactory(){
        if(instance == null) {
            instance = new HyundaiFactory();
        }
        return instance; //유일하게 생성한 인스턴스 반환
    }

    public Car createCar(){
        return new Car();
    }
}

