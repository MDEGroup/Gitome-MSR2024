/**
 */
package readme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link readme.Model#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @see readme.ReadmePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link readme.GitHubRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see readme.ReadmePackage#getModel_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<GitHubRepository> getRepositories();

} // Model
