package stone;

import static stone.Parser.rule;

import java.util.HashSet;

import stone.ast.*;

/**
 * 语法分析器
 *
 * @author Ayuan
 */
public class BasicParser {

    HashSet<String> reserved = new HashSet<>();
    Parser.Operators operators = new Parser.Operators();
    Parser expr0 = Parser.rule();
    Parser primary = Parser.rule(PrimaryExpr.class)
            .or(rule().sep("(").ast(expr0).sep(")"), rule().number(NumberLiteral.class),
                    rule().identifier(Name.class, reserved),
                    rule().string(StringLiteral.class));

    Parser factor = rule().or(rule(NegativeExpr.class).sep("-").ast(primary), primary);

    Parser expr = expr0.expression(BinaryExpr.class, factor, operators);

    Parser statement0 = rule();

    Parser block = rule(BlockStmnt.class)
            .sep("{").option(statement0)
            .repeat(rule().sep(";", Token.EOL)).option(statement0)
            .sep("}");



}
