package com.kang.sc;

public class SiegTank extends AttackUnit{
	boolean siegMode;
	
	public SiegTank () {
		max_hp = 150;
		hp = max_hp;
		powerOfAttack = 30;
		movingSpeed = 1;
	}
	
	void changeMode() {
		if(siegMode == false) {
			siegMode = true;
		} else {
			siegMode = false;
		}
	}
	
	@Override
	public String toString() {
		return "siegeMode: " + siegMode;
	}

}
