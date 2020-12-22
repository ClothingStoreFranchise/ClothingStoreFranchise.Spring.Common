package clothingstorefranchise.spring.common.event;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
	@Builder.Default
	private UUID eventId = UUID.randomUUID();
	
	@JsonProperty("CreationDate")
	@Builder.Default
	private String creationDate = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
}
