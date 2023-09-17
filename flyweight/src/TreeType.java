import java.awt.*;

public class TreeType {

    public static final int SIZE = 3;

    private String name;
    private Color color;

    public TreeType(String name, Color color) {
        this.name = name;
        this.color = color;
        MemoryReport.calculate(SIZE);
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillRect(x - 5, y - 10, 10, 10);
    }
}
