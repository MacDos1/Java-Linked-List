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

        CustomNode current = head;
        while(current.getNextNode() != null){
            current = current.getNextNode();
        }
        current.setNextNode(newNode);
        size++;
    }
    public String get(int index){
        if(index < 0 || index >= size){
            return null;
        }
        if(index == 0){
            return head.getValue();
        }
        else if(index == 1){
            return head.getNextNode().getValue();
        }
        
        CustomNode current = head;
        for(int i = 0; i < index; i++){
            current = current.getNextNode();
        }
        return current.getValue();
    }
    public int getSize(){
        return size;
    }
}
