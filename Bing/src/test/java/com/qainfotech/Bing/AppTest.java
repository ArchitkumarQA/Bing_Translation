package com.qainfotech.Bing;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class AppTest 
{
	App app = new App();
	
	 @BeforeClass
 public void setDriver()
 { 
   app.setDriver();
 }
    @Test(priority=0)
    public void select_Language_1()
    {
    app.language_1();
    }
    @Test(priority=1)
    public void select_Language_2()
    {
    	app.language_2();
    }
    @Test(priority=2)
    public void Input_text()
    {
    	app. add_text_to_be_translated();
    }
    @Test(priority=3)
    public void Translated_text()
    {
    	Assert.assertTrue(app.output_Text());
    }
}

