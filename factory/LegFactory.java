package factory;

public class LegFactory implements ILegFactory
{
    public RightLeg createRightLeg(){
        System.out.println("Created Right Leg");
        return new RightLeg(110,50,50,100);
    }
    public LeftLeg createLeftLeg(){
        System.out.println("Created Left Leg");
        return new LeftLeg(108,49,400,100);
    }
}
