package com.app;

public class Manager {

	SmartWorker sw;
	LazyWorker lw;
	public Manager(SmartWorker sw, LazyWorker lw) {
		super();
		this.sw = sw;
		this.lw = lw;
	}
	
	public void ManageWork() {
		sw.work();
		lw.work();
	}
}
