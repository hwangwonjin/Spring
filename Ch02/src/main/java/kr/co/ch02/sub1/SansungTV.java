package kr.co.ch02.sub1;

import org.springframework.beans.factory.annotation.Autowired;

public class SansungTV {
	
	
	@Autowired
	private Speaker spk;

	public void powerOn() {
		System.out.println("SansungTV powerOn...");
	}
	
	public void powerOff() {
		System.out.println("SansungTV powerOff...");
	}
	
	public void soundUp() {
		//System.out.println("SansungTV soundUp...");
		spk.soundUp();
	}
	
	public void soundDown() {
		//System.out.println("SansungTV soundDown...");
		spk.soundDown();
	}
	
}
