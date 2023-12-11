/**
 */
package readme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Cells</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link readme.CodeCells#getContent <em>Content</em>}</li>
 *   <li>{@link readme.CodeCells#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see readme.ReadmePackage#getCodeCells()
 * @model
 * @generated
 */
public interface CodeCells extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see readme.ReadmePackage#getCodeCells_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link readme.CodeCells#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link readme.CodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see readme.CodeType
	 * @see #setType(CodeType)
	 * @see readme.ReadmePackage#getCodeCells_Type()
	 * @model
	 * @generated
	 */
	CodeType getType();

	/**
	 * Sets the value of the '{@link readme.CodeCells#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see readme.CodeType
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeType value);

} // CodeCells
