package by.jb29.mod1.les07.task5;

public class Main {

	public static void main(String[] args) {
		Counter count = new Counter();
		
		System.out.print("��������� �������� ��������:");
		count.state();
		//System.out.println();
		System.out.print("����������� �������� ��������: ");
		count.increase();
		count.state();
		//System.out.println();
		System.out.print("����������� �������� ��������: ");
		count.increase();
		count.increase();
		count.increase();
		count.increase();
		count.increase();
		count.increase();
		count.state();
		System.out.print("����������� �������� ��������: ");
		count.decrease();
		count.state();
		
		

	}

}
