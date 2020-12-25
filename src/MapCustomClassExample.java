import model.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapCustomClassExample {
    public static void main(String[] args) {
        List<Event> eventlist= Arrays.asList(
                new Event(1,"orderready","walkIn", "8499"),
                new Event(2,"ordercancelled","GIL", "1143"),
                new Event(3,"orderpicked","appointment", "9810"),
                new Event(4,"orderrevoked","appointment", "1111")
        );
        //I want to just get the List<String> where orderpicked

        //From the List filter only the orderready event
        List<Event> eventwitheventname= eventlist.stream().filter(event->"orderready".equals(event.getEventName())).collect(Collectors.toList());
        System.out.println(eventwitheventname.toString());

        //Now i only want to pass the storeId and eventType in the response for eventId 2

         List<String> filteredMapString= eventlist.
                 stream().
                 //filter(event->"ordercancelled".equals(event.getEventName())).
                 map(Event::getEventName).
                 collect(Collectors.toList());

        System.out.println(filteredMapString);

        //Without JavA 8 Map
        List<String> filteredMapwithClassicApproach= new ArrayList<>();
        for(Event event:eventlist){
            filteredMapwithClassicApproach.add(event.getEventName());
        }
        System.out.println(filteredMapwithClassicApproach);


    }





}

