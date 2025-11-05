package com.raj.sealed;

public final class SealedTest implements SealedInterface {
	public static void main(String[] args) {
       System.out.println("Implementing Sealed Method");
	}
	@Override
	public void show() {
		new SealedTest().show();
		
	}

}
