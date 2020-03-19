class Main{
    public static void main(String[] args){

        I_DuckDisplayStrategy dxd = new DuckXDisplayStrategy();
        I_DuckDisplayStrategy dyd = new DuckYDisplayStrategy();
        I_DuckFlyStrategy dxf = new DuckXFlyStrategy();
        I_DuckFlyStrategy dyf = new DuckYFlyStrategy();

        Duck CityDuck = new Duck(dxd, dyf);
        
        CityDuck.display();
        CityDuck.fly();
    }
}