package com.adactin.helper;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	public static Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}

}
