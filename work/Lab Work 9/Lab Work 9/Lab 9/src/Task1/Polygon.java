package Task1;

public class Polygon extends Shape {
		private int x1,y1,x2,y2;
		
		public Polygon(int x1, int y1, int x2, int y2, DrawingService drawingService) {
			super(drawingService);
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

		@Override
		public void draw() {
			drawingService.drawLine(x1, y1, x2, y2);
		}

	}
