package com.demoMaven.testDevops;

/**
 * Hello world!
 *
 */
public class App 
{
	public String Hello()
	{
		return "This is Demo Maven Project";
	}
	
    public static void main( String[] args )
    {
    	App appobj = new App();
    	
        System.out.println(appobj.Hello());
    }
}
