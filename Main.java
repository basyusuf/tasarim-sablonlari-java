import factory.*;
import singleton.HumanAnimation;
import body.*;
public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {
        HumanAnimation humanAnimation = HumanAnimation.getInstance();
        FitnessUserFactory FitnessUsers = new FitnessUserFactory();
        System.out.println(FitnessUsers.getEquipment()[0]);
        String[] CrossFitEquipment = {"Bar","Dumbell"};
        FitnessUserFactory CrossFit = FitnessUsers.clone(CrossFitEquipment);
        System.out.println(CrossFit.getEquipment()[0]);
        Body userOne = new Body(FitnessUsers,"yusufbas");
        humanAnimation.Animate(userOne);
        Body userTwo = new Body(CrossFit,"penava123");
        userTwo.setSolKol(new LeftArm(50,200,0,0));
        humanAnimation.Animate(userTwo);
    }
}

