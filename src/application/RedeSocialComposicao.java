package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class RedeSocialComposicao {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Tenha uma boa viagem!");
		Comment c2 = new Comment("Uau que maneiro!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
									"Viajando para Nova Zelandia", 
									"Vou visitar esse país maravilhoso!", 
									12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Boa noite");
		Comment c4 = new Comment("Que a força esteja com você");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), 
									"Boa noite pessoal", 
									"Vejo vocês amanha", 
									5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		System.out.println(p2);
		
		

	}

}
