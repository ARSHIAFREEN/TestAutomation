package com.sgtesting.autoit;

public class DemoAutoITScript {

	public static void main(String[] args) {
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:/AutoIT/DemoAutoITScript.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}