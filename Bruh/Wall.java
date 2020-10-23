public class Wall extends Entity{

    int x;
    int y;
    int w;
    int h;

    public Wall(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        if (w != 0){
            this.w = w;
            this.h = 1;
        }else{
            this.h = h;
            this.w = 1;
        }

    }
}
