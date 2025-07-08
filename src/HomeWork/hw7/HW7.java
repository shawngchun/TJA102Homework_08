package HomeWork.hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import module06_12.Book;

public class HW7 {
//	請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//	Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
//	public static void main(String[] args) {
//		File smpl = new File("d:\\javawork\\Sample.txt");
//		System.out.println(smpl.length() + "個位元組");
//
//        try {
//            String str;
//            FileReader fr = new FileReader(smpl);
//            BufferedReader br = new BufferedReader(fr) ;
//            
//            int count = 0, line = 0;
//            while ((str = br.readLine()) != null) {
//            	if (!str.trim().isEmpty()) {
//            		count += str.length();
//            		line+=1;
//            	}
//            }
//            System.out.println(count + "個字元");
//            System.out.println(line+ "列資料");
//            br.close();   
//            fr.close();
//          
//        } catch(IOException e){}
//	}

//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為
//Data.txt的檔案裡(請使用append功能讓每次執行結果都能被保存起來
//	public static void main(String[] args) {
//
//        try {
//            FileWriter fw = new FileWriter("d:\\javawork\\Data.txt", true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
//		
//            for (int i = 0; i < 10; i++) {
//            	pw.println((int)(Math.random()*1000) + 1);
//            }
//            
//            pw.close();
//            bw.close();
//            fw.close();
//            
//        } catch(IOException e){}
//	}

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
//呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
//	public static void main(String[] args) {
//		copyFile("d:\\javawork\\Data.txt", "d:\\javawork\\DataCopied.txt");
//	}
//	
//	public static void copyFile(String s1, String s2) {
//		
//		File rgn = new File(s1);
//		File cpy = new File(s2);
//		try {
//			FileReader rgnFr = new FileReader(rgn);
//			BufferedReader rgnBr = new BufferedReader(rgnFr);
//			
//			FileWriter cpyFw = new FileWriter(cpy);
//			BufferedWriter cpyBw = new BufferedWriter(cpyFw);
//			PrintWriter cpyPw = new PrintWriter(cpyBw);
//			
//			String s;
//			while((s = rgnBr.readLine()) != null) {
//				cpyPw.println(s);
//			}
//			cpyPw.close();
//			cpyBw.close();
//			cpyFw.close();
//			rgnBr.close();
//			rgnFr.close();
//			
//		} catch(IOException e) {}
//	}

//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察
//結果如何(請利用多型簡化本題的程式設計)
	public static void main(String[] args) throws Exception {

		Pet[] cats = new Cat[2];
		cats[0] = new Cat("Miao");
		cats[1] = new Cat("Miaoo");
		Pet[] dogs = new Dog[2];
		dogs[0] = new Dog("Woof");
		dogs[1] = new Dog("Wooff");

		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File("C:\\data\\Object.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < cats.length; i++)
			oos.writeObject(cats[i]);
		for (int i = 0; i < dogs.length; i++)
			oos.writeObject(dogs[i]);
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				((Pet) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {}

		ois.close();
		fis.close();

	}

}

abstract class Pet implements Serializable {
	private static final long serialVersionUID = 1L;

	public abstract void speak();
}

class Cat extends Pet {
	private static final long serialVersionUID = 1L;
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}

class Dog extends Pet {
	private static final long serialVersionUID = 1L;
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
