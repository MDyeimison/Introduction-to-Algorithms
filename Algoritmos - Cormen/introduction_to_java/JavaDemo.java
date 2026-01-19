import java.util.ArrayList; // Import for dynamic lists
import java.util.List;      // Import for the List interface

// 1. An Interface defines a contract
interface SoundMaker {
    void makeSound(); 
}

// 2. A Class implementing an interface
class Dog implements SoundMaker {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("The cat says: Meow!");
    }
}

// 3. The Main Class
public class JavaDemo {
    public static void main(String[] args) {
        
        // --- ARRAYS (Fixed Size) ---
        // Arrays are fixed in length once declared.
        String[] tags = {"Domestic", "Pet", "Mammal"};
        System.out.println("First tag: " + tags[0]);

        // --- LISTS (Dynamic Size) ---
        // Lists (like ArrayList) can grow and shrink. 
        // We use the Interface (List) as the type and the Implementation (ArrayList) to instantiate.
        List<SoundMaker> animals = new ArrayList<>();
        
        animals.add(new Dog("Buddy"));
        animals.add(new Cat());

        // --- FOR-EACH LOOP ---
        System.out.println("--- Animal Sounds ---");
        for (SoundMaker animal : animals) {
            animal.makeSound(); // Polymorphism in action
        }

        // --- BASIC MATH & PRINTING ---
        int a = 10;
        double b = 5.5;
        System.out.println("Result of " + a + " + " + b + " = " + (a + b));
    }
}