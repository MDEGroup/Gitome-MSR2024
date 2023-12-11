/**
 */
package readme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see readme.ReadmePackage#getTextType()
 * @model
 * @generated
 */
public enum TextType implements Enumerator {
	/**
	 * The '<em><b>EMPHASIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPHASIS_VALUE
	 * @generated
	 * @ordered
	 */
	EMPHASIS(1, "EMPHASIS", "EMPHASIS"),

	/**
	 * The '<em><b>STRONG EMPHASIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRONG_EMPHASIS_VALUE
	 * @generated
	 * @ordered
	 */
	STRONG_EMPHASIS(2, "STRONG_EMPHASIS", "STRONG_EMPHASIS"),

	/**
	 * The '<em><b>RAW TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAW_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	RAW_TEXT(3, "RAW_TEXT", "RAW_TEXT");

	/**
	 * The '<em><b>EMPHASIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPHASIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMPHASIS_VALUE = 1;

	/**
	 * The '<em><b>STRONG EMPHASIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRONG_EMPHASIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRONG_EMPHASIS_VALUE = 2;

	/**
	 * The '<em><b>RAW TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAW_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAW_TEXT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Text Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextType[] VALUES_ARRAY =
		new TextType[] {
			EMPHASIS,
			STRONG_EMPHASIS,
			RAW_TEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextType get(int value) {
		switch (value) {
			case EMPHASIS_VALUE: return EMPHASIS;
			case STRONG_EMPHASIS_VALUE: return STRONG_EMPHASIS;
			case RAW_TEXT_VALUE: return RAW_TEXT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TextType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TextType
