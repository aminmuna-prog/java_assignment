public class nondupnumArray {

    public static void main(String[] args) {
         int array[] = new int[]{1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};

         for(int i = 0; i < array.length; i++){
             int count = 0;
             for(int j = 0; j< array.length; j++){
                 if(array[j] == array[i]){
                      count++;
                 }
             }
             if(count == 1){
                 System.out.print(array[i] + " " );
             }
         }

    }
}
