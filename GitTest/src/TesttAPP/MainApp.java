package TesttAPP;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ĤG�Ӫ���");
		//�ڬO�խ��ڭn�ק�
		System.out.println("�ĤT�Ӫ���");
		Math cMath = new Math();
		
		System.out.println(cMath.add(3, 5));
	}

}
class Math{
	int add(int a ,int b) {
		return a+b;
	}
	
}