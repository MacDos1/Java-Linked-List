public class CustomNode{
    private String value;
    private CustomNode NextNode;
    
    public CustomNode(){
        this.value = "";
        NextNode = null;
    }
    public CustomNode(String value){
        this.value = value;
        NextNode = null;
    }
    public CustomNode(String value, CustomNode nextNode){
        this.value = value;
        this.NextNode = nextNode;
    }
    public void setNextNode(CustomNode nextNode){
        this.NextNode = nextNode;
    }
    public CustomNode getNextNode(){
        return NextNode;
    }
    public String getValue(){
        return value;
    }
}