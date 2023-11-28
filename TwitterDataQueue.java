/* 
 * Name: Lukas Hammett
 * Date: 12/01/2022
 * Class Name: TwitterDataQueue.java
 * Description: Uses a Queue object, implemented by
 * 				a Linked List, to emulate a Collection
 * 				Queue object that creates a queue
 * 				out of Twitter location data.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TwitterDataQueue {

	public static ArrayList<TwitterLocationData> allData = new ArrayList<TwitterLocationData>();
	Queue queue = new Queue();

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(new File("TwitterLocationData.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		input.nextLine();

		while(input.hasNext()) {
			String[] fields = input.nextLine().split(",");
			if(fields[0].equals("NULL"))
				break;
			
			TwitterLocationData data = new TwitterLocationData(
					Integer.parseInt(fields[0]), fields[1], fields[2], fields[3], fields[4]);

			allData.add(data);
		}

		input.close();

		for(TwitterLocationData data: allData)
			System.out.println(data);
	}
}
