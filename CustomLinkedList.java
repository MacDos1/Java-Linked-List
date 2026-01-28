public class CustomLinkedList {
    private CustomNode head;
    private int size;
    public CustomLinkedList(){
        head = null;
        size = 0;
    }
    public void add(String value){
        CustomNode newNode = new CustomNode(value);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        if(head.getNextNode() == null){
            head.setNextNode(newNode);
            size++;
            return;
        }
    }
    public int getSize(){
        return size;
    }
}
