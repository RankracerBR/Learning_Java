public class Arrays {
    public static void main(String []args){
        main2();
        main3();
        main4();
        main5();
        main6();
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        printArray(arr);
    }

    public static void main2() 
    {
    int[] arr = {10,11,12,13};
      int total = 0;	
       // Print all the array elements
       for (int i = 0; i < arr.length; i++) 
       {
         total += arr[i];
       }
       System.out.println("Sum of given arrray = " + total);
      
       
       // Finding the largest element
       /*
       double max = myList[0];
       for (int i = 1; i < myList.length; i++) {
          if (myList[i] > max) max = myList[i];
       }
       System.out.println("Max is " + max);
     */	
    }

    public static void main3(){
        int []arr = {10,11,12,13};
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println("Max value of array = "+max);
    }


    public static void main4(){
        int []arr = {10,11,12,13,14,15};

        for (int element: arr){
            System.out.println(element);
        }
    }

    public static void printArray(int []array){
        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]+ " ");
        }
    }
    
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i = 0, j = result.length - 1; i < list.length; i++, j--){
            result[j] = list[i];
        }
        return result;
    }

    public static void main5(){
        int array[][] = {{10,11,12}, {13,14,15}, {16,17,18}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(array[i][j]+" ");
            }
        }
        System.out.println();
    }

    public static void main6(){
        int array [][] = {{10,11,12}, {13,14,15}, {16,17,18}};
        int sum = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum += array[i][j];
            }
        }
        System.out.println("Sum of 2D array = "+sum);
    }

    

}
