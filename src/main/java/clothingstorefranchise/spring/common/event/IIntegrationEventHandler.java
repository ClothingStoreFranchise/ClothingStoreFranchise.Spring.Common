package clothingstorefranchise.spring.common.event;


public interface IIntegrationEventHandler<TEvent extends IntegrationEvent> {
	void handle(TEvent event);
}