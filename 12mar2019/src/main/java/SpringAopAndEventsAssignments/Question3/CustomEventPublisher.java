package SpringAopAndEventsAssignments.Question3;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class CustomEventPublisher implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;

    public void display(){
        System.out.println("display");
        CustomEvent customEvent=new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
}
