package com.basic.alphabet;

public class M_AlphabetStarPattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1 || j==5 ||(i+j==6 && i<=3) ||(i==2 && j==2) )
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}

	}

}
