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
		
		Comments c3 = new Comments("Good night");
		Comments c4 = new Comments("May the Force be with you");
		
		Post p2 = new Post(
				sdf.parse("25/12/2022 08:13:47"), 
				"Good night guys ", 
				"See you tomorrow", 5);
		
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
