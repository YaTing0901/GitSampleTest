package TesttAPP;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第二個版本");
		//我是組員我要修改
		System.out.println("第三個版本");
		Math cMath = new Math();
		
		System.out.println(cMath.add(3, 5));
	}

}
class Math{
	int add(int a ,int b) {
		return a+b;
	}
	
}