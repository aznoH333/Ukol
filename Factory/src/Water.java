public class Water implements Field{

    private boolean hit = false;

    @Override
    public String getType() {
        return "water";
    }

    @Override
    public boolean getHit() {
        return hit;
    }

    @Override
    public void shoot() {
        this.hit = true;
        System.out.println("Missed!");
    }
}
