import java.util.Scanner;

public class WeightMeasure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String weighttxt;
        int weight;
        byte roundcount;

        String measure;

        boolean[] booleans = {true, true, true, true, true, true};

        while (true) {

            System.out.println("Please enter some weight between 1kg to 40kg.");
            weighttxt = scanner.nextLine();

            measure = "Measured using [";

            if (inInt(weighttxt)) {
                weight = Integer.parseInt(weighttxt);
                roundcount = 0;
                while (weight != 0) {

                    if (weight >= 20 && booleans[0]) {

                        booleans[0] = false;
                        weight -= 20;
                        measure += " 20kg";

                    } else if (weight >= 10 && booleans[1]) {

                        booleans[1] = false;
                        weight -= 10;
                        measure += " 10kg";

                    } else if (weight >= 5 && booleans[2]) {

                        booleans[2] = false;
                        weight -= 5;
                        measure += " 5kg";

                    } else if (weight >= 3 && booleans[3]) {

                        booleans[3] = false;
                        weight -= 3;
                        measure += " 3kg";

                    } else if (weight >= 2 && booleans[4]) {

                        booleans[4] = false;
                        weight -= 2;
                        measure += " 2kg";

                    } else if (weight >= 1 && booleans[5]) {

                        booleans[5] = false;
                        weight -= 1;
                        measure += " 1kg";

                    }
                    roundcount++;
                }

                System.out.println(measure + " ]  & "+roundcount+" disc(s) used.");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||\n");

            }

        }

    }

    private static boolean inInt(String weighttxt) {

        try {

            if (Integer.parseInt(weighttxt) <= 40 && Integer.parseInt(weighttxt) >= 1) {
                return true;
            } else {
                System.out.println("Invalid weight.");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||\n");

                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid weight.");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||\n");

            return false;
        }
    }

}
