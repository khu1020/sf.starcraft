package com.kang.sc;

public class AttackUnit extends Unit {
	int powerOfAttack;

	public void attack(Unit unit) {
		unit.hp -= this.powerOfAttack;
	}

	@Override
	public String toString() {
		return String.format("poa: %d,  %s", powerOfAttack, super.toString());
	}
}
