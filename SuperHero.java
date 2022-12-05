public class SuperHero{

//Attributes for class constructors
private int age;
private String name;
private String superPower;
private String weakness;

/**
 * Default class constructor
 * @param age
 * @param name
 * @param superPower
 * @param weakness
 */

public SuperHero(int age, String name, String superPower, String weakness) {
    this.age = age;
    this.name = name;
    this.superPower = superPower;
    this.weakness = weakness;
}

//Default values for constructor
public SuperHero(){
    this(55, "Chirurgical", "Mind Hacking", "Radical 6");
}

//Setters to set new attribute
public void setAge(int newAge){
    age = newAge;
}

public void setName(String newName){
    name = newName;
}

public void setSuperPower(String newSuperPower){
    superPower = newSuperPower;
}

public void setWeakness(String newWeakness){
    weakness = newWeakness;
}

//Getters to retrieve value
public int getAge(){
    return age;
}

public String getName(){
    return name;
}

public String getSuperPower(){
    return superPower;
}

public String getWeakness(){
    return weakness;
}

//Method to print out new attributes
public String toString(){
     return "Your age is " + age + "." + "Your name is " + name + "." + "Your superpower is " + superPower + "." + "Your weakness is " + weakness + ".";
}

}