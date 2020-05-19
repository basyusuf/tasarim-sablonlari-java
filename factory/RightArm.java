package factory;

public class RightArm implements IArm
{
    int height;
    int width;
    int positionx;
    int positiony;
    RightArm(int height,int width,int positionx,int positiony)
    {
        this.height = height;
        this.width = width;
        this.positionx = positionx;
        this.positiony = positiony;
    }
    public String getPosition(){
        return "X:"+positionx+" Y:"+positiony;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }
}
