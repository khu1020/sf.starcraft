package com.kang.sc;

public class Medic extends Unit {
	public Medic() {
		max_hp = 60;
		hp = max_hp;
		movingSpeed = 1;
	}

	public void heal(Unit unit) {
		while (true) {
			if (unit.hp < unit.max_hp) {
				unit.hp++;
			} else if (unit.hp == unit.max_hp) {
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Medic: " + super.toString();
	}
}
