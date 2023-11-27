package baitap_oop3.common;

public class BaseTest {
    public void createDriver (){
        Constants.setBrowser("Firefox");
        Constants.setReport(true);
        Constants.setHeadless(false);
        Constants constants = new Constants();
        constants.showContants();
    }
    public void closeDriver (){
        System.out.println("Close Browser: " + Constants.getBrowser());
    }
}
