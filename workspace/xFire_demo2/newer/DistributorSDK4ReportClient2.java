
package newer;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.commons.lang.time.DateUtils;
import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.aegis.AegisBindingProvider;
import org.codehaus.xfire.annotations.AnnotationServiceFactory;
import org.codehaus.xfire.annotations.jsr181.Jsr181WebAnnotations;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.jaxb2.JaxbTypeRegistry;
import org.codehaus.xfire.service.Endpoint;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.soap.AbstractSoapBinding;
import org.codehaus.xfire.transport.TransportManager;

import com.lvmama.vst.passport.processor.dinosaurtown.newer2.ArrayOfSDKProductsInfo;
import com.lvmama.vst.passport.processor.dinosaurtown.newer2.DistributorSDK4ReportClient;
import com.lvmama.vst.passport.processor.dinosaurtown.newer2.InsertProductInfo;
import com.lvmama.vst.passport.processor.dinosaurtown.newer2.SDKCustomerInfo;
import com.lvmama.vst.passport.processor.dinosaurtown.newer2.SDKProductsInfo;
import com.lvmama.vst.passport.processor.fangte.ScenicProduct;
import com.lvmama.vst.passport.util.WebServiceConstant;

public class DistributorSDK4ReportClient2 {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service2;

    public DistributorSDK4ReportClient2() {
        create2();
        Endpoint DistributorSDK4ReportSoapLocalEndpointEP = service2 .addEndpoint(new QName("http://tempuri.org/", "DistributorSDK4ReportSoapLocalEndpoint"), new QName("http://tempuri.org/", "DistributorSDK4ReportSoapLocalBinding"), "xfire.local://DistributorSDK4Report");
        endpoints.put(new QName("http://tempuri.org/", "DistributorSDK4ReportSoapLocalEndpoint"), DistributorSDK4ReportSoapLocalEndpointEP);
        Endpoint DistributorSDK4ReportSoapEP = service2 .addEndpoint(new QName("http://tempuri.org/", "DistributorSDK4ReportSoap"), new QName("http://tempuri.org/", "DistributorSDK4ReportSoap"), "http://zuimei.test.konglongcheng.com/WebService/DistributorSDKHttp.asmx");
        endpoints.put(new QName("http://tempuri.org/", "DistributorSDK4ReportSoap"), DistributorSDK4ReportSoapEP);
    }

    public Object getEndpoint(Endpoint endpoint) {
        try {
            return proxyFactory.create((endpoint).getBinding(), (endpoint).getUrl());
        } catch (MalformedURLException e) {
            throw new XFireRuntimeException("Invalid URL", e);
        }
    }

    public Object getEndpoint(QName name) {
        Endpoint endpoint = ((Endpoint) endpoints.get((name)));
        if ((endpoint) == null) {
            throw new IllegalStateException("No such endpoint!");
        }
        return getEndpoint((endpoint));
    }

    public Collection getEndpoints() {
        return endpoints.values();
    }

