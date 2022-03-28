public class Dancer extends Performer{

    private int shoeSize;

    public Dancer(String name, int age, Agent agent, int shoeSize)
    {
        super(name, age, agent);
        this.shoeSize = shoeSize;
    }

    private void pirouette(int spins)
    {
    System.out.println(" I am Spinning " + spins + " Times!");

    }

    @Override
    public void rehearse()
    {
       pirouette(3);
        super.rehearse();
    }

    public void perform(boolean Warmup)
    {
       if(Warmup)
       {
           this.rehearse();

       }
       perform();

    }

    @Override
    public void callAgent()
    {
        super.callAgent()
        System.out.println("My shoes don’t fit!  Please pick me up a new pair.");
    }

    public void callAgent(int Correctsize)
    {\
        this.callAgent();
        System.out.println("I wear size" + Correctsize + "by the way!");
    }

    public int getshoeSize
    {
        return shoeSize;
    }

    @Override
    public String getName()
    {
        return super.getName() + " is a dancer!";
    }
}
