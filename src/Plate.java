public class Plate  {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood(){
        return food;
    }

    public void addFood(int addFood){
        food =+ addFood;
        System.out.println("Досыпали " + addFood + " еды");
    }

    public boolean decreaseFood(int n) {
        if (food > 0) {
            food -= n;
            return true;
        } else {
            System.out.println("миска пуста(");
            return false;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
