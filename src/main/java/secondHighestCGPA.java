public class secondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double highest=cgpa[0];
        double secondHighest=cgpa[0];

        for (int i = 0; i < cgpa.length; i++) {
            if (cgpa[i] > highest)
                highest = cgpa[i];
        }


        for (int i = 0; i < cgpa.length; i++) {


            if (cgpa[i] > secondHighest && cgpa[i] != highest) {
                secondHighest = cgpa[i];
            }
        }
        System.out.println("Second highest CGPA: " +secondHighest);

    }
}
