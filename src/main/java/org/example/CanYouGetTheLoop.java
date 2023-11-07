package org.example;

import java.util.ArrayList;
import java.util.List;

public class CanYouGetTheLoop {
    interface Node {
        Node getNext();
    }

    public int loopSize(Node node) {
        List<Node> list = new ArrayList<>();

        while (!list.contains(node)) {
            list.add(node);
            node = node.getNext();
        }

        return list.size() - list.indexOf(node);
    }
}
