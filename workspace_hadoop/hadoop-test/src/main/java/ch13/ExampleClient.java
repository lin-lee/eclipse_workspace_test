package ch13;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleClient {
	private static final Logger LOG = LoggerFactory.getLogger(ExampleClient.class);
	
	public static void main(String [] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException{
		
		HBaseAdmin admin = null;
		HTable table = null;
		try{
			Configuration config = HBaseConfiguration.create();
			
			// Create table
			admin = new HBaseAdmin(config);
			
			@SuppressWarnings("deprecation")
			HTableDescriptor htd = new HTableDescriptor("test");
			HColumnDescriptor hcd = new HColumnDescriptor("data");
			
			htd.addFamily(hcd);
			admin.createTable(htd);
			byte[] tablename = htd.getName();
			HTableDescriptor[] tables = admin.listTables();
			
			if(tables.length != 1 && Bytes.equals(tablename, tables[0].getName())){
				throw new IOException("Failed create of table");
			}
			
			//Run some operations -- a put, a get, and a scan --against the table
			table = new HTable(config, tablename);
			byte[] row1 = Bytes.toBytes("row1");
			Put p1 = new Put(row1);
			byte[] databytes = Bytes.toBytes(" data");
			p1.add(databytes, Bytes.toBytes("1"), Bytes.toBytes("value1"));
			table.put(p1);
			
			Get g = new Get(row1);
			Result result = table.get(g);
			LOG.info("Get: " + result);
			
			Scan scan = new Scan();
			ResultScanner scanner = table.getScanner(scan);
			try{
				for(Result scannerResult: scanner){
					LOG.info(" Scan: " + scannerResult);
				}
			}finally{
				scanner.close();
			}
			
			// Drop the table
			admin.disableTable(tablename);
			admin.deleteTable(tablename);
			
		}catch(Exception e){
			
		}finally{
			admin.close();
			table.close();
		}
		
	}

}
