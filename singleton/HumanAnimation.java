package singleton;

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
}
