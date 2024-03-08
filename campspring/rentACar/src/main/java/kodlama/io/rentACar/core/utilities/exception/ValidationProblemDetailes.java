package kodlama.io.rentACar.core.utilities.exception;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationProblemDetailes extends ProblemDetails {
	
private Map<String,String> validationErrors;
}
