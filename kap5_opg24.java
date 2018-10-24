public class kap5_opg24 {
// main method

    /* (sum a series) write a program that computes the following series
        1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + ... + 95 / 97 + 97 / 99
    */
    public static void main(String[] args) {
        double sum = 0.0;                       // tildeler variablen sum, værdien 0.0
        for (double i = 1.0; i <= 97; i += 2) { // så længe i er under 97 tillægges værdien i+2 og loopet fortsætter
            sum += i / (i + 2);                 // variablen sum tilskrives værdien af sum + højre side af lighedstegnet
        }

        System.out.println("The sum of the following series\n" +
                "        1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + ... + 95 / 97 + 97 / 99");
        System.out.println("is:" + sum);

    }
}
