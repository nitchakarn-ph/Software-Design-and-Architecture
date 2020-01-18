public class Circle extends Shape {

  protected int r;

  public Circle(int x, int y, int r) {
    super(x, y);
    this.r = r;
  }

  @Override
  public void draw() {
     draw.drawCircle(x, y, r);
  }

}
