package com.neosoft;
import java.io.*;
import java.util.*;

 //Step 2- created one class which implements Housie interface
public class HousieTickets implements Housie{
	
	public static int lucky_numbers,lower_limit,higher_limit,no_of_tickets;
    Scanner scanner=new Scanner(System.in); 
    public static int[] a,b;
	   
    //Step 3- one method to take input at runtime
	   public void inputData()throws IOException
	    {
		
		   System.out.print("Enter the lower limit : ");
		   lower_limit=scanner.nextInt();
		   System.out.print("\nEnter the upper limit : ");
		   higher_limit=scanner.nextInt();
		   System.out.print("\nEnter no. of tickets : ");
		   no_of_tickets=scanner.nextInt();
		   for(int i=0;;i++) {
			   System.out.print("\nEnter the no. of lucky numbers in a ticket : ");
			   lucky_numbers=scanner.nextInt();
			   if(lucky_numbers>=((higher_limit-lower_limit)+1)) {
				   System.out.print("\nError=No.of lucky numbers cannot be more than limit)\n");   
			   }else
				   break;
		   }
		   //step 4- Array which contains elements= no.of lucky numbers
	        a=new int[(higher_limit-lower_limit)+1];
	    }
	  // Step 5- A method which will initialize the array
	  public void init()
	    {
	        int i,c1=0;
	        for(i=lower_limit;i<=higher_limit;i++)
	        {
	            a[c1]=i;
	            c1++;
	        }
	    }
	  // Step 6-A method to Randomly generate ticket numbers
	  public void randomNumberGeneration()
	    {
		 
	        Random ran=new Random();
	        int i,j,k,c,c1=0;
	        for(i=1;i<=no_of_tickets;i++)
	        {
	            b=new int[lucky_numbers];
	            for(j=0;j<lucky_numbers;j++)
	            {
	                c=ran.nextInt(a.length);
	                if(a[c]!=-1)
	                {
	                    b[j]=a[c];
	                    a[c]=-1;
	                }
	                else
	                j--;
	            
	            }
	            init();
	            System.out.print("\n\nTicket no. "+i+" : \n\n");
	            c1=0;
	            for(k=0;k<lucky_numbers;k++)
	            {
	                System.out.print(b[k]+"  ");
	                c1++;
	                if(c1==10)
	                {
	                    System.out.print("\n");
	                    c1=0;
	                }
	            }
	        }
	    }
	  //Step 7- main method
	     public static void main(String[] args) throws IOException {
		
	       HousieTickets housieTickets=new HousieTickets();
			housieTickets.inputData();
			housieTickets.init();
			housieTickets.randomNumberGeneration();
			}
	      }



