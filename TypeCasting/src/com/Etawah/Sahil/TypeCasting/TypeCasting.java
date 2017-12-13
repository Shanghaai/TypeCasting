package com.Etawah.Sahil.TypeCasting;

class TypeCasting {
	int k = (int) 200460.54165;
	double x1 = (double)20;
	double x2 = 20;
	String z;
	//char s = (char)z; //can not cast from String to char i.e narrowing

}

class TypeCast
{
	public static void main(String[] args) {
		TypeCasting t = new TypeCasting();
		System.out.println("int value of k :"+t.k);
		System.out.println("double value of x1 : "+t.x1);
		System.out.println("double value of x2 :"+t.x2);
	}
}