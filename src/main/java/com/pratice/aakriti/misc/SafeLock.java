package com.pratice.aakriti.misc;

//import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class SafeLock {
	static class Friend{
		private final String name;
		private final Lock lock = new ReentrantLock();
		
		public Friend(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
		
		public boolean impendingBow(Friend bower){
			Boolean myLock = false;
			Boolean yourLock = false;
			
			try{
				myLock = lock.tryLock();
				yourLock = bower.lock.tryLock();
			}finally{
				if(! (myLock && yourLock)){
					if(myLock){
						lock.unlock();
					}
					if(yourLock){
						bower.lock.unlock();
					}
				}
			}
			return myLock && yourLock;
		}
		
		public synchronized void bow(Friend bower){
			if(impendingBow(bower)){
				try{
					System.out.format("%s: %s" +" has bowed to me!%n" , this.name,bower.getName());
					bower.bowBack(this);
				}finally{
					lock.unlock();
					bower.lock.unlock();
				}
			}else{
				System.out.format("%s: %s started"
	                    + " to bow to me, but saw that"
	                    + " I was already bowing to"
	                    + " him.%n",
	                    this.name, bower.getName());
			}
		}
		
		public synchronized void bowBack(Friend bower){
			System.out.format("%s: %s" +" has bowed to me!%n" , this.name,bower.getName());
		}
		
	}
	
	
	static class BowLoop implements Runnable{
		public Friend bower;
		public Friend bowee;
		
		public BowLoop(Friend bower, Friend bowee){
			this.bowee = bowee;
			this.bower = bower;
		}
		public void run(){
			//Random random = new Random();
			for(int i=0;i<20;i++){
				try{
					Thread.sleep(i);
				}catch(InterruptedException e){}
				bowee.bow(bower);
			}
		}
	}
	
	
	public static void main(String[] args) {
		final Friend aaha = new Friend("Aaha");
		final Friend anshul = new Friend("Anshul");
		
		new Thread(new BowLoop(aaha,anshul)).start();
		new Thread(new BowLoop(anshul,aaha)).start();
		
	}
	
}
