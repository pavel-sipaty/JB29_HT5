package by.jb29.mod1.les07.task4;

public class Main {

	public static void main(String[] args) {
		
		Train[] trains = new Train[5];
		
		trains[0] = new Train("������", 25, "13:55");
		trains[1] = new Train("������", 350, "10:00");
		trains[2] = new Train("�����", 7, "18:17");
		trains[3] = new Train("�����-���������", 10, "22:23");
		trains[4] = new Train("�������", 120, "08:47");
		
		//Train.sortNum(trains);
		
		//Train.sortNumPrint(trains);
		
		Train.infoTrainPrint(trains);

	}

}
