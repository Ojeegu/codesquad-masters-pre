package week3.MonTue;

import java.util.ArrayList;

public class Practice1 { //백화점 멤버십 관리 프로그램
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer james = new Customer("James", 10000, 2);
        Customer tomas = new Customer("Tomas", 30000, 2);
        Customer edward = new PlatinumCustomer("Edward", 10000, 2);
        Customer percy = new PlatinumCustomer("Percy", 30000, 2);
        Customer elizabet = new DiamondCustomer("Elizabet", 30000, 2);

        customerList.add(james);
        customerList.add(tomas);
        customerList.add(edward);
        customerList.add(percy);
        customerList.add(elizabet);

        for(Customer customer : customerList){
            customer.showCustomerInfo();
        }
    }
}

class Customer {
    protected String customerName;
    protected String customerGrade;
    protected int parkingTime;
    int payments;
    int parkingFee;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        initCustomer();
    }

    public Customer(String customerName, int payments, int parkingTime){
        this.customerName = customerName;
        this.payments = payments;
        this.parkingTime = parkingTime;
        initCustomer();
    }

    public void initCustomer(){
        customerGrade = "Red";
        bonusRatio = 0.01;
    }

    public int calcPayments(int payments){
        bonusPoint += payments * bonusRatio;
        return payments;
    }

    public int calcParkingFee(int parkingFee){
        return parkingTime * 3000;
    }

    public void showCustomerInfo(){
        System.out.println(customerName + "님의 지불 금액은" + payments + "원 이고, 적립 포인트는 " + bonusPoint + "점 입니다.");
        System.out.println("주차 요금은 " + parkingFee + "원 입니다.");
    }
}

class PlatinumCustomer extends Customer {
    protected double saleRatio;

    public PlatinumCustomer(String customerName, int payments, int parkingTime){
        super(customerName, payments, parkingTime);
        customerGrade = "PLATINUM";
        bonusRatio = 0.05;
        saleRatio = 0.05;
    }

    @Override
    public int calcPayments(int payments) {
        bonusPoint += payments * bonusRatio;
        return payments - (int)(payments * bonusRatio);
    }

    @Override
    public int calcParkingFee(int parkingFee) {
        return parkingTime * 1000;
    }
}

class DiamondCustomer extends Customer{
    protected double saleRatio;
    protected int agentID;

    public DiamondCustomer(String customerName, int payments, int parkingTime){
        super(customerName, payments, parkingTime);
        customerGrade = "Diamond";
        bonusRatio = 0.1;
        saleRatio = 0.1;
    }

    @Override
    public int calcPayments (int payments) {
        bonusPoint += payments * bonusRatio;
        return payments - (int)(payments * saleRatio);
    }

    @Override
    public int calcParkingFee(int parkingFee) {
        return 0;
    }

    public int getAgentID(){
        return agentID;
    }

}
