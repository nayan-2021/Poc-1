package com.neosoft;

import java.io.IOException;

//Step 1- Design the interface where I have taken various methods to process further
public interface Housie {
	public abstract void inputData() throws IOException;
	public abstract void init();
	public abstract void randomNumberGeneration();

	
}
