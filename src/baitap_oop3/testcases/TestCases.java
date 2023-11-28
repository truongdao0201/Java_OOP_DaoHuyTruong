package baitap_oop3.testcases;

import baitap_oop3.common.BaseTest;
import baitap_oop3.common.Constants;

import java.util.Scanner;


public class TestCases extends BaseTest {
    public void Login() {
        Constants constants = new Constants();
        PropertiesHelper.loadAllFiles();
        createDriver();
        System.out.println();
        System.out.println("-------------------------- * Login * --------------------------");
        System.out.println("Step 1. Open brower: " + Constants.getBrowser());
        System.out.println("Step 2. Access to link: " + PropertiesHelper.getValue("url"));
        System.out.println("Step 3. Input value for account: " + PropertiesHelper.getValue("account"));
        System.out.println("Step 4. Input value for password: " + PropertiesHelper.getValue("password"));
        System.out.println("Step 5. Click radio button: Remember Me");
        System.out.println("Step 6. Click button:  Login");
        System.out.println("Step 7. Verify login succesful and title Dashboard on Home page");
        System.out.println();
        closeDriver();
        System.out.println();
    }

    public void Add_Category() {
        PropertiesHelper.loadAllFiles();
        createDriver();
        System.out.println();
        System.out.println("-------------------------- * Add Category * --------------------------");
        System.out.println("Step 1.Open brower: " + Constants.getBrowser());
        System.out.println("Step 2.Access to link: " + PropertiesHelper.getValue("url"));
        System.out.println("Step 3.Input value for account: " + PropertiesHelper.getValue("account"));
        System.out.println("Step 4.Input value for password: " + PropertiesHelper.getValue("password"));
        System.out.println("Step 5.Click button:  Login");
        System.out.println("Step 6.Click option Products on the left menu home page ");
        System.out.println("Step 7.Click option Products on the left menu home page ");
        System.out.println("Step 8.Choice option Category");
        System.out.println("Step 9.Click button Add new category");
        System.out.println("Step 10.Input value field name: Watch Seiko");
        System.out.println("Step 11.Choice option Đồng Hồ on dropdow menu Parent Category");
        System.out.println("Step 12.Input value field Ordering Number: 2");
        System.out.println("Step 13.Choice option Digital on dropdow menu Type");
        System.out.println("Step 14.Upload media Banner:  watch.png");
        System.out.println("Step 15.Upload media Icon:  watch1.png");
        System.out.println("Step 16.Input value field Meta Title: Seiko");
        System.out.println("Step 17.Input value field Meta Description: Good Product");
        System.out.println("Step 18.Choice option Size on dropdow menu Filtering Attributes");
        System.out.println("Step 19.Click button:  Save");
        System.out.println("Step 20.Verify add category succesful");
        System.out.println();
        closeDriver();
        System.out.println();
    }

    public void Close() {
        System.err.println("The End");
        System.exit(0);
    }

    public void Menu() {
        TestCases testCases = new TestCases();
        System.out.println("-------------- Menu Test Case --------------");
        System.out.println("Option 1: Test Login ");
        System.out.println("Option 2: Test Add Category ");
        System.out.println("Option 3: Close Program ");
        System.out.println();
        System.out.print("=====> Please choice option : ");
        try {
            int n = new Scanner(System.in).nextInt();
            switch (n) {
                case 1:
                    testCases.Login();
                    break;
                case 2:
                    testCases.Add_Category();
                    break;
                case 3:
                    testCases.Close();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        while (true) {
            testCases.Menu();
        }
    }
}

