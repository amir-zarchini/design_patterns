import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static Map<String, TreeType> treeTypeCache = new HashMap<>();

    public static TreeType getTreeType(String name, Color color) {
        TreeType treeType = treeTypeCache.get(name);
        if(treeType == null) {
            treeType = new TreeType(name, color);
            treeTypeCache.put(name, treeType);
        }
        return treeType;
    }
}
