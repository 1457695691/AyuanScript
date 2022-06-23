package stone;

/**
 * 支持标识符、整形字面量、字符串字面量
 * @author Ayuan
 */
public abstract class Token {

    /**
     * end of file 表示程序结束
     */
    public static final Token EOF = new Token(-1) {
    };

    /**
     * end of line 表示换行符
     */
    public static final String EOL = "\\n";

    /**
     * 行数
     */
    private int lineNumber;

    protected Token(int line) {
        lineNumber = line;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public boolean isIdentifier() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public int getNumber() {
        throw new AyuanException("not number token");
    }

    public String getText() {
        return "";
    }
}
