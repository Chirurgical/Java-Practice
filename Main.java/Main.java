class Main{

    //Function to print slogan
    static String printSlogan(String newSlogan){
       return("Your slogan is " +  newSlogan);
    }

    public static void main(String[] args) {

        //Create new object with default constructor
        SuperHero sacer = new SuperHero();
        //Print default constructor
        System.out.println(sacer);


        //Using setters and getters to change arguments
        sacer.setAge(77);
        sacer.setName("Sacer");
        sacer.setSuperPower("Delusional Synchro");
        sacer.setWeakness("Committee");
        sacer.getAge();
        sacer.getName();
        sacer.getSuperPower();
        sacer.getWeakness();

        //Print final attribute values.
        System.out.println(sacer);

        //Call function with new slogan argument.
        System.out.print(printSlogan("My motives are complex"));
    }
}

/*Problem 7
 * 7a. A respisitory is the storage location for software packages. It hosts the application's source code.
 * 7b. Github hosts our code on a centralized location online, allowing us to revise code collaboratively more efficiently.
 * 7c. Commits are snapshots of the respository.
 * 7d. Directories are references to the location of a file on a respository.
 * 7e. A staging area is temporary storage location before the data is processed further. 
 * 7f. Branches are an alternate version of the main branch that allows you to edit independently from the main branch. It allows you to experiment with the program without the risk of ruining it. If the program in the branch is satisfactory, it can be merged into the main branch.
 * 7g. Local is stored on your computer, while remote is stored through an external party online, like GitHub.
 */
