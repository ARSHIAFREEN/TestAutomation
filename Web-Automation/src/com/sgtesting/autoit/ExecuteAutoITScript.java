package com.sgtesting.autoit;

public class ExecuteAutoITScript {

	public static void main(String[] args) {
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:/AutoIT/FirstTestScript1.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}