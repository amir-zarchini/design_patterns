import javax.print.attribute.Size2DSyntax;
import java.awt.*;

public class Tree {

    public final static int SIZE = 1;

    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        MemoryReport.calculate(SIZE);
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
