/**
 */
package readme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Code Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see readme.ReadmePackage#getCodeType()
 * @model
 * @generated
 */
public enum CodeType implements Enumerator {
	/**
	 * The '<em><b>CODE SPAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_SPAN_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_SPAN(0, "CODE_SPAN", "CODE_SPAN"), /**
	 * The '<em><b>IMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(1, "IMAGE", "IMAGE"), /**
	 * The '<em><b>LINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINK_VALUE
	 * @generated
	 * @ordered
	 */
	LINK(2, "LINK", "LINK"), /**
	 * The '<em><b>AUTO LINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_LINK(3, "AUTO_LINK", "AUTO_LINK"), /**
	 * The '<em><b>IN LINE HTML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_LINE_HTML_VALUE
	 * @generated
	 * @ordered
	 */
	IN_LINE_HTML(4, "IN_LINE_HTML", "IN_LINE_HTML");

	/**
	 * The '<em><b>CODE SPAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_SPAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CODE_SPAN_VALUE = 0;

	/**
	 * The '<em><b>IMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 1;

	/**
	 * The '<em><b>LINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINK_VALUE = 2;

	/**
	 * The '<em><b>AUTO LINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_LINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_LINK_VALUE = 3;

	/**
	 * The '<em><b>IN LINE HTML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_LINE_HTML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_LINE_HTML_VALUE = 4;

	/**
	 * An array of all the '<em><b>Code Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodeType[] VALUES_ARRAY =
		new CodeType[] {
			CODE_SPAN,
			IMAGE,
			LINK,
			AUTO_LINK,
			IN_LINE_HTML,
		};

	/**
	 * A public read-only list of all the '<em><b>Code Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Code Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Code Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeType get(int value) {
		switch (value) {
			case CODE_SPAN_VALUE: return CODE_SPAN;
			case IMAGE_VALUE: return IMAGE;
			case LINK_VALUE: return LINK;
			case AUTO_LINK_VALUE: return AUTO_LINK;
			case IN_LINE_HTML_VALUE: return IN_LINE_HTML;
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
	private CodeType(int value, String name, String literal) {
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
	
} //CodeType
