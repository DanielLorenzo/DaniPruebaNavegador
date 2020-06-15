package es.codeurjc.ais.tictactoe;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Prueba {

	 protected WebDriver driver;

	  @BeforeAll
	  public static void setupClass() {
		  WebDriverManager.chromedriver().clearCache();
		  WebDriverManager.chromedriver().driverVersion("83.0.4103.97").setup();
		  WebApp.start();
	  }

	  @BeforeEach

	  public void setupTest() {
	   driver = new ChromeDriver();
	  }

	  @AfterEach
	  public void teardown() {
	   if (driver != null) {
		   driver.quit();
	   }
	  }

	  @Test

	  public void test() {
	   driver.get("http://www.google.es");
	  }

	}
