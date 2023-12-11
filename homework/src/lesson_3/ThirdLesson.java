package lesson_3;

public class ThirdLesson {
    public static void main(String[] args) {

        System.out.println("First task: print all odd numbers from 1 to 100 using for loop >> ");
        for(int i = 1; i<101; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }

        }

        System.out.println("..........\n");



        System.out.println("Second task: given the number n calculate factorial n! >>");
        int n = 6;

        int countFactorial = 1;

        for(int i = 1; i<=n; i++){
            countFactorial = countFactorial*i;
        }
        System.out.println("Factorial of "+n+ " is " + countFactorial);

        System.out.println("........\n");


        System.out.println("Third task: rewrite first and second tasks using while loop");

        int j = 1;
        while(j < 101){
            if(j%2 != 0){
                System.out.println(j);
            }
            j++;
        }

        countFactorial = 1;
        int i = 1;
        while(i < n+1){
            countFactorial = countFactorial*i;

            i++;
        }
        System.out.println("The factorial from  the while loop version: "+countFactorial);

        System.out.println("........");


        System.out.println("Forth task: rewrite first and second tasks using do while loop >>");

        i = 1;

        do {
            if(i%2 != 0){
                System.out.println(i);

            }
            i++;
        }
        while(i < 101);

        countFactorial = 1;
        i = 1;
        // А як краще, перевикористовувати минулі змінні чи створити нові?

        do {
            countFactorial = countFactorial*i;
            i++;
        }
        while(i < n+1);
        System.out.println("The result of do while factorial version: "+countFactorial);



        System.out.println("Fifth task: calculate x to the power of n ");

        int x = 3;
        n = 4;
        int result = 1;
        // if x is 0
        // if x is 1
        // else
        if(x == 0) System.out.println("0 to the power of "+n+ " is 0");

        else if(x == 1) System.out.println("1 to the power of "+n+ " is 1");

        else {

            for (int counter = 0; counter < n; counter++) {
                result *= x;
            }
            System.out.println("x to the power of n is "+ result);
        }

        System.out.println("Sixth task: there is such a sequence 0,-5,-10,-15... print first ten numbers from it");

        int task6 = 0;
        int counterTaskSixth = 0;
        while(counterTaskSixth<10){
            System.out.println(task6);
            task6-=5;
            counterTaskSixth++;
        }
        System.out.println("Seventh task:");
        int numMultiplyTable = 5;

        for(int l = 0; l<11; l++){
            int result7= l*numMultiplyTable;
            System.out.println(l + " * " + numMultiplyTable + " = " + result7);
        }

        System.out.println("Eighth task:");
        int[] oddNum = {1,3,5,7,9,11,13,15,17,19};
        for(i = 0; i<10; i++){
            if(i<9)  System.out.print(oddNum[i]+",");
            else System.out.print(oddNum[i]);
        }


        System.out.println("\n");
        System.out.println("Ninth task:");
        int[] arr = {56,44,10006,891,32,2,993,5,8,37,91};

        int minNum = arr[0];

        for(int count1 : arr){
            if(minNum>count1){
                minNum = count1;
            }

        }
        System.out.println("The smallest number is "+minNum);

        System.out.println("Tenth task:");


        int maxNum = arr[0];

        for(int count1 : arr){
            if(maxNum<count1){
                maxNum = count1;
            }

        }
        System.out.println("The largest number is "+maxNum);


        System.out.println("Eleventh task: ");
        int minNum11 = arr[0];
        int maxNum11 = arr[0];
        int indxMin = 0;
        int indxMax = 0;
        int generalIndx = 0;

        for(int count1 : arr){
            if(minNum11>count1){
                minNum11 = count1;
                indxMin = generalIndx;

            }
            else if(maxNum11<count1){
                maxNum11 = count1;
                indxMax = generalIndx;
            }
            generalIndx++;

        }

        int temp = arr[indxMin];
        arr[indxMin] = arr[indxMax];
        arr[indxMax] = temp;

        for(int count1 : arr){
            System.out.println(count1);
        }

    }




}
