

set Axis_Lib=E:\apache-tomcat-6-32-enjoy-8080-net\webapps\axis\WEB-INF\lib
set Java_Cmd=java -Djava.ext.dirs=%Axis_Lib%
set Axis_Servlet=http://localhost:8080/axis-1.4-src-webapps-axis/servlet/AxisServlet
%Java_Cmd% org.apache.axis.client.AdminClient -l%Axis_Servlet% deploy.wsdd
cmd