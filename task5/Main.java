package by.jb29.mod1.les07.task5;

public class Main {

	public static void main(String[] args) {
		Counter count = new Counter();
		
		System.out.print("Начальное значение счетчика:");
		count.state();
		//System.out.println();
		System.out.print("Увеличенное значение счетчика: ");
		count.increase();
		count.state();
		//System.out.println();
		System.out.print("Увеличенное значение счетчика: ");
		count.increase();
		count.increase();
		count.increase();
		count.increase();
		count.increase();
		count.increase();
		count.state();
		System.out.print("Уменьшенное значение счетчика: ");
		count.decrease();
		count.state();
		
		

	}

}