    private void create2() {
        TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
        HashMap props = new HashMap();
        props.put("annotations.allow.interface", true);
        AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new JaxbTypeRegistry()));
        asf.setBindingCreationEnabled(false);
        service2 = asf.create((com.lvmama.vst.passport.processor.dinosaurtown.newer2.DistributorSDK4ReportSoap.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service2, new QName("http://tempuri.org/", "DistributorSDK4ReportSoap"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service2, new QName("http://tempuri.org/", "DistributorSDK4ReportSoapLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public DistributorSDK4ReportSoap getDistributorSDK4ReportSoapLocalEndpoint() {
        return ((DistributorSDK4ReportSoap)(this).getEndpoint(new QName("http://tempuri.org/", "DistributorSDK4ReportSoapLocalEndpoint")));
    }

    public DistributorSDK4ReportSoap getDistributorSDK4ReportSoapLocalEndpoint(String url) {
        DistributorSDK4ReportSoap var = getDistributorSDK4ReportSoapLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public DistributorSDK4ReportSoap getDistributorSDK4ReportSoap() {
        return ((DistributorSDK4ReportSoap)(this).getEndpoint(new QName("http://tempuri.org/", "DistributorSDK4ReportSoap")));
    }

    public DistributorSDK4ReportSoap getDistributorSDK4ReportSoap(String url) {
        DistributorSDK4ReportSoap var = getDistributorSDK4ReportSoap();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }
    
    public static void main(String[] arg){
    	//String MerchantCode="LXS001936";
    	String MerchantCode="zqgl001";
    	Map<String,Object> queryOption = new HashMap<String, Object>();
    	queryOption.put("SupplierUid", MerchantCode);
//    	getTestProducts(queryOption);
    	getTestSignature();
    }

//    	String MerchantCode="LXS001180";
//		String MerchantKey="11111111";
//    	String MerchantKey="A1B9c58Z";
//    	String MerchantCode="LXS002058";
    public static List<ScenicProduct> getTestProducts(Map<String,Object> queryOption){
    	Date startDate =(Date)queryOption.get("startDate");
    	Date endDate = (Date)queryOption.get("endDate");
    	if(startDate == null){
    		startDate = new Date();
    	}
    	if(endDate == null){
    		endDate = DateUtils.addYears(startDate, 3);
    	}
    	List<ScenicProduct> scenicProducts = new ArrayList<ScenicProduct>();
    	String merchantCode = String.valueOf(queryOption.get("SupplierUid"));
    	String MerchantKey=WebServiceConstant.getProperties("dinosaurtown_MerchantKey2");
//    	String startTime = DateFormatUtils.format(startDate, "yyyy-MM-dd HH:mm:ss");
//    	String endTime = DateFormatUtils.format(endDate, "yyyy-MM-dd HH:mm:ss");
    	String startTime="";
    	String endTime="";
    	DistributorSDK4ReportClient client=new DistributorSDK4ReportClient();
//    	String signature=client.getKLCServiceSoap().testSignature(MerchantKey, merchantCode, startTime, endTime, "", "", "", "", "", "");
    	ArrayOfSDKProductsInfo SDKProductsInfo=client.getDistributorSDK4ReportSoap().getProductsInfoByTime(merchantCode, startTime, endTime, MerchantKey);
    	List<SDKProductsInfo> list=SDKProductsInfo.getSDKProductsInfo();
    	for(SDKProductsInfo prodInfo : list){
    		int price = (int)prodInfo.getPrice();
    		//System.out.println(prodInfo.getProductNo()+"	"+prodInfo.getProductName()+"	"+prodInfo.getStartTime()+"		"+prodInfo.getEndTime()+"	价格="+prodInfo.getPrice()+"	是否可售:"+prodInfo.getProductFlag());
    		ScenicProduct scenicProd = new ScenicProduct();
    		scenicProd.setProductIdSupplier(String.valueOf((prodInfo.getProductID())));
    		scenicProd.setProductTypeSupplier(prodInfo.getProductName());
    		scenicProd.setProductName(prodInfo.getProductName());
    		scenicProd.setStartDate(prodInfo.getBeginUseDate());
    		scenicProd.setEndDate(prodInfo.getEndUseDate());
    		scenicProd.setPrice(String.valueOf(price));
    		scenicProd.setMerchantType(merchantCode);
    		scenicProducts.add(scenicProd);
    	}
    	return scenicProducts;
    }
	private static void getTestSignature() {
		try {
    		String MerchantCode="zqgl001";
			String MerchantKey="S2lGUTZtZ1VMeSt1OVVvSGZtdmJxRHZKUFZ1TSt6SkZsYUVvc2lpOHFrUXdSN1J1cnJTcll3PT0=";
			//String RefNo="320282";
			String RefNo="3456152";
			
			SDKCustomerInfo customer=new SDKCustomerInfo();
			customer.setShippingAddress("上海金沙江路3131");
			customer.setIDCard("31010419820827401X");
			customer.setCustomerName("黄小�?);
			customer.setCustomerMobile("15900615050");
			customer.setCustomerGender("�?);
			customer.setCustomerEmail("12345@126.com");
			
//			List<OrderProducts> orderProductsList=new ArrayList<OrderProducts>();
			InsertProductInfo orderProduct=new InsertProductInfo();
			orderProduct.setBeginUseDate("2014-12-10");
			orderProduct.setEndUseDate("");
			orderProduct.setPrice(210d);
		//	orderProduct.setProductName("香树湾标�?);
			orderProduct.setProductName("网订到付恐龙园成人票");
			orderProduct.setProductID(Integer.valueOf("1449"));
	//		orderProduct.setProductType("香树湾标�?);
			orderProduct.setProductType("");
			orderProduct.setQuantity(1);
//			orderProductsList.add(orderProduct);
			
	//		ArrayOfOrderProduct orderPrdouct=new ArrayOfOrderProduct();
	//		orderPrdouct.orderProduct=orderProductsList;
			DistributorSDK4ReportClient client=new DistributorSDK4ReportClient();
//			String strSignature=client.getKLCServiceSoap().testSignature(MerchantKey,MerchantCode, RefNo, customer.getCustomerName(), customer.getCustomerGender(),customer.getCustomerMobile(),customer.getIDCard(), customer.getShippingAddress(), customer.getCustomerEmail(), "");
			System.out.println("Signature........"+MerchantKey);
			String result=client.getDistributorSDK4ReportSoap().postOrdersProducts(MerchantCode, MerchantKey,customer, orderProduct,RefNo);
			System.out.println("result........"+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
