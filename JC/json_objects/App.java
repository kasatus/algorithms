package json_objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import scala.Tuple2;

public class App {
	public static void main(String[] args) throws JSONException, URISyntaxException, IOException {
//		JSONObject obj = new JSONObject();
//		obj.put("name", "mkyong.com");
//		obj.put("age", new Integer(100));
//
//		JSONArray list = new JSONArray();
//		list.put("msg 1");
//		list.put("msg 2");
//		list.put("msg 3");
//
//		obj.put("messages", list);
//		System.out.println(obj.toString());
//		
//		
//		int i = 0;
//		while (i < 3) {
//			try {
//				i++;
//				System.out.println(i);
//				i = 0;
//				break;
//			} catch (Exception e) {
//				e.getMessage();
//			}
//		}
		
		memoryMapWriter();

		
		
		
	}
	
	private static void memoryMapWriter() throws IOException {
		File f = new File("/Users/skasatki/git/algorithms/target/classes/json_objects/memoryMap");
		f.delete();
		FileChannel fc = new RandomAccessFile(f, "rw").getChannel();
		long bufferSize=8*1000;
		MappedByteBuffer mem =fc.map(FileChannel.MapMode.READ_WRITE, 0, bufferSize);
		int start = 0;
		long counter=1;
		long HUNDREDK=100000;
		long startT = System.currentTimeMillis();
		long noOfMessage = HUNDREDK * 10 * 10;
		for (;;) {
			if (!mem.hasRemaining()) {
				start += mem.position();
				mem = fc.map(FileChannel.MapMode.READ_WRITE, start, bufferSize);
			}
			mem.putLong(counter);
			counter++;
			if (counter > noOfMessage)
				break;
		}
		long endT = System.currentTimeMillis();
		long tot = endT - startT;
		System.out.println(String.format("No Of Message %s , Time(ms) %s ", noOfMessage, tot));

	}
	
	private static void jsonParserANX() throws FileNotFoundException, JSONException {
		Scanner scan = new Scanner(new File("/Users/skasatki/git/algorithms/target/classes/json_objects/test.txt"));
		String response = new String();
		while (scan.hasNext()) {
			String nxtLine = scan.nextLine();
			System.out.println(nxtLine);
			response = response + nxtLine;
		}
		System.out.println(response);
		JSONObject obj = new JSONObject(response.toString());
		JSONArray arr = null;
		if (obj.getJSONArray("web_rep_data") != null) {
			arr = obj.getJSONArray("web_rep_data");
		}
		else 
			System.out.println("Can't parse json file from ANX API " + response);
			//LOGGER.error("Can't parse json file from ANX API " + response);
		if (arr.length() == 0)
			System.out.println("Json array from ANX response is empty");
		List<Tuple2<String, String>> result = new ArrayList<Tuple2<String, String>>();
		String uri = null;
		String meta = null;
		for (int i = 0; i < arr.length(); i++) {
			uri = arr.getJSONObject(i).getString("elements");
			meta = arr.getJSONObject(i).getString("rspns");
			result.add(new Tuple2<String, String>(uri, meta));
		}
		
		
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i)._1 + " : " + result.get(i)._2);
		}
			
		System.out.println(result.size());
	}
}
