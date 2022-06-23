package stone.ast;

import stone.Token;

/**
 * 变量名
 * @author ayuan
 */
public class Name extends ASTLeaf {

    public Name(Token t) {
        super(t);
    }

    public String name() {
        return token.getText();
    }
}
