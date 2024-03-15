package de.bonprix.trinity.shoplibrary.gen;

import de.bonprix.trinity.shoplibrary.AbstractAttributes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import de.bonprix.trinity.shoplibrary.Schema;
import lombok.Builder;
import lombok.ToString;
import lombok.Getter;
import java.util.List;
import java.util.Arrays;
import de.bonprix.trinity.shoplibrary.datatype.*;
import de.bonprix.trinity.shoplibrary.exception.FieldIsMandatoryException;
import de.bonprix.trinity.shoplibrary.exception.UnsuportedValueException;
import de.bonprix.trinity.shoplibrary.exception.SupportedValuesException;



/**
 * THIS CODE IS AUTO GENERATED <br>
 * BY TRINITY TOOLS CODE GENERATION <br>
 * DEVELOPED BY BonPrix <br> <br>
 * This Class uses a Builder Pattern - use TeeerAttributesV1.builder() to create a Builder
 * the builder evaluates the Attributes against the Schema and throws <b>RuntimeExceptions</b>
 */

@Getter
@Builder
@ToString
public class TeeerAttributesV1 extends AbstractAttributes {

	@JsonIgnore
	private transient final Schema schema = new Schema("TEEER", 1L);

	// Attributes
   /**
	 * 
   */
	@JsonProperty("teeer")
	private String teeer;

	@Override
	public void encryptValues(int clientId) {

	}

    @Override
    public boolean validate(Schema schema) {
        return schema.equals(this.schema);
    }

    // Uses custom builder class
    /**
     * teeer is Mandatory  <br>
     * <br>
	*/
	public static TeeerAttributesV1Builder builder() {
		return new TeeerAttributesV1.CustomAttributesBuilder();
	}

	/**
	 * Custom  builder class
	 */
	private static class CustomAttributesBuilder extends TeeerAttributesV1Builder {

		@Override
		public TeeerAttributesV1 build() {
			// Validates required fields
			if(super.teeer == null) throw new FieldIsMandatoryException("teeer is Mandatory");

			return super.build();
		}

	    private static <T> boolean compareWithList(T value, List<T> supportedValues) {
	        for (T supportedValue : supportedValues) {
	            if (value.equals(supportedValue)) {
			        return true;
			    }
	        } return false;
		}
	}

}
