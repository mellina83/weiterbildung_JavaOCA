package enums;

import javax.swing.JFrame;

enum Color {
	RED, GREEN, YELLOW, BLUE
}

public class Demo02Enums {

	/**
	 * 
	 * VGA 640 x 480
	 * 
	 * SVGA 800 x 600
	 * 
	 * HD 1920 x 1080
	 *
	 * _4K 3840 x 2160
	 */
	enum Resolution {
		VGA(640, 480), SVGA(800, 600), WSVGA(1024, 786), HD(1920, 1080), _4K(3840, 2160);

		int width;
		int height;

		/*
		 * Illegal modifier for the enum constructor; only private is permitted.
		 */
		Resolution(int width, int height) {
			this.width = width;
			this.height = height;
		}

		public boolean isHighDef() {
			return this.getWidth()>=1920;
		}
		
		public int getWidth() {
			return width;
		}

		public int getHeight() {
			return height;
		}
	}

	public static void main(String[] args) {
		demo02();
	}

	private static void demo02() {
		Resolution res = Resolution._4K;

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(res.getWidth(), res.getHeight());
		frame.setVisible(true);
		System.out.println("isHighDef " + res.isHighDef());
	}

	public static void demo01() {
		Day d01 = Day.MONDAY;
		Day d02 = Day.SUNDAY;

		System.out.println(d01);
		System.out.println(d02);

		Day[] days = Day.values();
		for (Day inner : days) {
			System.out.println(inner);
		}

		Day d03 = Day.MONDAY;

		switch (d03) {
			case MONDAY: {
				break;
			}
			case TUESDAY: {
				break;
			}
			case WEDNESDAY: {
				break;
			}
			case THURSDAY: {
				break;
			}
			case FRIDAY: {
				break;
			}
			case SATURDAY: {
				break;
			}
			case SUNDAY: {
				break;
			}
			default:
				break;
		}
	}
}
