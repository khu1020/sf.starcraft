package com.kang.sc;

public class SiegTank extends AttackUnit{
	boolean siegMode;
	String onof = "off";
	int siegPowerOfAttack = 70;
	
	public SiegTank () {
		max_hp = 150;
		hp = max_hp;
		powerOfAttack = 30;
		movingSpeed = 1;
	}
	
	void changeMode() {
		if(siegMode == false) {
			siegMode = true;
			powerOfAttack = 70;
			onof = "on";
		} else {
			siegMode = false;
			powerOfAttack = 30;
			onof = "off";
		}
		//siegMode = !siegMode;
	}
	
	@Override
	public String toString() {
		return "siegeMode -> " + super.toString() + " 시즈모드: " + onof;
	}
}
