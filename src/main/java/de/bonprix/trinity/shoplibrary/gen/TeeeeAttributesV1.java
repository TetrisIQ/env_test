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
 * This Class uses a Builder Pattern - use TeeeeAttributesV1.builder() to create a Builder
 * the builder evaluates the Attributes against the Schema and throws <b>RuntimeExceptions</b>
 */

@Getter
@Builder
@ToString
public class TeeeeAttributesV1 extends AbstractAttributes {

	@JsonIgnore
	private transient final Schema schema = new Schema("TEEEE", 1L);

	// Attributes
	/**
	 * 
	*/
	@JsonProperty("a")
	private Double a;

	@Override
	public void encryptValues(int clientId) {

	}

    @Override
    public boolean validate(Schema schema) {
        return schema.equals(this.schema);
    }

    // Uses custom builder class
    /**
     * <br>
     * a is not Mandatory  <br>
	*/
	public static TeeeeAttributesV1Builder builder() {
		return new TeeeeAttributesV1.CustomAttributesBuilder();
	}

	/**
	 * Custom  builder class
	 */
	private static class CustomAttributesBuilder extends TeeeeAttributesV1Builder {

		@Override
		public TeeeeAttributesV1 build() {
			// Validates required fields

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
