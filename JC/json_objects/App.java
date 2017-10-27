package json_objects;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class App {
	public static void main(String[] args) throws JSONException {
		JSONObject obj = new JSONObject();
		obj.put("name", "mkyong.com");
		obj.put("age", new Integer(100));

		JSONArray list = new JSONArray();
		list.put("msg 1");
		list.put("msg 2");
		list.put("msg 3");

		obj.put("messages", list);
		System.out.println(obj.toString());
	}
}
