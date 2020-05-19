import factory.*;
import singleton.HumanAnimation;
import body.*;
public class Main
{
    public static void main(String[] args)
    {
        HumanAnimation humanAnimation = HumanAnimation.getInstance();
        FitnessUserFactory FitnessUsers = new FitnessUserFactory();
        Body userOne = new Body(FitnessUsers,"yusufbas");
        humanAnimation.Animate(userOne);
    }
}

