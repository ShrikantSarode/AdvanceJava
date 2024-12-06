package example.spring.rest;

import java.time.LocalDate;

public class Greeting {

	private String content;
	private LocalDate dataOfGreeting;

	public void Greeting() {

	}

	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Greeting(String content, LocalDate dataOfGreeting) {
		super();
		this.content = content;
		this.dataOfGreeting = dataOfGreeting;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getDataOfGreeting() {
		return dataOfGreeting;
	}

	public void setDataOfGreeting(LocalDate dataOfGreeting) {
		this.dataOfGreeting = dataOfGreeting;
	}

	@Override
	public String toString() {
		return "Greeting [content=" + content + ", dataOfGreeting=" + dataOfGreeting + "]";
	}

}
