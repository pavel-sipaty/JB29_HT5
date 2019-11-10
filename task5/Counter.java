package by.jb29.mod1.les07.task5;

/*ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать свое
значение на единицу в заданном диапазоне. ѕредусмотрите инициализацию счетчика значени€ми по
умолчанию и произвольными значени€ми. —четчик имеет методы увеличени€ и уменьшени€ состо€ни€, и
метод позвол€ющее получить его текущее состо€ние. Ќаписать код, демонстрирующий все возможности
класса.*/


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
			System.out.println("¬ы вышли за границы счетчика.");
		}
		//return count;
	}
	
	public void decrease() {
		if(count > START) {
			count--;
		}else {
			System.out.println("¬ы вышли за границы счетчика.");
		}
	}
	
	public void state() {
		System.out.println(getCount());
	}

}
