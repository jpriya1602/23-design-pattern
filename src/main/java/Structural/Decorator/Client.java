package Structural.Decorator;

class Client {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        Beverage houseBlendWithMilk = new Milk(houseBlend);
        Beverage whip = new Whip(houseBlendWithMilk);


        System.out.println(whip.getDescription());
        System.out.println(whip.cost());
    }
}
