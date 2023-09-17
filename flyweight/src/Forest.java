import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color) {
        TreeType treeType = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics g) {
        for (Tree tree : trees) {
            tree.draw(g);
        }
    }
}
