package com.kang.sc;

public class FireBat extends AttackUnit {
	public FireBat() {
		max_hp = 50;
		hp = max_hp;
		movingSpeed = 1;
		powerOfAttack = 8;
	}

	@Override
	public String toString() {
		return "FireBat" + super.toString();
	}
}
