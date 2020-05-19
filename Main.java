import factory.*;
import singleton.HumanAnimation;
public class Main
{
    public static void main(String[] args)
    {
	    HumanAnimation.getInstance();
        FitnessUserFactory FitnessUsers = new FitnessUserFactory();
        Body userOne = new Body(FitnessUsers,"yusufbas");
        System.out.println(userOne.getSagBacak().getPosition());
    }
}
class Body
{
    private LeftLeg solBacak;
    private RightLeg sagBacak;
    private LeftArm solKol;
    private RightArm sagKol;
    private String Username;

    Body(FitnessUserFactory FitnessUsers, String username)
    {
        this.solBacak =  FitnessUsers.createLeg().createLeftLeg();
        this.sagBacak = FitnessUsers.createLeg().createRightLeg();
        this.solKol = FitnessUsers.createArm().createLeftArm();
        this.sagKol = FitnessUsers.createArm().createRightArm();
        this.Username = username;
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public LeftLeg getSolBacak() {
        return solBacak;
    }

    public void setSolBacak(LeftLeg solBacak) {
        this.solBacak = solBacak;
    }

    public RightLeg getSagBacak() {
        return sagBacak;
    }

    public void setSagBacak(RightLeg sagBacak) {
        this.sagBacak = sagBacak;
    }

    public LeftArm getSolKol() {
        return solKol;
    }

    public void setSolKol(LeftArm solKol) {
        this.solKol = solKol;
    }

    public RightArm getSagKol() {
        return sagKol;
    }

    public void setSagKol(RightArm sagKol) {
        this.sagKol = sagKol;
    }
}
