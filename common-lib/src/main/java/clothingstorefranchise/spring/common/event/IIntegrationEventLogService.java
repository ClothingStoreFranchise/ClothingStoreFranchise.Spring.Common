package clothingstorefranchise.spring.common.event;

import java.util.UUID;

public interface IIntegrationEventLogService {
	void saveEvent(IntegrationEvent event);
	
	void putEventAsPublished(UUID eventId);
	
	void putEventAsNoPublished(UUID eventId);
	
	void putEventAsInProgress(UUID eventId);
	
	void putEventAsFailed(UUID eventId);
}
