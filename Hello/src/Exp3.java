
public class Exp3 {
	int a=10;
	int b=20;
	char c;
	boolean d;
	public void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("");

	}
	public void add() {
		int x=10;
		int y=30;
		int local=x+y;
		int global=a+b;
		System.out.println("local"+" "+local);
		System.out.println("global"+" "+global);
	}
	public void multiply() {
		int x=20;
		int y=30;
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Exp3 obj = new Exp3();
		obj.show();
		obj.add();
		obj.multiply();
		
		}

}
