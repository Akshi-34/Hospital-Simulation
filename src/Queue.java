public class Queue {
    private class QueueRecord {
        public Alert alert;
        public QueueRecord next;
    }
    private QueueRecord head;
    private QueueRecord tail;
    public Queue() {
        head = null;
        tail = null;
    }
    public void enqueue(Alert alert) {
        QueueRecord newRecord=new QueueRecord();
        newRecord.alert=alert;
        newRecord.next=null;
        if (tail==null) {
            head=newRecord;
            tail=newRecord;
        } else {
            tail.next=newRecord;
            tail=newRecord;
        }
    }
    public Alert dequeue() {
        if (head==null) return null;
        Alert result=head.alert;
        head=head.next;
        if (head==null) tail=null;
        return result;
    }
    public int count() {
        int count=0;
        QueueRecord temperature=head;
        while (temperature!=null) {
            count++;
            temperature=temperature.next;
        }
        return count;
    }
}