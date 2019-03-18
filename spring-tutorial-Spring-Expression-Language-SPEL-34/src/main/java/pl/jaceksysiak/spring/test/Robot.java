package pl.jaceksysiak.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	private int id=0;
	private String speech="hello";
	
	public void speach(){
		System.out.println(id + ": " + speech);
	}

	@Autowired
	public void setId(@Value("#{randomText.getText()?.length()}") int id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("#{randomText.getText()}") String speech) {
		this.speech = speech;
	}
	
	

}
