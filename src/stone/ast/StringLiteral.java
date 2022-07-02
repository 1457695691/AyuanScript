package stone.ast;

import stone.Token;

/**
 * @author Ayuan
 * @Description:
 * @date 2022/7/3 01:13
 */
public class StringLiteral extends ASTLeaf {

    public StringLiteral(Token t) {
        super(t);
    }

    public String value() {
        return token.getText();
    }
}
