package Labs.Lab3;

// ===============================
// PRODUCT
// ===============================

// This is the general type
interface Product {

    String getInfo();
}


// ===============================
// CONCRETE PRODUCTS
// ===============================

// A specific type of Product
class ConcreteProductA implements Product {

    @Override
    public String getInfo() {
        return "I am Product A";
    }
}


// Another specific type of Product
class ConcreteProductB implements Product {

    @Override
    public String getInfo() {
        return "I am Product B";
    }
}


// ===============================
// CREATOR
// ===============================

// This class contains the factory method
abstract class Creator {

    // Factory Method
    // The subclasses decide what Product gets created
    public abstract Product factoryMethod();


    // Normal method
    public void someOperation() {

        System.out.println("Creating a product...");

        // We do not say:
        // new ConcreteProductA()
        // or
        // new ConcreteProductB()

        // Instead we ask the factory method
        Product createdProduct = factoryMethod();

        System.out.println(createdProduct.getInfo());
    }
}


// ===============================
// CONCRETE CREATORS
// ===============================

// This creator makes Product A
class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod() {

        return new ConcreteProductA();
    }
}


// This creator makes Product B
class ConcreteCreatorB extends Creator {

    @Override
    public Product factoryMethod() {

        return new ConcreteProductB();
    }
}


// ===============================
// CLIENT
// ===============================

public class LectureExample3 {

    public static void main(String[] args) {

        // Creator A will create Product A
        Creator productACreator = new ConcreteCreatorA();

        productACreator.someOperation();


        System.out.println();


        // Creator B will create Product B
        Creator productBCreator = new ConcreteCreatorB();

        productBCreator.someOperation();
    }
}