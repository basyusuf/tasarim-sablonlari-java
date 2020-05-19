package factory;

public class LeftLeg implements ILeg
{
    private int height;
    private int width;
    private int positionx;
    private int positiony;
    public LeftLeg(int height,int width,int positionx,int positiony)
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

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPositionx() {
        return positionx;
    }

    public void setPositionx(int positionx) {
        this.positionx = positionx;
    }

    public int getPositiony() {
        return positiony;
    }

    public void setPositiony(int positiony) {
        this.positiony = positiony;
    }
}
