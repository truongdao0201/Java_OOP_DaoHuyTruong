package baitap_oop3.common;

public class Constants {
    public static String browser;
    public static boolean report;
    public static boolean headless;

    // Getter / setter


    public static String getBrowser() {
        return browser;
    }

    public static boolean isReport() {
        return report;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public Constants(){

    }

    public Constants (String browser, boolean report, boolean headless){
        Constants.browser = browser;
        Constants.report = report;
        Constants.headless = headless;
    }
    public void showContants (){
        System.out.println("Browser: " + Constants.getBrowser());
        System.out.println("Report: " + Constants.isReport());
        System.out.println("Headless: " + Constants.isHeadless());
    }
}
