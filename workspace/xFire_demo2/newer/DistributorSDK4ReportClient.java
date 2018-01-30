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
import org.apache.commons.lang3.time.DateFormatUtils;
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

import com.lvmama.vst.passport.processor.fangte.ScenicProduct;
import com.lvmama.vst.passport.util.WebServiceConstant;

public class DistributorSDK4ReportClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service2;

    public DistributorSDK4ReportClient() {
        create2();
        Endpoint DistributorSDK4ReportSoapLocalEndpointEP = service2 .addEndpoint(new QName("http://tempuri.org/", "DistributorSDK4ReportSoapLocalEndpoint"), new QName("http://tempuri.org/", "DistributorSDK4ReportSoapLocalBinding"), "xfire.local://DistributorSDK4Report");
        endpoints.put(new QName("http://tempuri.org/", "DistributorSDK4ReportSoapLocalEndpoint"), DistributorSDK4ReportSoapLocalEndpointEP);
        Endpoint DistributorSDK4ReportSoapEP = service2 .addEndpoint(new QName("http://tempuri.org/", "DistributorSDK4ReportSoap"), new QName("http://tempuri.org/", "DistributorSDK4ReportSoap"), "http://webservice.cnkly.com/WebService/DistributorSDKHttp.asmx");
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
    	String signature=WebServiceConstant.getProperties("dinosaurtownNew_MerchantKey");
    	String startTime = DateFormatUtils.format(startDate, "yyyy-MM-dd hh:mm:ss");
    	String endTime = DateFormatUtils.format(endDate, "yyyy-MM-dd hh:mm:ss");
    	DistributorSDK4ReportClient client = new DistributorSDK4ReportClient();
    	ArrayOfSDKProductsInfo productsInfo=client.getDistributorSDK4ReportSoap().getProductsInfoByTime(merchantCode, startTime, endTime, signature);
    	List<SDKProductsInfo> list=productsInfo.getSDKProductsInfo();
    	for(SDKProductsInfo prodInfo : list){
    		int price = (int)prodInfo.getPrice();
    		ScenicProduct scenicProd = new ScenicProduct();
    		scenicProd.setProductIdSupplier(String.valueOf(prodInfo.getProductID()));
    		scenicProd.setProductTypeSupplier(merchantCode);
    		scenicProd.setProductName(prodInfo.getProductName());
    		scenicProd.setStartDate(prodInfo.getBeginUseDate().replace("/", "-"));
    		scenicProd.setEndDate(prodInfo.getEndUseDate().replace("/", "-"));
    		scenicProd.setPrice(String.valueOf(price));
    		scenicProd.setMerchantType("");
    		scenicProducts.add(scenicProd);
    	}
    	return scenicProducts;
    }
}
