import java.util.Scanner;

class Loop1 {
          public static void main(String[] args) {
                    // Write a program take user  number to print table?
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter a number");
                    int n =sc.nextInt();
                  //  for(int i=0;i<=10;i++){
                   //           System.out.println(n+" * "+i+" ="+i*n);
                   int sum =0;
                   // write a program to print sum of all no? 
                  // for(int i=1;i<n;i++){
                  //  sum=sum+i;
                  // }
                   //System.out.println("sum i"+sum );
                   // }
                   // write a program to print sum of all no? 
                   for(int i=1;i<n;i++){
                    // write a program to print sum of all even no ?10
                    sum=sum+ 2*i;
                   }
                   System.out.println("sum is "+sum );
                    }



                    
          }
          

