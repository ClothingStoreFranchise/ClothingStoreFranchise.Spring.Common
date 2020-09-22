package clothingstorefranchise.spring.common.event;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IntegrationEvent {
	
	@JsonProperty("EventId")
	private UUID eventId;
	/*@Builder.Default
	private UUID eventId = UUID.randomUUID();*/
	
	@JsonProperty("CreationDate")
	private String creationDate;
	/*@Builder.Default
	private LocalDateTime creationDate = LocalDateTime.now();*/
}
