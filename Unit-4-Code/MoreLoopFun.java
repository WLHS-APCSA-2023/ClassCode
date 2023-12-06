public class MoreLoopFun {
    public static void main(String[] args) {
        /*
        for(initialization; boolean; update){
            what we want to do
        }
         */

        //a for loop that counts by ones from 1 to 5
        for(int start = 1; start < 5; start++ ){
            System.out.println(start);
        }

        //a for loop that prints the powers of two up to 100
        //can you have an infinite for loop?


        //write a for loop that counts by 4s from 5 up to 50


        //write a for loop that sums the numbers from 1 to 10
        int total = 0;

        ////////////////////////////////////////////////////
        //for loops compared to while loops////////////////
        //////////////////////////////////////////////////

        for(int num = 1; num <= 5; num++){
            System.out.println(num);
        }
        System.out.println("Finished!");

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }
        System.out.println("Finished!");

    }
}
