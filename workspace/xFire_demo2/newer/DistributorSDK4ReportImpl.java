package newer;



import javax.jws.WebService;


@WebService(serviceName = "DistributorSDK4Report", targetNamespace = "http://tempuri.org/", endpointInterface = "com.DistributorSDK4ReportSoap")
public class DistributorSDK4ReportImpl
    implements DistributorSDK4ReportSoap
{


    public String postSearchBalance(String strPartnerCode, String strSignature, int strPayWay) {
        throw new UnsupportedOperationException();
    }

    public String postOrdersProducts(String strPartnerCode, String strSignature, SDKCustomerInfo Customer, InsertProductInfo OrderProducts, String refNo) {
        throw new UnsupportedOperationException();
    }

    public ArrayOfKProductOrder searchOrderInfoByOrderNo(String strOrderNo) {
        throw new UnsupportedOperationException();
    }

    public ArrayOfSDKProductsInfo getProductsInfoByTime(String MerchantCode, String StartTime, String EndTime, String Signature) {
        throw new UnsupportedOperationException();
    }

}
