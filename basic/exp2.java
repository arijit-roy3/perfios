class exp2{
	int a;
	float b;	
	char c;
	boolean d;
	public void display(){
		int i=1;//local variables do not have a value default 
		System.out.println(i);//compile error if no default value provided
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//default value
		//integer->0
		//float->0.0
		//char->''
		//boolean-> false
	}
	public static void main(String args[]){
		exp2 obj=new exp2();
		obj.display();
	}
}
