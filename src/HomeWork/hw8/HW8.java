package HomeWork.hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class HW8 {
//	請建立一個Collection物件並將以下資料加入：
//	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	Object物件、“Snoopy”、BigInteger(“1000”)
//	印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)移除不是java.lang.Number相關的物件
//	再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		Object obj = new Object();
		list.add(obj);
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		Iterator objs = list.iterator();  
		while (objs.hasNext())
			System.out.println(objs.next()); //使用Iterator
		
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			Object objss = list.get(i);
			System.out.println(objss);  //使用傳統for
			}
		
		System.out.println();
		for (Object objsss : list) {
            System.out.println(objsss);  //使用foreach
        	}
		
		Iterator objs2 = list.iterator();  //移除不是java.lang.Number相關的物件再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		while (objs2.hasNext()) {
			Object objssss = objs2.next();
			if (!(objssss instanceof Number)) {
				objs2.remove();
				}
			}
		System.out.println();
		for (Object item : list) {
			System.out.println(item);
			}
	}
	
	
//	設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//	需使用的集合裡
//	請寫一隻程式，能印出不重複的Train物件
//	public static void main(String[] args) {
//		Train[] trains = new Train[7];
//		trains[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
//		trains[1] = new Train(1254, "區間", "屏東", "基隆", 700);
//		trains[2] = new Train(118, "自強", "高雄", "台北", 500);
//		trains[3] = new Train(1288, "區間", "新竹", "基隆", 400);
//		trains[4] = new Train(122, "自強", "台中", "花蓮", 600);
//		trains[5] = new Train(1222, "區間", "樹林", "七堵", 300);
//		trains[6] = new Train(1254, "區間", "屏東", "基隆", 700);
//		Set<Train> trainSet = new HashSet<>();
//		for (int i = 0; i < trains.length; i++) {
//			trainSet.add(trains[i]);
//		}
//		
//		for (Train t : trainSet) {
//			System.out.println(t.toString());
//        }
//
//	}
	
	
//	請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//	public static void main(String[] args) {
//		Train[] trains = new Train[7];
//		trains[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
//		trains[1] = new Train(1254, "區間", "屏東", "基隆", 700);
//		trains[2] = new Train(118, "自強", "高雄", "台北", 500);
//		trains[3] = new Train(1288, "區間", "新竹", "基隆", 400);
//		trains[4] = new Train(122, "自強", "台中", "花蓮", 600);
//		trains[5] = new Train(1222, "區間", "樹林", "七堵", 300);
//		trains[6] = new Train(1254, "區間", "屏東", "基隆", 700);
//		Arrays.sort(trains);
//		for (int i = 0; i < trains.length; i++) {
//			System.out.println(trains[i]);
//        }
//	}
//	
//	
//	不僅能讓班次編號由大排到小印出，還可以不重複印出Train物件
//	public static void main(String[] args) {
//		Train[] trains = new Train[7];
//		trains[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
//		trains[1] = new Train(1254, "區間", "屏東", "基隆", 700);
//		trains[2] = new Train(118, "自強", "高雄", "台北", 500);
//		trains[3] = new Train(1288, "區間", "新竹", "基隆", 400);
//		trains[4] = new Train(122, "自強", "台中", "花蓮", 600);
//		trains[5] = new Train(1222, "區間", "樹林", "七堵", 300);
//		trains[6] = new Train(1254, "區間", "屏東", "基隆", 700);
//		Set<Train> trainSet = new HashSet<>();
//		for (int i = 0; i < trains.length; i++) {
//			trainSet.add(trains[i]);
//		}
//
//		List<Train> trainList = new ArrayList<>();
//		Iterator<Train> objs = trainSet.iterator();
//		while (objs.hasNext()) {
//			trainList.add(objs.next());
//			}
//		Collections.sort(trainList);
//		for (Train t : trainList) {
//		System.out.println(t.toString());
//			}
//	}

}
