package linkedlists;

public class ListNode<Item> {
    private Item data;
    private ListNode next;

    public ListNode(Item data) {
        this.data = data;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
