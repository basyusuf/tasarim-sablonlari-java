package factory;

public class RightLeg implements ILeg
{
    int height;
    int width;
    int positionx;
    int positiony;
    RightLeg(int height,int width,int positionx,int positiony)
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
