package aut.isp.lab4.exercise2;


public class FishFeeder {

    private String manufacturer;

    private String model;
    private int meals;

    //Constructor

    public FishFeeder(int val){
        this.meals = val;
    }

    //Methods
    public void feed(){
        if(this.meals>0){
            this.meals--;
            System.out.println("You feed the Fish");
        }
        else {
            System.out.println("No meals left");
        }
    }

    public void setMeals(int meals) {
        this.meals = meals;
    }

    public void fillUp(int unit) {

        int rest = 0;
        if (this.meals + unit > 14) {
            int x = this.meals + unit;
            meals = 14;
            rest = x - 14;
            System.out.println("Meals: "+meals);
            System.out.println("Extra meals: "+rest);

        } else {
            this.meals += unit;
            System.out.println("Meals : " + this.meals);
        }
    }


    public String toString(){
        return "Ammount meals: "+meals;
    }







    public static void main(String[] args){
        FishFeeder ff = new FishFeeder(10);
        System.out.println(ff);
        ff.fillUp(2);


    }

}
