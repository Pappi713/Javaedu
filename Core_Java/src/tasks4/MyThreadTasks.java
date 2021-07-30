package tasks4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyThreadTasks extends Thread {
	
	private String word;
	
	public MyThreadTasks(String word) {
		super();
		this.word = word;
	}

	public void run() {
		ArrayList<String> result = new ArrayList<>();

		try (FileReader f = new FileReader("C:\\Users\\Student\\eclipse-workspace\\files\\file.txt")) {
		    StringBuffer sb = new StringBuffer();
		    while (f.ready()) {
		        char c = (char) f.read();
		        if (c == '\n') {
		            result.add(sb.toString());
		            sb = new StringBuffer();
		        } else {
		            sb.append(c);
		        }
		    }
		    if (sb.length() > 0) {
		        result.add(sb.toString());
		    }
		    List<String> items = Arrays.asList(result.get(0).split(" "));
		    boolean contains =false;
		    for (String string : items) {
				if(string.equals(word)) {
					contains =true;
				}
			}
		    if(contains) {
		    	System.out.println(word + " Can be found in the file");
		    }
		    else {
		    	System.out.println(word + " Cannot be found in the file");
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
	}
}
