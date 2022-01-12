package com.example.newProject.xml;


public class XmlPersonDAO {

	private XmlJdbcConnection xmlJdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}
	
	public int returnFirst(int[] numbers) {
		System.out.println(numbers[0]);
		return numbers[0];
	}
	
	
}
