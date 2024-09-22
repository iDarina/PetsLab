package Main;

public class Dog extends PetsLab {

    public Dog(String petName){
        super(petName);
    }

    @Override
    public String makeSound(){
        return "Woof-woof";
    }

    }

