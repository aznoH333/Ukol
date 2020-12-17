public class ShipC implements Field{

    private boolean hit = false;
    private String name;

    public ShipC(String name){
        this.name = name;
    }

    @Override
    public String getType() {
        return "ship";
    }

    @Override
    public boolean getHit() {
        return false;
    }

    @Override
    public void shoot() {
        if (hit == false) {
            hit = true;
            System.out.println("A " + name + " has been hit!");
        }else{
            System.out.println("Missed!");
        }
    }
}
