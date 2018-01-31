package lin;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import lin.bean.Customer;

public class JAXBExample {
	
	public static void main(String [] args){
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("lin");
		customer.setAge(29);
		
		try{
			//File file = new File("d:/opt/file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller m = jaxbContext.createMarshaller();
			//Unmarshaller um = jaxbContext.createUnmarshaller();
			
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			m.marshal(customer, System.out);

		}catch(JAXBException e){
			e.printStackTrace();
		}
	}

}
