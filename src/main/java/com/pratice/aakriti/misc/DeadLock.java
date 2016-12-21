package com.pratice.aakriti.misc;

public class DeadLock {
	static class Friend{
		private final String name;
		
		public Friend(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
		
		public synchronized void bow(Friend bower){
			System.out.format("%s: %s" +" has bowed to me!%n" , this.name,bower.getName());
			bower.bowBack(this);
		}
		
		public synchronized void bowBack(Friend bower){
			System.out.format("%s: %s" +" has bowed to me!%n" , this.name,bower.getName());
		}
		
	}
	
	public static void main(String[] args) {
		final Friend aaha = new Friend("Aaha");
		final Friend anshul = new Friend("Anshul");
		
		new Thread(new Runnable(){
				public void run() {
				aaha.bow(anshul);
			}
		}).start();
		new Thread(new Runnable(){
			public void run(){
				anshul.bow(aaha);
			}
		}).start();
		
	}
}
