package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Exception04.readFile("exception.txt");
		} catch(FileNotFoundException e) {
			System.out.println("FileNotFoundExcepection例外が発生");
		}
		System.out.println("プログラム終了");

	}

	public static void readFile(String fileName) throws FileNotFoundException {
		System.out.println("ファイルの読み込み開始");
		FileReader rf = new FileReader(fileName);
		System.out.println(fileName + "の読み込みの終了");
	}

}
