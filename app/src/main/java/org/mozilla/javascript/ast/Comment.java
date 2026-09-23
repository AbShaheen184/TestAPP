package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class Comment extends AstNode {
    private Token.CommentType commentType;
    private String value;

    public Comment(int i, int i2, Token.CommentType commentType, String str) {
        super(i, i2);
        this.type = Token.COMMENT;
        this.commentType = commentType;
        this.value = str;
    }

    public Token.CommentType getCommentType() {
        return this.commentType;
    }

    public String getValue() {
        return this.value;
    }

    public void setCommentType(Token.CommentType commentType) {
        this.commentType = commentType;
    }

    public void setValue(String str) {
        this.value = str;
        setLength(str.length());
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder(getLength() + 10);
        sb.append(makeIndent(i));
        sb.append(this.value);
        if (Token.CommentType.BLOCK_COMMENT == getCommentType()) {
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}
