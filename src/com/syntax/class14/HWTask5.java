package com.syntax.class14;

public class HWTask5 {
   void creatEmail (String name, String lastName, String gmail){
	   System.out.println(name.toLowerCase()+lastName.toLowerCase()+"@"+gmail+".com");
   }
	//Task6
   boolean isPrime(int num) {
	   boolean prime=true;
	   if (num <= 1) {
		   prime=false;
		   return prime;
	   }else {
		   for(int i=2; i<=num/2; i++) {
			   if(num%i==0) {
				 prime=false;
				 return prime;
			   }
		   }
		   }
	   
	return prime;
            }
   public static void main(String[] args) {
		// TODO Auto-generated method stub
HWTask5 hw=new HWTask5();
hw.creatEmail("Khrystyna", "Hoshii", "gmail");

System.out.println(hw.isPrime(11));
	}

}
