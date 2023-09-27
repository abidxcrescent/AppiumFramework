package com.library;

import java.io.IOException;

public class CloseAppium {
	
	CloseAppium(){
	     try{
	           ProcessBuilder processBuilder =new ProcessBuilder("taskkill ","/f","/IM","WinAppDriver.exe");
	           processBuilder.start();
	       }
	       catch (IOException e){
	           e.printStackTrace();
	           throw new RuntimeException(e);
	       }
	}
	
}
