package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	//um post contem varios comentarios, composição	
	private List<Comments> comments = new ArrayList<>();
	
	public Post() {}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comments> getComments() {
		return comments;
	}
/*
 * nessa situação deve-se excluir o setComments pois este abre opção para setar uma nova lista diferente
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
*/	
	
	public void addComment (Comments parComentario) {
		comments.add(parComentario);
	}
	
	public void removeComment (Comments parComentario) {
		comments.remove(parComentario);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title +"\n");
		sb.append(likes);
		sb.append(" Likes -");
		sb.append(sdf.format(moment)+"\n");
		sb.append(comments+"\n ");
		sb.append("Comments: \n");
		
		for(Comments c: comments) {
			sb.append(c.getText()+"\n");
		}
		
		return sb.toString();
		
	}

	
	
}
