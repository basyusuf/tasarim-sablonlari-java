package factory;

public class ArmFactory implements IArmFactory
{
    @Override
    public RightArm createRightArm(){
        System.out.println("Created Right Arm");
        return new RightArm(110,50,50,100);
    }
    @Override
    public LeftArm createLeftArm(){
        System.out.println("Created Left Arm");
        return new LeftArm(108,49,400,100);
    }
}
