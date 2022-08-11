//WAP for implementing the local and global variables with user defined method and display the output.
class exp4{
	int a=10;
	int b=20;
	public void display(){
		int a=30;
		int b=40;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	//here 10 and 20 are global/instance variables
	//30 and 40 are local variables
	//this refer to instance variables
	//with this keyboard 10 and 20 will be printed
	//otherwise 30 and 40
	public static void main(String[] main){
		exp4 obj=new exp4();
		obj.display();
	}
}
