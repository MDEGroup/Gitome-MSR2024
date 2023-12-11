/**
 */
package readme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link readme.TextCell#getContent <em>Content</em>}</li>
 *   <li>{@link readme.TextCell#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see readme.ReadmePackage#getTextCell()
 * @model
 * @generated
 */
public interface TextCell extends EObject {

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see readme.ReadmePackage#getTextCell_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link readme.TextCell#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link readme.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see readme.TextType
	 * @see #setType(TextType)
	 * @see readme.ReadmePackage#getTextCell_Type()
	 * @model
	 * @generated
	 */
	TextType getType();

	/**
	 * Sets the value of the '{@link readme.TextCell#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see readme.TextType
	 * @see #getType()
	 * @generated
	 */
	void setType(TextType value);
} // TextCell
