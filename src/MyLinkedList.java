public class MyLinkedList {
    private ListNode front;

    public MyLinkedList() {
        this.front = null;
    }
    public void add(Player player){
        if(front == null){
            front = new ListNode(player);
        } else {
            ListNode current = front;
            while(current.next != null){
                current = current.next;
            }
            current.next = new ListNode(player);
        }
    }
    public void addSortedAge(Player player1){
        if (front == null || front.player.getAge() >= player1.getAge()){
            front = new ListNode(player1, front);
        } else {
            ListNode current = front;
            while (current.next != null && current.player.getAge() < player1.getAge()){
                current = current.next;
            }
            current.next = new ListNode(player1, current.next);
        }
    }
    public void addSortedTeam(Player player1){
        if (front == null || front.player.getTeam() >= player1.getTeam()){
            front = new ListNode(player1, front);
        } else {
            ListNode current = front;
            while (current.next != null && current.player.getTeam() < player1.getTeam()){
                current = current.next;
            }
            current.next = new ListNode(player1, current.next);
        }
    }
}
