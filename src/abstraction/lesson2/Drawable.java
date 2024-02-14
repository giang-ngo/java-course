package abstraction.lesson2;

interface Drawable {
    void draw(); // vẽ

    void erase(); // tẩy xóa
}

interface Movable {
    void up(); // di chuyển lên theo trục y

    void down(); // di chuyển xuống theo trục y

    void left(); // di chuyển sang trái theo trục x

    void right(); // di chuyển sang phải theo trục x
}

interface ShapeDrawer {
    void moveIn(); // di chuyển vào

    void moveOut(); // di chuyển ra

    void moveDiagonally(); // di chuyển theo đường chéo
}

// giả định vẽ hình 2D, gốc tọa độ là góc trái trên màn hình
// tọa độ bắt đầu từ (x, y) = (0, 0)
class Shape implements Drawable, Movable {
    private int x; // tọa độ x
    private int y; // tọa độ y

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
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


    @Override
    public String toString() {
        return getClass().getName() + "[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }

    @Override
    public void draw() {
        up();
        up();
        left();
        right();
        down();
        right();
    }

    @Override
    public void erase() {
        System.out.println("Xóa các nét đã vẽ");
    }

    @Override
    public void up() {
        y++;
    }

    @Override
    public void down() {
        y--;
    }

    @Override
    public void left() {
        x--;
    }

    @Override
    public void right() {
        x++;
    }
}