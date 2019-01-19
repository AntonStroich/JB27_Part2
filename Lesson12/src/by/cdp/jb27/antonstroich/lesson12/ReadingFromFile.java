package by.cdp.jb27.antonstroich.lesson12;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

public class ReadingFromFile {

	public static void main(String[] args) {
		String path = "c:/myFiles/File.txt";

		String bookInfo = "id: 123456; name: War and Peace; author: Tolstoy" + '\n'
				+ "id: 223756; name: Crime and Punishment; author: Dostoevsky" + '\n'
				+ "id: 223758; name: The Idiot; author: Dostoevsky";

		try {
			ReadingFromFile.createFile(path, bookInfo);
		} catch (FileNotFoundException e) {
			System.out.println("Impossible to create the file because the path was not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Impossible to create the file because there is no access to the file!");
			e.printStackTrace();
		}

		ReadingFromFile.readFile(path);

		ArrayList<String> bookList = ReadingFromFile.fileToArray(path);

		ReadingFromFile.printArrayBook(bookList);
	}

	public static void createFile(String path, String bookInfo) throws IOException {
		FileWriter fw = new FileWriter(path);
		fw.write(bookInfo);
		fw.close();
	}

	public static void readFile(String path) {
		try {
			FileReader fr = new FileReader(path);
			Scanner scanner = new Scanner(fr);

			int i = 1;

			while (scanner.hasNextLine()) {
				System.out.println(i + " : " + scanner.nextLine());
				i++;
			}

			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error. File not Found!");
			e.printStackTrace();
		}

		catch (IOException e) {
			System.out.println("No access to the file!");
			e.printStackTrace();
		} finally {
			System.out.println("Reading of the file has been completed");
		}

	}

	public static ArrayList<String> fileToArray(String path) {
		ArrayList<String> bookList = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(path);
			Scanner scanner = new Scanner(fr);

			int i = 1;

			while (scanner.hasNextLine()) {
				bookList.add(i + " : " + scanner.nextLine());
				i++;
			}

			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error. File not Found!");
			e.printStackTrace();
		}

		catch (IOException e) {
			System.out.println("No access to the file!");
			e.printStackTrace();
		}
		return bookList;

	}

	public static void printArrayBook(ArrayList<String> bookList) {
		for (String s : bookList) {
			System.out.println(s);
		}

	}
}
