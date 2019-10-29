package com.kang.sc;

public class Main {
	public static void main(String[] args) {
		Marine mi = new Marine();
		FireBat fb = new FireBat();
		Medic md = new Medic();
		SiegTank sieg = new SiegTank();

		mi.attack(fb);
		mi.attack(fb);
		mi.attack(fb);
		System.out.println(fb);

		Coordinates lo1 = new Coordinates(10, 50);
		fb.moving(lo1);

		md.heal(fb);
		System.out.println(fb);
		
		System.out.println(sieg);
		sieg.changeMode();
		System.out.println(sieg);
		sieg.changeMode();
		System.out.println(sieg);
	}
}
