package com.kang.sc;

public class Marine extends AttackUnit {
	public Marine() {
		max_hp = 40;
		hp = max_hp;
		movingSpeed = 1;
		powerOfAttack = 6;
	}

	@Override
	public String toString() {
		return "Marine" + super.toString();
	}
}
