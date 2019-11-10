package by.jb29.mod1.les07.task5;

/*������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ��������� ����
�������� �� ������� � �������� ���������. ������������� ������������� �������� ���������� ��
��������� � ������������� ����������. ������� ����� ������ ���������� � ���������� ���������, �
����� ����������� �������� ��� ������� ���������. �������� ���, ��������������� ��� �����������
������.*/


public class Counter {
	
	private final int START = 0;
	private final int END = 10000;
	private int count;
	
	public Counter() {
		count = 0;
	}
	
	
	public Counter(int newCount) {
		count = newCount;
	}
	
	
	public void setCount(int newCount) {
		count = newCount;
	}
	
		
	public int getCount() {
		return count;
	}
	
	
		
	public void increase() {
		if(count < END) {
			count++;
		}else {
			System.out.println("�� ����� �� ������� ��������.");
		}
		//return count;
	}
	
	public void decrease() {
		if(count > START) {
			count--;
		}else {
			System.out.println("�� ����� �� ������� ��������.");
		}
	}
	
	public void state() {
		System.out.println(getCount());
	}

}
