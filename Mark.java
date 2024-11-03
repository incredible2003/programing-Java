import java.util.Scanner;

class Mark {
    public static void main(String arg[]){
        int marks;
        System.out.println("Please enter your marks");
        try (Scanner sc = new Scanner(System.in)) {
            marks=sc.nextInt();
        }
        if(marks>=60 && marks<=100){
            System.out.println("First division");
        }else if(marks>=50&& marks<=59){
            System.out.println("Second division");
        }else if(marks>=35 && marks<=49){
            System.out.println("Third division");
        }else {
            System.out.println("your Failled.........");
        }


    }
}