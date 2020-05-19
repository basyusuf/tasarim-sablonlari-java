package factory;

import prototype.ICloneFactoryArea;

public class FitnessUserFactory implements IHumanAnimationFactory, ICloneFactoryArea<FitnessUserFactory>
{

    private String[] equipment = {"Dumbell", "Towel", "Shampoo"};
    public ArmFactory createArm()
    {
        return new ArmFactory();
    }
    public LegFactory createLeg()
    {
        return new LegFactory();
    }

    public String[] getEquipment() {
        return equipment;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }

    @Override
    public FitnessUserFactory clone() throws CloneNotSupportedException{
        return (FitnessUserFactory)super.clone();
    }

    @Override
    public FitnessUserFactory clone(String[] equipment) throws CloneNotSupportedException{
        FitnessUserFactory object = (FitnessUserFactory)super.clone();
        object.setEquipment(equipment);
        return object;
    }
}
