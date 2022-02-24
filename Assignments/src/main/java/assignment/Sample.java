package assignment;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	  public static void palindrome(String s)
	  {
	
	    String rev = new StringBuffer(s).reverse().toString();
	  
	
	    if (s.equals(rev))
	      System.out.println("Yes");
	  
	    else
	      System.out.println("No");
	  }
	  
	  public static void main (String[] args)
	             
	  {
	    palindrome("yuvashree");
	    
	  }
}




