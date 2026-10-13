package Labs.Lab4;

public class Lab4
{


    public static void main(String[] args) {

        PizzaBuilder pizzaBuilder = new CustomPizzaBuilder();

        PizzaDirector pizzaDirector = new PizzaDirector();

        pizzaDirector.makeMargherita(pizzaBuilder);

        Pizza finishedPizza = pizzaBuilder.build();

        System.out.println(finishedPizza);
    }


    static class Pizza {
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
        void setCrust(String crust);
        void setSauce(String sauce);
        void addCheese();
        void addPepperoni();
        void addMushrooms();
        void setGlutenFree(boolean glutenFree);
        Pizza build();
    }


    static class CustomPizzaBuilder implements PizzaBuilder {

        // TODO: Declare fields to store the pizza's configuration
        private String crust;
        private String sauce;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;
        private boolean glutenFree;

        @Override
        public void  setCrust(String crust) {
            // TODO: Store the crust type
            this.crust = crust;

        }

        @Override
        public void  setSauce(String sauce) {
            // TODO: Store the sauce type
            this.sauce = sauce;

        }

        @Override
        public void  addCheese() {
            // TODO: Add cheese
            this.cheese = true;

        }

        @Override
        public void  addPepperoni() {
            // TODO: Add pepperoni
            this.pepperoni = true;

        }

        @Override
        public void  addMushrooms() {
            // TODO: Add mushrooms
            this.mushrooms=true;

        }

        @Override
        public void  setGlutenFree(boolean glutenFree) {
            // TODO: Store the gluten-free option
            this.glutenFree=glutenFree;

        }

        @Override
        public  Pizza build() {
            // TODO: Construct and return a Pizza using the stored configuration
            return new Pizza(crust, sauce, cheese, pepperoni,mushrooms,glutenFree);

        }
    }




    static class PizzaDirector  {

            public void makeMargherita(PizzaBuilder pizzaBuilder) {
                    pizzaBuilder.setCrust("Thin");
                    pizzaBuilder.setSauce("Tomato");
                    pizzaBuilder.addCheese();
                }
                public void makePepperoni(PizzaBuilder pizzaBuilder) {
                    pizzaBuilder.setCrust("Thick");
                    pizzaBuilder.setSauce("Tomato");
                    pizzaBuilder.addCheese();
                    pizzaBuilder.addPepperoni();
                }
            }







    }


