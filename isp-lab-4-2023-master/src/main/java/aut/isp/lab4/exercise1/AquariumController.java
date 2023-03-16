package aut.isp.lab4.exercise1;

public class AquariumController {

    //attributs

    private String manufacturer;
    private String model;
    private float currentTime;




    //constructors

    public AquariumController(java.lang.String manufacturer, java.lang.String model, float currentTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
    }


    //methods


    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public String toString(){
        return "This is the model "+ this.model;
    }

    public static void main (String[] args){
    AquariumController aq = new AquariumController("Emag","New",100);
        System.out.println(aq);
    }
}
