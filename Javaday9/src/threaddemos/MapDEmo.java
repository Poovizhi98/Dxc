package threaddemos;

import java.util.HashMap;
import java.util.Map;

public class MapDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<String,Integer>scores=new HashMap<String,Integer>();
      
      scores.put("Roshan", 3);
      scores.put("Roshan", 1);
      scores.put("Roshan", 9);
      scores.put("Mohan", 87);
      scores.put("Roshan", 0);
      scores.put("Arun", 45);
      
     System.out.println(scores);
	}

}
