import java.util.Scanner;
 class Age {

    public static void main(String arg[]){
        int age;
        System.out.println("Please enter your age...");
        try (Scanner sc = new Scanner(System.in)) {
            age=sc.nextInt();
        
        if(age==18){
            System.out.println(" U can eligible for given vote");
        }else{
            System.out.println(" u can not elligible for given voet");
        }}

}}



