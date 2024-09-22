package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int numOfPets = scan.nextInt();
        scan.nextLine();

        String[] typeOfPet = new String[4];
        String[] nameOfPet = new String[4];

        int i;
            for(i = 0; i < numOfPets; i++){
                System.out.println("What type of pet is pet " + (i+1) + "?");
                typeOfPet[i] = scan.nextLine();

                System.out.println("What is the name of pet " + (i+1) + "?");
                nameOfPet[i] = scan.nextLine();


        }



        System.out.println("You have the following pets:");
        for(i = 0; i < numOfPets; i++){
            System.out.print("Pet " + (i+1) + ": " + typeOfPet[i] + " named " + nameOfPet[i] + " says ");

            switch (typeOfPet[i].toLowerCase()) {
                case "dog":
                    Dog dog = new Dog(nameOfPet[i]);
                    System.out.println(dog.makeSound());
                    break;
                case "cat":
                    Cat cat = new Cat(nameOfPet[i]);
                    System.out.println(cat.makeSound());
                    break;
                case "hamster":
                    Hamster hamster = new Hamster(nameOfPet[i]);
                    System.out.println(hamster.makeSound());
                    break;
                case "bird":
                    Bird bird = new Bird(nameOfPet[i]);
                    System.out.println(bird.makeSound());
                    break;
                default:
                    System.out.println("Unknown sound");
            }

        }




    }
}
