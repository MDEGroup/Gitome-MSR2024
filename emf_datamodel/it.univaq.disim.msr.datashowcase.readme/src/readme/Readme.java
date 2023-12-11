/**
 */
package readme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Readme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link readme.Readme#getRaw_content <em>Raw content</em>}</li>
 *   <li>{@link readme.Readme#getCodeCells <em>Code Cells</em>}</li>
 *   <li>{@link readme.Readme#getTextCells <em>Text Cells</em>}</li>
 * </ul>
 *
 * @see readme.ReadmePackage#getReadme()
 * @model
 * @generated
 */
public interface Readme extends EObject {
	/**
	 * Returns the value of the '<em><b>Raw content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw content</em>' attribute.
	 * @see #setRaw_content(String)
	 * @see readme.ReadmePackage#getReadme_Raw_content()
	 * @model
	 * @generated
	 */
	String getRaw_content();

	/**
	 * Sets the value of the '{@link readme.Readme#getRaw_content <em>Raw content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw content</em>' attribute.
	 * @see #getRaw_content()
	 * @generated
	 */
	void setRaw_content(String value);

	/**
	 * Returns the value of the '<em><b>Code Cells</b></em>' containment reference list.
	 * The list contents are of type {@link readme.CodeCells}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Cells</em>' containment reference list.
	 * @see readme.ReadmePackage#getReadme_CodeCells()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeCells> getCodeCells();

	/**
	 * Returns the value of the '<em><b>Text Cells</b></em>' containment reference list.
	 * The list contents are of type {@link readme.TextCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Cells</em>' containment reference list.
	 * @see readme.ReadmePackage#getReadme_TextCells()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextCell> getTextCells();

} // Readme
