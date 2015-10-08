package vv.tp3;

import net.sourceforge.pmd.lang.java.ast.ASTForStatement;
import net.sourceforge.pmd.lang.java.ast.ASTWhileStatement;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;

public class WhileConditionsMustMakeSense extends AbstractJavaRule {

    public Object visit(ASTWhileStatement node, Object data) {
        
        if (node.)) {
            addViolation(data, node);
        }
        return super.visit(node,data);
    }
}
