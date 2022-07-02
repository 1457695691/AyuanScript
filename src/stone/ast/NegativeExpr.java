package stone.ast;

import stone.ast.ASTList;
import stone.ast.ASTree;

import java.util.List;

/**
 * @author Ayuan
 * @description: TODO
 * @date 2022/7/3 01:30
 */
public class NegativeExpr extends ASTList {
    public NegativeExpr(List<ASTree> list) {
        super(list);
    }

    public ASTree operand() {
        return child(0);
    }


    @Override
    public String toString() {
        return "-" + operand();
    }
}
