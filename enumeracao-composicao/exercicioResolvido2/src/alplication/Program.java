package alplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comments;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Comments c1 = new Comments("Have a nice trip");
		Comments c2 = new Comments("Wow that's awesome");
		
		Post p1 = new Post(
				sdf.parse("24/12/2022 17:13:47"), 
				"Traveling to New Zealand ", 
				"I am going to visit wonderful country", 
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);

	}

}
