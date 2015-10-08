package vv.tp3;

import net.sourceforge.pmd.lang.java.ast.ASTForStatement;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;

public class ForLoopsMustBeNotImbriqued extends AbstractJavaRule {

    public Object visit(ASTForStatement node, Object data) {
        
        if (hasAForChildren(node)) {
            addViolation(data, node);
        }
        return super.visit(node,data);
    }
    
    private boolean hasAForChildren(ASTForStatement node)
    {
    	for(int i = 0; i<node.jjtGetNumChildren(); i++)
    	{
    		if(node.jjtGetChild(i) instanceof ASTForStatement)
    		{
    			return true;
    		}
    	}
    	    	
    	return false;
    }
}
