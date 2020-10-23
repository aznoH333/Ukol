public class Player extends Entity {

    int x;
    int y;
    int w;
    int h;

    Player(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public boolean collisionP(Player other) {
        if (this.x + this.w > other.x && other.x + other.w > this.x && this.y + this.h > other.y && other.y + other.h > this.y) {
            return true;
        }else{
            return false;
        }
    }
    public boolean collisionW(Wall other) {
        if (this.x + this.w > other.x && other.x + other.w > this.x && this.y + this.h > other.y && other.y + other.h > this.y) {
            return true;
        }else{
            return false;
        }
    }
}
