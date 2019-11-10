package by.jb29.mod1.les07.task4;

import java.util.Arrays;
import java.util.Scanner;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
одинаковыми пунктами назначения должны быть упорядочены по времени отправления.*/

public class Train {

	private String destination;
	private int num;
	private String timeDep;

	// конструкторы

	public Train() {

	}

	public Train(String addDestination, int addNum, String addTimeDep) {

		destination = addDestination;
		num = addNum;
		timeDep = addTimeDep;

	}

	// сеттеры

	public void setDestination(String addDestination) {
		destination = addDestination;
	}

	public void setNum(int addNum) {
		num = addNum;
	}

	public void setTimeDep(String addTimeDep) {
		timeDep = addTimeDep;
	}

	// геттеры
	public String getDestination() {
		return destination;
	}

	public int getNum() {
		return num;
	}

	public String getTimeDep() {
		return timeDep;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", num=" + num + ", timeDep=" + timeDep + "]";
	}

	// сортировка по номерам поездов

	public static void sortNum(Train[] trains) {

		Train maxTrain;
		int maxTrainIndex;

		for (int i = 0; i < trains.length - 1; i++) {

			maxTrain = trains[i];
			maxTrainIndex = i;

			for (int j = i + 1; j < trains.length; j++) {

				if (maxTrain.getNum() < trains[j].getNum()) {
					maxTrain = trains[j];
					maxTrainIndex = j;
				}

				Train temp = trains[i];
				trains[i] = maxTrain;
				trains[maxTrainIndex] = temp;

			}

		}

	}

	// вывод сортировки

	public static void sortNumPrint(Train[] trains) {

		System.out.println(Arrays.toString(trains));

	}

	// вывод инфы о поезде

	public static void infoTrainPrint(Train[] trains) {

		System.out.print("Введите номер поезда > ");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int enteredNum = sc.nextInt();
		int count = 0;

		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNum() == enteredNum) {

				System.out.println("Поезд №" + trains[i].getNum());
				System.out.println("Пункт назначения: " + trains[i].getDestination());
				System.out.println("Время отправления: " + trains[i].getTimeDep());
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Поезда с номером " + enteredNum + " не существует.");
		}

	}

}
