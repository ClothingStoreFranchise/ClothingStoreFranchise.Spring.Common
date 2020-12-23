package clothingstorefranchise.spring.common.extensible;

import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;


public abstract class AbstractExtensibleEntityDto {
	
	public abstract String getExtensibleEntityName();
	
	@Getter
	@Setter(AccessLevel.NONE)
	public HashMap<String, Object> extendedData;
	
	protected AbstractExtensibleEntityDto() {
		extendedData = new HashMap<String, Object>();
	}
}
