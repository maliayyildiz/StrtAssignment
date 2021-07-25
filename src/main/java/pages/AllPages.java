package pages;

public class AllPages {
    public AllPages(){}

    private HomePage homePage;
    private LoginPage loginPage;
    private RequestCourierPage requestCourierPage;
    private AddressPage addressPage;
    private SchedulePage schedulePage;
    private DescribePackagePage describePackagePage;
    private TransportTypePage transportTypePage;
    private DeliveriesPage deliveriesPage;


    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }return homePage;
    }
    public LoginPage loginPage(){
        if (loginPage == null){
            loginPage= new LoginPage();
        }return loginPage;
    }
    public RequestCourierPage requestCourierPage(){
        if (requestCourierPage == null){
             requestCourierPage = new RequestCourierPage();
        }
        return requestCourierPage;
    }
    public AddressPage addressPage(){
        if(addressPage == null){
            addressPage = new AddressPage();
        }
        return addressPage;
    }
    public SchedulePage schedulePage(){
        if(schedulePage == null){
            schedulePage = new SchedulePage();
        }
        return schedulePage;
    }
    public DescribePackagePage describePackagePage(){
        if(describePackagePage == null){
            describePackagePage = new DescribePackagePage();
        }
        return describePackagePage;
    }
    public TransportTypePage transportTypePage(){
        if (transportTypePage == null){
            transportTypePage = new TransportTypePage();
        }
        return transportTypePage;
    }
    public DeliveriesPage deliveriesPage(){
        if (describePackagePage == null){
            describePackagePage = new DescribePackagePage();
        }
        return deliveriesPage;
    }

}
