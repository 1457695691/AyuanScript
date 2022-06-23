package stone.ast;

import java.util.Iterator;

/**
 * @author ayuan
 */
public abstract class ASTree implements Iterable<ASTree> {

    /**
     * @param i 节点
     * @return 第i个节点
     */
    public abstract ASTree child(int i);

    /**
     * @return 子节点的个数（没有自子节点返回0）
     */
    public abstract int numChildren();

    /**
     * @return 一个用于遍历子节点的iterator
     */
    public abstract Iterator<ASTree> children();

    /**
     * @return 用于表示抽象语法树节点在程序内所处位置的字符串
     */
    public abstract String location();

    @Override
    public Iterator<ASTree> iterator() {
        return children();
    }
}
