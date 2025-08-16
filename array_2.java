class ArraysExample{

    void multiArrays(){
     int[][] arr = {{32,45,67}, {34,45,78}, {89,4,56}};

     for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[i].length; j++){
           System.out.println(arr[i][j]);
        }
        
     }
    }   
     // void demoarray(){
    //     int [] ages = new int[3]; 
    //     String [] name = {"rahul", "raj", "aditya", "dubey"};


    //     ages [0] = 45;
    //     ages[1] = 55;
    //     ages[2] = 60;
         // for loop used
        // for(int i = 0; i < 3; i++){
        //  System.out.println(age[i]);
        // }

     // for-each loop used
    //  for(int age : ages){
    //     System.out.println(age);
    //  }
       
    // using while loop

    //   int i = 0;
    //   while (i < 3) {
    //     System.out.println(ages[i]);
    //     ++i;
    //   }
//     }
 }

    class array_2 {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        // obj.demoarray();
        obj.multiArrays();
    }
}
