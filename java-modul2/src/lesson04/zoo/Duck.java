package lesson04.zoo;

public class Duck extends Pet{
    private String wingsColor;

    Duck(String wingsColor, String name){
        super(name);
        this.wingsColor = wingsColor;                ;
    }

    void qraqra(){
        System.out.println("крякает");
    }
}
