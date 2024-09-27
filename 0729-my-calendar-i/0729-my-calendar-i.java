class MyCalendar {
    ArrayList<Event> events;
    int curr_length;
    public MyCalendar() {
        events = new ArrayList<Event>();
        curr_length = 0;
    }
    
    public boolean book(int start, int end) {
        Event temp;
        for(int i = 0; i < curr_length; i++){
            temp = events.get(i);
            if(start <= temp.end && start >= temp.start){
                return false;
            }
            else if(end - 1 >= temp.start && end - 1 <= temp.end){
                return false;
            }
            else if(start <= temp.start && end - 1 >= temp.end){
                return false;
            }
        }
        events.add(new Event(start, end - 1));
        curr_length += 1;
        return true;
    }
}

class Event {
    int start;
    int end;

    public Event(int start, int end){
        this.start = start;
        this.end = end;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */