package Main;

public class Bird extends PetsLab{

    public Bird(String petName){
        super(petName);
    }

    @Override
    public String makeSound() {
        return "Squawk-squawk";
    }
}
