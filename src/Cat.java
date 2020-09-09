public class Cat {
    String name;
    private int appetite;
    protected boolean satiety;

    public int getAppetite() {
        return appetite;
    }



    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if(p.decreaseFood(appetite)) satiety = true;


    }

}
