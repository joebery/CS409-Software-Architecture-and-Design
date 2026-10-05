public class Hill_Climbing {

    public static void main(String[] args) {

        hill_climbing("1010");
    }

    // create your method here
    public static float generate_fitness(String permutation) {
        float score = 0;

        for (int i = 0; i < permutation.length(); i++) {
//            System.out.println(i);
            if (permutation.charAt(i) == '1') {
                score++;
//                System.out.println(score);
            }

        }
//        System.out.println(score);
//        System.out.println(permutation.length());

        return score;
    }

    public static String generate_neighbors(String permutations) {
        int flipLocation = 1;
        String newSolution = "";
        if (permutations.length() != 1) {
            flipLocation = (int) (Math.random() * permutations.length());

            if (permutations.charAt(flipLocation) == '1') {
                newSolution = permutations.substring(0, flipLocation) + 0 + permutations.substring(flipLocation + 1);
            } else {
                newSolution = permutations.substring(0, flipLocation) + 1 + permutations.substring(flipLocation + 1);
            }
        }
        return newSolution;
    }


    public static void hill_climbing(String permutations) {
        String newPermutaion = "";
        double newScore = generate_fitness(generate_neighbors(permutations));
        while (generate_fitness(permutations) < permutations.length()) {
            newPermutaion = generate_neighbors(permutations);
            newScore = generate_fitness(newPermutaion);
            if (newScore > generate_fitness(permutations)) {
                permutations = newPermutaion;
                System.out.println("new solution is better, uppdating solution to " + newPermutaion);
            } else {
                System.out.println("new solution is not better, keeping current solution: " + permutations);
            }
        }
        System.out.println("final solution is " + permutations + " with score " + generate_fitness(permutations));
    }

}

