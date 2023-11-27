package baitap_oop3.testcases;

import baitap_oop3.common.BaseTest;
import baitap_oop3.common.Constants;

import java.sql.SQLOutput;


public class TestCases extends BaseTest {
    public void Login (){
        Constants constants = new Constants();
        PropertiesHelper.loadAllFiles();
        createDriver();
        System.out.println();
        System.out.println("Open brower: " + Constants.getBrowser());
        System.out.println("Access to link: " + PropertiesHelper.getValue("url"));
        System.out.println("Input value for account: " +  PropertiesHelper.getValue("account"));
        System.out.println("Input value for password: " + PropertiesHelper.getValue("password"));
        System.out.println("Click radio button: Remember Me");
        System.out.println("Click button:  Login");
        System.out.println("Verify login succesful and title Dashboard on Home page");
        closeDriver();

    }
    public void Add_Category (){
        createDriver();
        System.out.println("add category");
        closeDriver();
    }
    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        System.out.println("-------- Test Case Login --------");
        testCases.Login();
        System.out.println("-------- *************** --------");
//        System.out.println("-------- Add Category --------");
//        testCases.Add_Category();
    }
}

