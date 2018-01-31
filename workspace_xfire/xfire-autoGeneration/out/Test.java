import java.net.URLEncoder;

import out.GoodsOperationServiceClient;
import out.IllegalBlockSizeException;


public class Test {
	
	 private static final String XIEXIEWANG_PARTNER_CODE = "jack";
	    private static final String XIEXIEWANG_KEY = "123456";
	    private static final String ENCRYPT_EXT = "Wa9BwN4HTwMJKEGofIGfv4kxllYu4JVC";

	
	public static void main(String [] args) throws Exception{
		GoodsOperationServiceClient c = new GoodsOperationServiceClient();
		String param = get();
		param = encrypt(param);
		try {
			String s = c.getGoodsOperationPort().getElementRequest(param);
			System.out.println(s);
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String encrypt(String parameter) throws Exception {

        String encrypted = DESCoder.desEncrypt(parameter, ENCRYPT_EXT);
        String result = URLEncoder.encode(encrypted, "UTF-8");

        return result;
    }
	public static String get(){
		StringBuffer sb = new StringBuffer();
		 sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
	        sb.append("<Body>");
	        sb.append("<Request>");

	        sb.append("<PartnerCode>");
	        sb.append(XIEXIEWANG_PARTNER_CODE);
	        sb.append("</PartnerCode>");

	        sb.append("<Key>");
	        sb.append(XIEXIEWANG_KEY);
	        sb.append("</Key>");

	        sb.append("<SwiftNumber>");
	        sb.append("201405");
	        sb.append("</SwiftNumber>");

	        sb.append("<RequestType>");
	        sb.append("add_order");
	        sb.append("</RequestType>");

	        sb.append("<MerchID>");
	        sb.append("155");
	        sb.append("</MerchID>");

	        sb.append("<AmountEle>");
	        sb.append(1);
	        sb.append("</AmountEle>");

	        sb.append("<CodeModel>");
	        sb.append(1);
	        sb.append("</CodeModel>");

	        sb.append("<CustomerMobile>");
	        sb.append("15533445566");
	        sb.append("</CustomerMobile>");

	        sb.append("<Remarks>");
	        sb.append("");
	        sb.append("</Remarks>");

	        sb.append("</Request>");
	        sb.append("</Body>");

	        return sb.toString();
	}

}
