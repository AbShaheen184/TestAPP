package org.mozilla.javascript.ast;

import androidx.room.b0;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlinx.coroutines.future.a;
import org.mozilla.javascript.Node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class AstRoot extends ScriptNode {
    private SortedSet<Comment> comments;

    public AstRoot() {
        this.type = 150;
    }

    public void addComment(Comment comment) {
        assertNotNull(comment);
        if (this.comments == null) {
            this.comments = new TreeSet(new AstNode.PositionComparator());
        }
        this.comments.add(comment);
        comment.setParent(this);
    }

    public void checkParentLinks() {
        visit(new NodeVisitor() { // from class: org.mozilla.javascript.ast.AstRoot.1
            @Override // org.mozilla.javascript.ast.NodeVisitor
            public boolean visit(AstNode astNode) {
                if (astNode.getType() == 150 || astNode.getParent() != null) {
                    return true;
                }
                a.u(b0.e("No parent for node: ", String.valueOf(astNode), "\n", astNode.toSource(0)));
                return false;
            }
        });
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String debugPrint() {
        AstNode.DebugPrintVisitor debugPrintVisitor = new AstNode.DebugPrintVisitor(new StringBuilder(1000));
        visitAll(debugPrintVisitor);
        return debugPrintVisitor.toString();
    }

    public SortedSet<Comment> getComments() {
        return this.comments;
    }

    public void setComments(SortedSet<Comment> sortedSet) {
        if (sortedSet == null) {
            this.comments = null;
            return;
        }
        SortedSet<Comment> sortedSet2 = this.comments;
        if (sortedSet2 != null) {
            sortedSet2.clear();
        }
        Iterator<Comment> it = sortedSet.iterator();
        while (it.hasNext()) {
            addComment(it.next());
        }
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        for (Node node : this) {
            sb.append(((AstNode) node).toSource(i));
            if (node.getType() == 175) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public void visitAll(NodeVisitor nodeVisitor) {
        visit(nodeVisitor);
        visitComments(nodeVisitor);
    }

    public void visitComments(NodeVisitor nodeVisitor) {
        SortedSet<Comment> sortedSet = this.comments;
        if (sortedSet != null) {
            Iterator<Comment> it = sortedSet.iterator();
            while (it.hasNext()) {
                nodeVisitor.visit(it.next());
            }
        }
    }

    public AstRoot(int i) {
        super(i);
        this.type = 150;
    }
}
