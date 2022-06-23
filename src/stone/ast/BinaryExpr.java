package stone.ast;

import java.util.List;

/**
 * 双目运算表达式->通过左值和右值计算新值的操作
 * @author ayuan
 */
public class BinaryExpr extends ASTList {
    public BinaryExpr(List<ASTree> list) {
        super(list);
    }

    public ASTree left() {
        return child(0);
    }

    public String operator() {
        return ((ASTLeaf) child(1)).token().getText();
    }

    public ASTree right() {
        return child(2);
    }
}
