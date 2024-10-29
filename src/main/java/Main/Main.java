package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int numOfPets = scan.nextInt();
        scan.nextLine();

        List<String> typeOfPet = new ArrayList<>();
        List<String> nameOfPet = new ArrayList<>();

//        String[] typeOfPet = new String[4];
//        String[] nameOfPet = new String[4];

        int i;
            for(i = 0; i < numOfPets; i++){
                System.out.println("What type of pet is pet " + (i+1) + "?");
                typeOfPet.add(i, scan.nextLine());

                System.out.println("What is the name of pet " + (i+1) + "?");
                nameOfPet.add(i, scan.nextLine());


        }

            Collections.sort(nameOfPet);
            Collections.sort(typeOfPet);



        System.out.println("You have the following pets:");
        for(i = 0; i < numOfPets; i++){
            System.out.print("Pet " + (i+1) + ": " + typeOfPet.get(i) + " named " + nameOfPet.get(i) + " says ");

            switch (typeOfPet.get(i).toLowerCase()) {
                case "dog":
                    Dog dog = new Dog(nameOfPet.get(i));
                    System.out.println(dog.makeSound());
                    break;
                case "cat":
                    Cat cat = new Cat(nameOfPet.get(i));
                    System.out.println(cat.makeSound());
                    break;
                case "hamster":
                    Hamster hamster = new Hamster(nameOfPet.get(i));
                    System.out.println(hamster.makeSound());
                    break;
                case "bird":
                    Bird bird = new Bird(nameOfPet.get(i));
                    System.out.println(bird.makeSound());
                    break;
                default:
                    System.out.println("Unknown sound");
            }

        }




    }
}
