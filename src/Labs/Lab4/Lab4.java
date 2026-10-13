package Labs.Lab4;

public class Lab4
{
    class Pizza {
        private String crust;
        private String sauce;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;
        private boolean glutenFree;

        Pizza(String crust, String sauce, boolean cheese,
              boolean pepperoni, boolean mushrooms, boolean glutenFree) {
            this.crust = crust;
            this.sauce = sauce;
            this.cheese = cheese;
            this.pepperoni = pepperoni;
            this.mushrooms = mushrooms;
            this.glutenFree = glutenFree;
        }

        @Override
        public String toString() {
            return "Pizza [crust=" + crust
                    + ", sauce=" + sauce
                    + ", cheese=" + cheese
                    + ", pepperoni=" + pepperoni
                    + ", mushrooms=" + mushrooms
                    + ", glutenFree=" + glutenFree + "]";
        }
    }


    interface PizzaBuilder {
        PizzaBuilder setCrust(String crust);
        PizzaBuilder setSauce(String sauce);
        PizzaBuilder addCheese();
        PizzaBuilder addPepperoni();
        PizzaBuilder addMushrooms();
        PizzaBuilder setGlutenFree(boolean glutenFree);
        Pizza build();
    }


    class CustomPizzaBuilder implements PizzaBuilder {

        // TODO: Declare fields to store the pizza's configuration
        private String crust;
        private String sauce;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;
        private boolean glutenFree;

        @Override
        public PizzaBuilder setCrust(String crust) {
            // TODO: Store the crust type
            this.crust = crust;
            return this;
        }

        @Override
        public PizzaBuilder setSauce(String sauce) {
            // TODO: Store the sauce type
            this.sauce = sauce;
            return this;
        }

        @Override
        public PizzaBuilder addCheese() {
            // TODO: Add cheese
            this.cheese = true;
            return this;
        }

        @Override
        public PizzaBuilder addPepperoni() {
            // TODO: Add pepperoni
            this.pepperoni = true;
            return this;
        }

        @Override
        public PizzaBuilder addMushrooms() {
            // TODO: Add mushrooms
            this.mushrooms=true;
            return this;
        }

        @Override
        public PizzaBuilder setGlutenFree(boolean glutenFree) {
            // TODO: Store the gluten-free option
            this.glutenFree=glutenFree;
            return this;
        }

        @Override
        public Pizza build() {
            // TODO: Construct and return a Pizza using the stored configuration
            return new Pizza(crust, );

        }
    }


    public class Main {
        public static void main(String[] args) {

            // TODO: Test your Pizza Builder here

        }
    }

}
