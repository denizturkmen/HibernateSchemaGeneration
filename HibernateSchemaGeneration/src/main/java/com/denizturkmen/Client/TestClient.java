package com.denizturkmen.Client;

import com.denizturkmen.Util.HibernateUtil;

public class TestClient {
	public static void main(String[] args) {

		try {
			HibernateUtil.getSessionFactory();
			System.out.println("Session Factory is created..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}