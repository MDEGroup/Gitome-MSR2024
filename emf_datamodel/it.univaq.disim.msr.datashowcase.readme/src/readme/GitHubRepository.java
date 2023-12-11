/**
 */
package readme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Hub Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link readme.GitHubRepository#getOwner <em>Owner</em>}</li>
 *   <li>{@link readme.GitHubRepository#getRepository <em>Repository</em>}</li>
 *   <li>{@link readme.GitHubRepository#getSourceDataset <em>Source Dataset</em>}</li>
 *   <li>{@link readme.GitHubRepository#getFork <em>Fork</em>}</li>
 *   <li>{@link readme.GitHubRepository#getStars <em>Stars</em>}</li>
 *   <li>{@link readme.GitHubRepository#getContributors <em>Contributors</em>}</li>
 *   <li>{@link readme.GitHubRepository#getDescription <em>Description</em>}</li>
 *   <li>{@link readme.GitHubRepository#getLanguages <em>Languages</em>}</li>
 *   <li>{@link readme.GitHubRepository#getTopics <em>Topics</em>}</li>
 *   <li>{@link readme.GitHubRepository#getMainReadme <em>Main Readme</em>}</li>
 * </ul>
 *
 * @see readme.ReadmePackage#getGitHubRepository()
 * @model
 * @generated
 */
public interface GitHubRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see readme.ReadmePackage#getGitHubRepository_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link readme.GitHubRepository#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' attribute.
	 * @see #setRepository(String)
	 * @see readme.ReadmePackage#getGitHubRepository_Repository()
	 * @model
	 * @generated
	 */
	String getRepository();

	/**
	 * Sets the value of the '{@link readme.GitHubRepository#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

	/**
	 * Returns the value of the '<em><b>Source Dataset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Dataset</em>' attribute.
	 * @see #setSourceDataset(String)
	 * @see readme.ReadmePackage#getGitHubRepository_SourceDataset()
	 * @model
	 * @generated
	 */
	String getSourceDataset();

	/**
	 * Sets the value of the '{@link readme.GitHubRepository#getSourceDataset <em>Source Dataset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Dataset</em>' attribute.
	 * @see #getSourceDataset()
	 * @generated
	 */
	void setSourceDataset(String value);

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' attribute.
	 * @see #setFork(int)
	 * @see readme.ReadmePackage#getGitHubRepository_Fork()
	 * @model
	 * @generated
	 */
	int getFork();

	/**
	 * Sets the value of the '{@link readme.GitHubRepository#getFork <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork</em>' attribute.
	 * @see #getFork()
	 * @generated
	 */
	void setFork(int value);

	/**
	 * Returns the value of the '<em><b>Stars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stars</em>' attribute.
	 * @see #setStars(int)
	 * @see readme.ReadmePackage#getGitHubRepository_Stars()
	 * @model
	 * @generated
	 */
	int getStars();

	/**
	 * Sets the value of the '{@link readme.GitHubRepository#getStars <em>Stars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stars</em>' attribute.
	 * @see #getStars()
	 * @generated
	 */
	void setStars(int value);

	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributors</em>' attribute.
	 * @see #setContributors(int)
	 * @see readme.ReadmePackage#getGitHubRepository_Contributors()
	 * @model
	 * @generated
	 */
	int getContributors();

	/**
	 * Sets the value of the '{@link readme.GitHubRepository#getContributors <em>Contributors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributors</em>' attribute.
	 * @see #getContributors()
	 * @generated
	 */
	void setContributors(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see readme.ReadmePackage#getGitHubRepository_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link readme.GitHubRepository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' attribute list.
	 * The list contents are of type {@link readme.Language}.
	 * The literals are from the enumeration {@link readme.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' attribute list.
	 * @see readme.Language
	 * @see readme.ReadmePackage#getGitHubRepository_Languages()
	 * @model
	 * @generated
	 */
	EList<Language> getLanguages();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' attribute list.
	 * @see readme.ReadmePackage#getGitHubRepository_Topics()
	 * @model
	 * @generated
	 */
	EList<String> getTopics();

	/**
	 * Returns the value of the '<em><b>Main Readme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Readme</em>' containment reference.
	 * @see #setMainReadme(Readme)
	 * @see readme.ReadmePackage#getGitHubRepository_MainReadme()
	 * @model containment="true"
	 * @generated
	 */
	Readme getMainReadme();

	/**
	 * Sets the value of the '{@link readme.GitHubRepository#getMainReadme <em>Main Readme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Readme</em>' containment reference.
	 * @see #getMainReadme()
	 * @generated
	 */
	void setMainReadme(Readme value);

} // GitHubRepository
