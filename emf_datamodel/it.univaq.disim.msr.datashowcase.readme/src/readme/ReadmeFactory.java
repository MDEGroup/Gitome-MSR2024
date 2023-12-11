/**
 */
package readme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see readme.ReadmePackage
 * @generated
 */
public interface ReadmeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReadmeFactory eINSTANCE = readme.impl.ReadmeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Git Hub Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Git Hub Repository</em>'.
	 * @generated
	 */
	GitHubRepository createGitHubRepository();

	/**
	 * Returns a new object of class '<em>Readme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Readme</em>'.
	 * @generated
	 */
	Readme createReadme();

	/**
	 * Returns a new object of class '<em>Code Cells</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Cells</em>'.
	 * @generated
	 */
	CodeCells createCodeCells();

	/**
	 * Returns a new object of class '<em>Text Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Cell</em>'.
	 * @generated
	 */
	TextCell createTextCell();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReadmePackage getReadmePackage();

} //ReadmeFactory
