package by.jb29.mod1.les07.task1;

/*�������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ����
����������. �������� �����, ������� ������� ����� �������� ���� ����������, � �����, ������� �������
���������� �������� �� ���� ���� ����������.*/

public class Main {

	public static void main(String[] args) {

		Test1 chisla = new Test1();
		
		chisla.a = 2;
		chisla.b = 2;
		
		int sum;
		int max;
		
		// print sum
		sum = chisla.sum(chisla.a, chisla.b);
		chisla.printSum(sum);
		
		// print MAX
		if (chisla.a == chisla.b) {
			System.out.println("��� ����� �����.");
		} else {
			max = chisla.max(chisla.a, chisla.b);
			chisla.printMax(max);
		}
	}
}
