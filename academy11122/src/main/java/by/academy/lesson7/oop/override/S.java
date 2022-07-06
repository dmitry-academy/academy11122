package by.academy.lesson7.oop.override;

import by.academy.lesson7.HeavyBox;

public class S extends R {
	@Override
	HeavyBox getInstance() {
		return new HeavyBox();
	}
}