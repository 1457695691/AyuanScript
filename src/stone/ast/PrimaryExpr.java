package stone.ast;

import java.util.List;

/**
* @author Ayuan
* @date 2022/6/28 23:24
*/
public class PrimaryExpr extends ASTList {
    public PrimaryExpr(List<ASTree> list) {
        super(list);
    }

    public static ASTree create(List<ASTree> c){
        return c.size() ==1 ? c.get(0):new PrimaryExpr(c);
    }
}
