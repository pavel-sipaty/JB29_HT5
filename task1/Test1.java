package by.jb29.mod1.les07.task1;


/*�������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ����
����������. �������� �����, ������� ������� ����� �������� ���� ����������, � �����, ������� �������
���������� �������� �� ���� ���� ����������.*/


public class Test1 {
	
	public int a;
	public int b;
	
	
	
	public int sum(int a, int b) {
		
		int sum = a + b;
		return sum;
		
	}

/////////////////////////////////////////////////////////////
	
	public int max(int a, int b) {
		
		int max = a;
		
		if(a > b) {
			max = a;
		}else if(b > a) {
			max = b;
		}
		
		return max;
		
	}
	
///////////////////////////////////////////////////////////
	
	public void printSum(int sum) {
		
		System.out.println("����� ����� " + sum);
		
	}
 
///////////////////////////////////////////////////////////
	
	public void printMax(int max) {
		
		System.out.println("������������ ����� - " + max);
		
	}
	
}