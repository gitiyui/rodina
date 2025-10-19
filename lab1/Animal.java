package lab1;

import java.util.ArrayList;

public class Animal {
    private String name;
    private AnimalType animalType;
    private Owner owner;
    private ArrayList<Visit> visits;

    public Animal() {
        this.name = "";
        this.animalType = AnimalType.CAT;
        this.owner = new Owner();
        this.visits = new ArrayList<>();
    }

    public Animal(String name, AnimalType animalType, Owner owner) {
        this.name = name;
        this.animalType = animalType;
        this.owner = owner;
        this.visits = new ArrayList<>();
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    public void printFullInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Type: " + animalType);
        owner.printInfo();
        System.out.println("Visits:");
        for (Visit v : visits) {
            v.printInfo();
        }
    }

    public void printShortInfo() {
        System.out.println("Animal: " + name + ", Owner: " + owner.getName() + ", Visits: " + visits.size());
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public void setVisits(ArrayList<Visit> visits) {
        this.visits = visits;
    }
}
