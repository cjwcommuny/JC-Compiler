package ast.node.structrue;

import ast.node.Node;
import symbol.Scope;

public interface HasScope {
    Scope getThisScope();
}
