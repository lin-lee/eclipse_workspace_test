package lin;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Cfg {
	
	public static void main(String [] args) throws IOException, TemplateException{
		Configuration cfg = new Configuration();
		cfg.setDirectoryForTemplateLoading(
				new File("src/templates"));
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		
		Template temp = cfg.getTemplate("test.ftl");
		
		Writer out = new OutputStreamWriter(System.out);
		temp.process(createMap(), out);
		out.flush();
	}
	
	private static Map createMap(){
		Map root = new HashMap();
		root.put("user", "Big Joe");
		Map latest = new HashMap();
		root.put("lastestProduct", latest);
		latest.put("url", "products/greenmouse.html");
		latest.put("name", "green mouse");
		Map a = root;
		return a;
	}

}
