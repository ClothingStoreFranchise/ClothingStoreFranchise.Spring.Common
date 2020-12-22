package clothingstorefranchise.spring.common.event;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class EventBusSubscriptions {
	
	private Map<String, Class<?>> eventSubscriptions;
	
	private EventBusSubscriptions() {
		eventSubscriptions = new HashMap<String, Class<?>>();
	}
	
	public <TEvent extends IntegrationEvent> void addSubscription(Class<TEvent> typeEvent) {
		
		eventSubscriptions.put(typeEvent.getSimpleName(), typeEvent);
	}

	public Class<?> getEventType(String eventName){
		return eventSubscriptions.get(eventName);
	}
}
