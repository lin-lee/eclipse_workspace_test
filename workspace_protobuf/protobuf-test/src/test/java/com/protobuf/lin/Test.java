package com.protobuf.lin;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.google.protobuf.InvalidProtocolBufferException;
import com.sq.protobuf.FirstProtobuf;

public class Test {
	public static void main(String[] args) {

		// 序列化过程
		// FirstProtobuf是生成类的名字，即proto文件中的java_outer_classname
		// testBuf是里面某个序列的名字，即proto文件中的message testBuf
		FirstProtobuf.testBuf.Builder builder = FirstProtobuf.testBuf
				.newBuilder();
		builder.setID(777);
		builder.setUrl("shiqi");

		// testBuf
		FirstProtobuf.testBuf info = builder.build();

		byte[] result = info.toByteArray();

		

		// 反序列化过程
		try {
			FirstProtobuf.testBuf testBuf = FirstProtobuf.testBuf
					.parseFrom(result);
			System.out.println(testBuf);
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}

	}
}