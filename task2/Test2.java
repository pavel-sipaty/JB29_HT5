package by.jb29.mod1.les07.task2;

/*Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей
экземпляра класса.*/

public class Test2 {

	private int quantity;
	private double price;

	// конструктор по умолчанию
	public Test2() {
		quantity = 0;
		price = 0;
	}

	
	//конструктор с входными параметрами
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
	
	
	//сеттеры и геттеры
	
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
