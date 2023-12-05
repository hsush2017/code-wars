package hsush2017.code_wars.kyu5;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/52a89c2ea8ddc5547a000863
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
