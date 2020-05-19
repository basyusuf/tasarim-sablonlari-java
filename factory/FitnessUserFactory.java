package factory;

public class FitnessUserFactory implements IHumanAnimationFactory
{
    public ArmFactory createArm()
    {
        return new ArmFactory();
    }
    public LegFactory createLeg()
    {
        return new LegFactory();
    }
}
