public class Duck{

    I_DuckDisplayStrategy ds;
    I_DuckFlyStrategy fs;

    public Duck(I_DuckDisplayStrategy ds, I_DuckFlyStrategy fs){
        this.ds = ds;
        this.fs = fs;
    }

    public void display(){
        this.ds.display();
    }

    public void fly(){
        this.fs.fly();
    }

}