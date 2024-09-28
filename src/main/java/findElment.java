import java.util.Scanner;

public class findElment {
    public static void main(String[] args) {
        double[] cgpa = new double[]{3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for(int i = 0; i < cgpa.length; i++){
            for (int j = i + 1; j< cgpa.length; j++){
                if(cgpa[i] > cgpa[j]){
                    double temp = cgpa[j];
                     cgpa[j] = cgpa[i];
                    cgpa[i] = temp;

                }
            }

        }

        System.out.println("CGPA after sorting: ");
        for (int i = 0; i < cgpa.length; i++){
            System.out.print(cgpa[i] + ", ");
        }
        System.out.println(cgpa[cgpa.length - 1]);

        System.out.println("Enter CGPA that you want to find: ");
        Scanner input = new Scanner(System.in);
        double key = input.nextDouble();
        boolean flag = false;
        int low = 0;
        int high = cgpa.length - 1;
        while (low <= high){

            int mid = low + (high - low)/2;
            if(key == cgpa[mid]){
                System.out.println("CGPA found...");
                flag = true;
                break;
            }
            else if(key > cgpa[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

        }
        if (flag == false){
            System.out.println("CGPA not found...");
        }


    }


}
