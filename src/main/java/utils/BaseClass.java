package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
@BeforeSuite
public void bsConfig() {
	
}
@BeforeTest//we use before test whenever w need to perform parallel execution.
public void btConfig() {
	System.out.println("parallel execution");
}
@BeforeClass
public void bcConfig() {
	System.out.println("launch the browser");
	System.out.println("navigate to the url");
}
@BeforeMethod
public void bmConfig() {
	System.out.println("login to the applictaion");
}

@AfterMethod
public void amConfig() {
	System.out.println("logout from the applictaion");

}

@AfterClass

public void aConfig() {
	System.out.println("close the browser");

}
@AfterTest

public void atConfig() {
	System.out.println("stop the parallel execution");
}

@AfterSuite

public void asConfig() {
System.out.println("close the database");	
}
}
