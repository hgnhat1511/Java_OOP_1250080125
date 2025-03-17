package lab5.bai3;

class square extends rectangle {
    public square() {
        super(0, 0);
    }

    public square(double side) {
        super(side, side);
    }

    public square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Hinh vuong [side=" + getSide() + ", color=" + color + ", filled=" + filled + "]";
    }
}