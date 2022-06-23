package stone.ast;

import stone.Token;

/**
 * 整形字面量
 * @author Ayuan
 */
public class NumberLiteral extends ASTLeaf {

    public NumberLiteral(Token t) {
        super(t);
    }

    public int value() {
        return token.getNumber();
    }
}
