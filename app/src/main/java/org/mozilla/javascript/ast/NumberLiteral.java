package org.mozilla.javascript.ast;

import androidx.constraintlayout.core.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class NumberLiteral extends AstNode {
    private double number;
    private String value;

    public NumberLiteral(int i, String str) {
        super(i);
        this.type = 45;
        setValue(str);
        setLength(str.length());
    }

    public double getNumber() {
        return this.number;
    }

    public String getValue() {
        return this.value;
    }

    public void setNumber(double d) {
        this.number = d;
    }

    public void setValue(String str) {
        assertNotNull(str);
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        String strMakeIndent = makeIndent(i);
        String str = this.value;
        if (str == null) {
            str = "<null>";
        }
        return g.c(strMakeIndent, str);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public NumberLiteral(int i) {
        super(i);
        this.type = 45;
    }

    public NumberLiteral(int i, int i2) {
        super(i, i2);
        this.type = 45;
    }

    public NumberLiteral() {
        this.type = 45;
    }

    public NumberLiteral(int i, String str, double d) {
        this(i, str);
        setDouble(d);
    }

    public NumberLiteral(double d) {
        this.type = 45;
        setDouble(d);
        setValue(Double.toString(d));
    }
}
