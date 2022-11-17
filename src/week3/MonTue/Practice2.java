package week3.MonTue;

public class Practice2 {

    public static void main(String[] args) {

        Coffee etiopiaAmericano = new EtiopiaAmericano();
        etiopiaAmericano.brewing();
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing();
        System.out.println();

        Coffee hawaiiWhippedMocha =
                new WhippedCream(new Mocha(new Latte( new HawaiiAmericano())));
        hawaiiWhippedMocha.brewing();
        System.out.println();

    }
}

class Coffee {

    public Coffee () {}

    public Coffee (Coffee coffeeMenu) {
        coffeeMenu.brewing();
    }

    public void brewing() {}

}

class EtiopiaAmericano extends Coffee {
    @Override
    public void brewing() {
        System.out.print("EtiopiaAmericano");
    }
}

class KenyaAmericano extends Coffee {
    @Override
    public void brewing() {
        System.out.print("KenyaAmericano");
    }
}

class BrazilAmericano extends Coffee {
    @Override
    public void brewing() {
        System.out.print("BrazilAmericano");
    }
}

class HawaiiAmericano extends Coffee {
    @Override
    public void brewing() {
        System.out.print("HawaiiAmericano");
    }
}

class Latte extends Coffee {
    public Latte (Coffee coffeeMenu) {
        coffeeMenu.brewing();
    }

    @Override
    public void brewing() {
        System.out.print(" Adding Milk");
    }
}

class Mocha extends Coffee {
    public Mocha (Coffee coffeeMenu) {
        coffeeMenu.brewing();
    }

    @Override
    public void brewing() {
        System.out.print(" Adding Mocha Syrup");
    }
}

class WhippedCream extends Coffee {
    public WhippedCream (Coffee coffeeMenu) {
        coffeeMenu.brewing();
    }

    @Override
    public void brewing() {
        System.out.print(" Adding WhippedCream");
    }
}