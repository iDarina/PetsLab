package Main;

public class Hamster extends PetsLab{

    public Hamster(String petName){
        super(petName);
    }

    @Override
    public String makeSound(){
        return "Squeak-squeak";
    }
}
