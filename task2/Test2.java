package by.jb29.mod1.les07.task2;

/*������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������. ��������
�����������, ���������������� ����� ������ �� ���������. �������� set- � get- ������ ��� �����
���������� ������.*/

public class Test2 {

	private int quantity;
	private double price;

	// ����������� �� ���������
	public Test2() {
		quantity = 0;
		price = 0;
	}

	
	//����������� � �������� �����������
	public Test2(int _quantity, double _price) {
		
		if(_quantity < 0) {
			quantity = 0;
		} else {
			quantity = _quantity;
		}
		
		if(_price < 0) {
			price = 0;
		}else {
			price = _price;
		}
		
	}
	
	
	//������� � �������
	
	public void setQuantity(int addQuantity) {
		quantity = addQuantity;
	}
	
	public void setPrice(double addPrice) {
		price = addPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}

}
