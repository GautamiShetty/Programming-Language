package basic;
import java.util.Scanner;

public class Pattern{

    static void pattern1(int size){
        for(int i = 1; i <= size; i++)
        {
            for(int j = 1; j <= size; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2( int size){
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int size){

        for(int i = size; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int size){
        for(int i = 1; i <=size; i++){
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int size){
        for(int i = 0; i < (size*2 - 1); i++)
        {
            if(i < size)
            {
                for(int j = 0; j <= i; j++)
                {
                    System.out.print("*");
                }
            }
            else{
                for(int j = 1; i + j < (2*size); j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int size){
        for(int i = 1; i <= size; i++)
        {
            for(int j = 1; j <= size; j++)
            {
                if(i+j<=size)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern7(int size){
        for(int i = 1; i <= size; i++)
        {
            for(int j = 1; j <= size; j++)
            {
                if(i>j)
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

//    Practice
    static void pattern8(int size){
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= (2*size)-1 ; j++){
                  if(i + j >= size+1 && j - i <= size-1){
                      System.out.print("*");
                  }
                  else{
                      System.out.print(" ");
                  }
            }
            System.out.println();
        }
    }
    //Practice
    static void pattern9(int size){
        for(int i = size; i >= 1; i--){
            for(int j = 1; j <= size; j++)
            {
                if(i+j < size+1)
                {
                    System.out.print(" ");
                }
                else{
                    for(int k = 1; k <= (2 * i)-1; k++)
                    {
                        System.out.print("*");
                    }
                    break;
                }
            }
            System.out.println();
        }
    }

    static void pattern10(int size){
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                if((i+j) >= size+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern11(int size){
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                if(i<=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int size){
        for(int i = 1; i <= (2*size); i++)
        {
            if(i <= size){
                for(int j = 1; j <= size; j++)
                {
                    if(i<=j){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            else{
                int temp = i - size;
                for(int j = 1; j <= size; j++){
                     if(temp+j >= size + 1){
                         System.out.print("* ");
                     }
                     else{
                         System.out.print(" ");
                     }
                }
            }
            System.out.println();
        }
    }

//    This pattern is best, used matric calculation to get it
    static void pattern13(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j <= (2*size)-2; j++){
                if(i+j == size-1 || j-i== size-1 || i==size-1)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern number : ");
        int num = sc.nextInt();
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        switch(num)
        {
            case 1-> pattern1(size);
            case 2-> pattern2(size);
            case 3-> pattern3(size);
            case 4-> pattern4(size);
            case 5-> pattern5(size);
            case 6-> pattern6(size);
            case 7-> pattern7(size);
            case 8-> pattern8(size);
            case 9-> pattern9(size);
            case 10-> pattern10(size);
            case 11-> pattern11(size);
            case 12-> pattern12(size);
            case 13-> pattern13(size);
//            case 14-> pattern14(size);
//            case 15-> pattern15(size);
//            case 16-> pattern16(size);
//            case 17-> pattern17(size);
//            case 18-> pattern18(size);
            default -> System.out.println("Invalid Pattern!");
        }
    }



}