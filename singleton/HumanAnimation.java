package singleton;
import body.Body;
public class HumanAnimation {
    private static HumanAnimation instance = new HumanAnimation();
    private HumanAnimation()
    {
        System.out.println("Human Animation Created");
        this.ConnectAIServices();
    }
    public void ConnectAIServices(){
        System.out.println("Connected AI Service's");
    }
    public static HumanAnimation getInstance()
    {
        return  instance;
    }
    public void Animate(Body body)
    {
        System.out.println("Sağ Bacak:"+body.getSagBacak().getPosition());
        System.out.println("Sol Bacak:"+body.getSolBacak().getPosition());
        System.out.println("Sağ Kol:"+body.getSagKol().getPosition());
        System.out.println("Sol Kol:"+body.getSolKol().getPosition());
    }
}
