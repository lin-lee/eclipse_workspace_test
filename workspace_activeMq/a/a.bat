set Axis_Lib=E:\eclipse32_enjoy_4.4.1\workspace_activeMq\a\lib 
set Java_Cmd=java -Djava.ext.dirs=%Axis_Lib% 
set Output_Path=E:\eclipse32_enjoy_4.4.1\workspace_activeMq\a
set Package=server.SayHello.wuhan
rem  %Java_Cmd% org.apache.axis.wsdl.WSDL2Java -o%Output_Path% -p%Package% MXSE_lhs.wsdl 
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java -o%Output_Path% -p%Package% http://180.168.107.62:9302/OTAWuHan.svc?wsdl