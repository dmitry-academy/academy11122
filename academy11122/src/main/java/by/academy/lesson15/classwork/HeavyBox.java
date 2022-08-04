package by.academy.lesson15.classwork;

public class HeavyBox implements Comparable<HeavyBox> {

	private int weight;
	private int width;
	private int height;
	private int depth;

	public HeavyBox(int w, int h, int d, int m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}

	@Override
	public int compareTo(HeavyBox hb) {
		return -(weight - hb.weight);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeavyBox [weight=");
		builder.append(weight);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}

}