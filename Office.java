import java.util.Scanner;

class Office {
          public static void main(String[]args){
                    
                    Scanner sc=new Scanner(System.in);
System.out.println("plz Enter the day");
     int day=sc.nextInt();
switch(day){
          case 1:
          System.out.println("Today is off Sumday");
          break;
          case 2:
          System.out.println("Today is Monday");
          break;
          case 3:
     System.out.println("Today is Tuesday");
     break;
     case 4:
     System.out.println("Today is wednesday");
     break;
     case 5:
     System.out.println("Today is Thrusday");
     break;
     case 6:
     System.out.println("Today is Friday");
     break;
     case 7:
     System.out.println("Today is Saturaday ");

break;
default:
System.out.println("invallid day");
}

          }
          
}
