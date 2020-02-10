public class ListNode {
    public Player player;
    public ListNode next;

    public ListNode(Player player, ListNode next) {
        this.player = player;
        this.next = next;
    }
    public ListNode(Player player){
        this.player = player;
    }
}
