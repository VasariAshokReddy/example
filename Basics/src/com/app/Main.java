package com.app;

public class Main {

	public static void main(String[] args) {

		SmartWorker sw = new SmartWorker();
		LazyWorker lw = new LazyWorker();
		Manager mn = new Manager(sw, lw);
		mn.ManageWork();
	}

}
