package org.mozilla.javascript.ast;

import kotlinx.coroutines.future.a;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class XmlMemberGet extends InfixExpression {
    public XmlMemberGet() {
        this.type = Token.DOTDOT;
    }

    private String dotsToString() {
        int type = getType();
        if (type == 121) {
            return ".";
        }
        if (type == 157) {
            return "..";
        }
        a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(getType(), "Invalid type of XmlMemberGet: "));
        return null;
    }

    public XmlRef getMemberRef() {
        return (XmlRef) getRight();
    }

    public AstNode getTarget() {
        return getLeft();
    }

    public void setProperty(XmlRef xmlRef) {
        setRight(xmlRef);
    }

    public void setTarget(AstNode astNode) {
        setLeft(astNode);
    }

    @Override // org.mozilla.javascript.ast.InfixExpression, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + getLeft().toSource(0) + dotsToString() + getRight().toSource(0);
    }

    public XmlMemberGet(int i) {
        super(i);
        this.type = Token.DOTDOT;
    }

    public XmlMemberGet(int i, int i2) {
        super(i, i2);
        this.type = Token.DOTDOT;
    }

    public XmlMemberGet(int i, int i2, AstNode astNode, XmlRef xmlRef) {
        super(i, i2, astNode, xmlRef);
        this.type = Token.DOTDOT;
    }

    public XmlMemberGet(AstNode astNode, XmlRef xmlRef) {
        super(astNode, xmlRef);
        this.type = Token.DOTDOT;
    }

    public XmlMemberGet(AstNode astNode, XmlRef xmlRef, int i) {
        super(Token.DOTDOT, astNode, xmlRef, i);
        this.type = Token.DOTDOT;
    }
}
