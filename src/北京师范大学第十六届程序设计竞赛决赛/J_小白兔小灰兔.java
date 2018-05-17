package 北京师范大学第十六届程序设计竞赛决赛;

import java.text.DecimalFormat;

import java.util.Scanner;

public class J_小白兔小灰兔 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			// List<Point> list = new ArrayList<Point>();
			Point[] points = new Point[n];
			int minX = 10, minY = 10, maxX = -10, maxY = -10;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				Point p = new Point(x, y);
				points[i] = p;
				if (x > maxX) {
					maxX = x;
				}
				if (x < minX) {
					minX = x;
				}
				if (y > maxY) {
					maxY = y;
				}
				if (y < minY) {
					minY = y;
				}
			}

			// System.out.println(minX+" "+maxX+" "+minY+" "+maxY);

			int x = sc.nextInt();
			int y = sc.nextInt();
			Point sun = new Point(x, y);

			int loc = 0;

			if (x <= minX || x >= maxX) {
				loc = 1;
			} else if ((x > minX && x < maxX) && (y >= maxY || y <= minY)) {
				loc = 2;
			} else if ((x > minX && x < maxX) && (y > minY || y < maxY)) {
				int disTop = Math.abs(maxY - y);
				int disBot = Math.abs(minY - y);
				int disLft = Math.abs(minX - x);
				int disRgt = Math.abs(maxX - x);
				if (disLft <= disRgt) {
					if (disTop <= disBot) {
						loc = 3;
					} else {
						loc = 4;
					}
				} else {
					if (disTop < disBot) {
						loc = 5;
					} else {
						loc = 6;
					}
				}
			}

			Point p1 = null, p2 = null;
			int minIndex = 0;
			int maxIndex = 0;
			double minK = getK(points[0], sun);
			double maxK = minK;
			// System.out.println("sun:"+sun);
			// System.out.println("loc:"+loc);
			switch (loc) {
			case 1:
				for (int i = 0; i < n; i++) {
					double k = getK(points[i], sun);
					// System.out.println("k="+k);
					if (k > maxK) {
						maxK = k;
						maxIndex = i;
					} else if (k < minK) {
						minK = k;
						minIndex = i;
					}
				}
				p1 = points[minIndex];
				p2 = points[maxIndex];
				break;
			case 2:
				minK = Double.POSITIVE_INFINITY;
				maxK = Double.NEGATIVE_INFINITY;
				for (int i = 0; i < n; i++) {
					double k = getK(points[i], sun);
					// System.out.println("k="+k);
					if (k > 0 && k < minK) {
						minK = k;
						minIndex = i;
					} else if (k < 0 && k > maxK) {
						maxK = k;
						maxIndex = i;
					}
				}
				p1 = points[minIndex];
				p2 = points[maxIndex];

				break;

			case 3:
				minK = Double.POSITIVE_INFINITY;
				maxK = 0;
				for (int i = 0; i < n; i++) {
					double k = getK(points[i], sun);
					// System.out.println("k="+k);
					if (k > 0 && points[i].y > sun.y && k > maxK) {
						maxK = k;
						maxIndex = i;
					} else if (k > 0 && points[i].y < sun.y && k < minK) {
						minK = k;
						minIndex = i;
					}
				}
				p1 = points[minIndex];
				p2 = points[maxIndex];

				break;

			case 4:
				minK = 0;
				maxK = Double.NEGATIVE_INFINITY;
				for (int i = 0; i < n; i++) {
					double k = getK(points[i], sun);
					// System.out.println("k="+k);
					if (k < 0 && points[i].y >= sun.y && k > maxK) {
						maxK = k;
						maxIndex = i;
					} else if (k < 0 && points[i].y <= sun.y && k < minK) {
						minK = k;
						minIndex = i;
					}
				}
				p1 = points[minIndex];
				p2 = points[maxIndex];

				break;
			case 5:
				minK = 0;
				maxK = Double.NEGATIVE_INFINITY;
				for (int i = 0; i < n; i++) {
					double k = getK(points[i], sun);
					// System.out.println("k="+k);
					if (k < 0 && points[i].y > sun.y && k < minK) {
						minK = k;
						minIndex = i;
					} else if (k < 0 && points[i].y < sun.y && k > maxK) {
						maxK = k;
						maxIndex = i;
					}
				}
				p1 = points[minIndex];
				p2 = points[maxIndex];

				break;

			case 6:
				minK = Double.POSITIVE_INFINITY;
				maxK = 0;
				for (int i = 0; i < n; i++) {
					double k = getK(points[i], sun);
					// System.out.println("k="+k);
					if (k > 0 && points[i].y > sun.y && k < minK) {
						minK = k;
						minIndex = i;
					} else if (k > 0 && points[i].y < sun.y && k > maxK) {
						maxK = k;
						maxIndex = i;
					}
				}
				p1 = points[minIndex];
				p2 = points[maxIndex];

				break;
			}

			// System.out.println("p1:"+p1);
			// System.out.println("p3:"+p2);

			// System.out.println(minIndex+" "+maxIndex);

			int _min = minIndex < maxIndex ? minIndex : maxIndex;
			int _max = minIndex > maxIndex ? minIndex : maxIndex;
			// System.out.println(_min+" "+_max);

			Point _p1 = null;
			Point _p2 = null;

			// System.out.println("_min:"+_min);
			// System.out.println("points[0]:"+points[0]);
			_p1 = points[_min];

			double sumDis = 0;
			for (int i = _min; i <= _max - 1; i++) {
				sumDis += dis(points[i], points[i + 1]);

			}
			// System.out.println("---");
			double _sumDis = 0;
			for (int i = 0; i < points.length - 1; i++) {
				_sumDis += dis(points[i], points[i + 1]);
				if (!(i >= _min && i <= _max) && _p2 == null) {
					_p2 = points[i];
				}
			}
			_sumDis += dis(points[0], points[points.length - 1]);
			_sumDis -= sumDis;

			// System.out.println(_p1+" "+_p2);
			double res;
			if (_p2 == null) {
				res = sumDis > _sumDis ? sumDis : _sumDis;
			} else {
				if (dis(_p1, sun) < dis(_p2, sun)) {
					res = sumDis;
				} else {
					res = _sumDis;
				}
			}

			DecimalFormat df = new DecimalFormat("#.000000000000");
			System.out.println(df.format(res));

		}
	}

	public static double dis(Point p1, Point p2) {
		// System.out.println("dis:"+Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) +
		// (p1.y - p2.y)*(p1.y - p2.y)));
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
				* (p1.y - p2.y));
	}

	public static double getK(Point p1, Point p2) {
		return (p2.y - p1.y) * 1.0 / (p2.x - p1.x);
	}

	public static boolean equal(double a, double b) {
		if (Math.abs(a - b) < 0.000000001) {
			return true;
		}
		return false;
	}
}

class Point {
	int x;
	int y;

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}