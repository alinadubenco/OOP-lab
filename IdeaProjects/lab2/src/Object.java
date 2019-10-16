public class Object {
    int height;
    int width;
    int depth;

    Object(){
        height = 1;
        width = 1;
        depth = 1;
    }

    Object(int x){
        height = x;
        width = x;
        depth = x;

    }
    Object(int x, int y, int z){
        height = x;
        width = y;
        depth = z;
    }

    public int getBoxVolume() {
        return (height * width * depth);
    }

    public int getBoxArea(){
        return (2*(height * width + height * depth + width * depth));
    }

}
