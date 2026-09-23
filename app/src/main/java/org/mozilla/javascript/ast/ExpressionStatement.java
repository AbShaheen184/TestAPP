package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ExpressionStatement extends AstNode {
    private AstNode expr;

    public ExpressionStatement(AstNode astNode) {
        this(astNode.getPosition(), astNode.getLength(), astNode);
    }

    public AstNode getExpression() {
        return this.expr;
    }

    @Override // org.mozilla.javascript.ast.AstNode, org.mozilla.javascript.Node
    public boolean hasSideEffects() {
        return this.type == 148 || this.expr.hasSideEffects();
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expr = astNode;
        astNode.setParent(this);
        setLineColumnNumber(astNode.getLineno(), this.expr.getColumn());
    }

    public void setHasResult() {
        this.type = Token.EXPR_RESULT;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.expr.toSource(i));
        sb.append(";");
        if (getInlineComment() != null) {
            sb.append(getInlineComment().toSource(i));
        }
        sb.append("\n");
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expr.visit(nodeVisitor);
        }
    }

    public ExpressionStatement(AstNode astNode, boolean z) {
        this(astNode);
        if (z) {
            setHasResult();
        }
    }

    public ExpressionStatement() {
        this.type = Token.EXPR_VOID;
    }

    public ExpressionStatement(int i, int i2) {
        super(i, i2);
        this.type = Token.EXPR_VOID;
    }

    public ExpressionStatement(int i, int i2, AstNode astNode) {
        super(i, i2);
        this.type = Token.EXPR_VOID;
        setExpression(astNode);
    }
}
