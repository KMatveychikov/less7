public class MainClass {



    public static void main(String[] args) {

        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 4,false);
        cat[1] = new Cat("Tishka", 5,false);
        cat[2] = new Cat("Murka", 6,false);
        cat[3] = new Cat("Pirat", 3,false);
        cat[4] = new Cat("Iris", 2,false);



        Plate plate = new Plate(20);

        plate.info();

        for (int i = 0; i < cat.length; i++) {
            if(cat[i].getAppetite()<plate.getFood()) {
                cat[i].eat(plate);
                if (cat[i].satiety == true) {
                    System.out.println(cat[i].name + " поел");
                }
                plate.info();
            } else System.out.println(cat[i].name + " не поел(");
        }

        plate.addFood(10);
        plate.info();

    }

}
