public NodeList(int item, NodeList next) {
    this.item = item;
    this.next = next;
}

public static NodeList merge(NodeList l1, NodeList l2) {

    NodeList new_list = new NodeList(l1.item, l1.next);
    NodeList new_list2 = new NodeList(l2.item, l2.next);

    while (true) {
        if (new_list.next == null) {
            if (new_list2.next == null) {
                return new_list;
            }
            else {
                new_list.next = new NodeList(new_list2.next.item, new_list2.next.next);
                new_list2 = new_list2.next;
            }

        }
        else {
            new_list.next = new NodeList(new_list.next.item, new_list.next.next);
            new_list = new_list.next;
        }
    }
}