
import javax.swing.JOptionPane;

public class student
{
	// Properties
	private  String name;
	private long id;
	private float mark;
	
	

	 public void setName (String newName) {
	  name = newName;
}

	public long getid(long newid){
		return id;
	}
	public void setmarks(float newMarks) {
		
	
		
		if (mark<0 && mark >100){
			JOptionPane.showInputDialog("error");
		mark =0;
		}
		else 
			mark=newMarks;
			
		
			
			
			
 		
			
		
	}
	
	public String getname(){
	return name;
}


	public long getid(){
	return id;
	}
	
	public float getmarks(){
	return mark;
	}
	
}


