package com.app.test;

import com.app.dao.ImageDao;
import com.app.dao.impl.ImageDaoImpl;

public class Test {

	public static void main(String[] args) {
		ImageDao dao = new ImageDaoImpl();
		//dao.insertImage();
        dao.selectImage(1);


	}

}
