package Week2.Day3.Assignment;

public class WebElement {
	
	public void click()
	{
		System.out.println("Clicked");
	}

	public void setText(String text)
	{
		System.out.println(text);
	}
	public static void main(String[] args)
	{
		WebElement We=new WebElement();
		We.click();
		We.setText("Element Value");


	}

}
