package assignment;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun obj=new fun();
		Scanner input =new Scanner(System.in);

		   System.out.println("which type you want");
		   System.out.println("press 1 for int");
		   System.out.println("press 2 for double");
		   int choice=input.nextInt();
		   if(choice==1){
			   System.out.println("Enter Two Numbers");
			   int a=input.nextInt();
			   int b=input.nextInt();


		   System.out.println("answer is"+obj.add(a,b));
		   System.out.println("answer is"+obj.sub(a,b));
		   System.out.println("answer is"+obj.mul(a,b));
		   System.out.println("answer is"+obj.div(a,b));
			}

		   if(choice==2){
			   System.out.println("Enter Two Numbers");
			   double a=input.nextDouble();
			   double b=input.nextDouble();

		   System.out.println("answer is"+obj.add(a,b));
		   System.out.println("answer is"+obj.sub(a,b));
		   System.out.println("answer is"+obj.mul(a,b));
		   System.out.println("answer is"+obj.div(a,b));
			
		}


	}


	

}
