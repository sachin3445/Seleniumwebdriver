package keyWords;

public class thisKeyword {

	
	int x,y;
	
	//using method
	void setdata(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() 
	{
	System.out.println(x);
	System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
		thisKeyword th =new thisKeyword();
		th.x = 100;
		th.y = 300;
		th.display();

	}

}
