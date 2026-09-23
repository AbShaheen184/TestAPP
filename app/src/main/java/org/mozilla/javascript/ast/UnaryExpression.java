package org.mozilla.javascript.ast;

import kotlinx.coroutines.future.a;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class UnaryExpression extends AstNode {
    private AstNode operand;

    public UnaryExpression(int i, int i2, AstNode astNode) {
        assertNotNull(astNode);
        setBounds(astNode.getPosition(), astNode.getLength() + astNode.getPosition());
        setOperator(i);
        setOperand(astNode);
    }

    public AstNode getOperand() {
        return this.operand;
    }

    public int getOperator() {
        return this.type;
    }

    public void setOperand(AstNode astNode) {
        assertNotNull(astNode);
        this.operand = astNode;
        astNode.setParent(this);
    }

    public void setOperator(int i) {
        if (Token.isValidToken(i)) {
            setType(i);
        } else {
            a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Invalid token: "));
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        int type = getType();
        sb.append(AstNode.operatorToString(type));
        if (type == 32 || type == 31 || type == 139) {
            sb.append(" ");
        }
        sb.append(this.operand.toSource());
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.operand.visit(nodeVisitor);
        }
    }

    public UnaryExpression(int i) {
        super(i);
    }

    public UnaryExpression(int i, int i2) {
        super(i, i2);
    }

    public UnaryExpression() {
    }
}
