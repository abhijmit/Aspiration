package main.java;

public interface IntA {

	default Integer Add(Integer X, Integer Y) {
		return X + Y;
	}

	static Integer Diff(Integer X, Integer Y) {
		return X - Y;
	}

}