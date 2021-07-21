package encapsulation;

public class Encapsulation {
    public static void main(String[] args){
        Laptop l=new Laptop();
        l.setPrice(23000);
        System.out.println(l.getPrice());

    }
    public void doWork(){
        System.out.println("Working...");
    }

}
class Laptop{
    int ram;
    private int price;
    public void setPrice(int price){//Encapsulation
        boolean isAdmin=true;
        if (!isAdmin)
            System.out.println("You cannot change!!!");
        else
           this.price=price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }
}
//Encapsulation is for security reasons Abstraction is for complexity reasons