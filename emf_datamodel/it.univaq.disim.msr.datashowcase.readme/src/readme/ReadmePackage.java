/**
 */
package readme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see readme.ReadmeFactory
 * @model kind="package"
 * @generated
 */
public interface ReadmePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "readme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.disim.msr.datashowcase/readme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "readme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReadmePackage eINSTANCE = readme.impl.ReadmePackageImpl.init();

	/**
	 * The meta object id for the '{@link readme.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see readme.impl.ModelImpl
	 * @see readme.impl.ReadmePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REPOSITORIES = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link readme.impl.GitHubRepositoryImpl <em>Git Hub Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see readme.impl.GitHubRepositoryImpl
	 * @see readme.impl.ReadmePackageImpl#getGitHubRepository()
	 * @generated
	 */
	int GIT_HUB_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Source Dataset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__SOURCE_DATASET = 2;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__FORK = 3;

	/**
	 * The feature id for the '<em><b>Stars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__STARS = 4;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__CONTRIBUTORS = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__LANGUAGES = 7;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__TOPICS = 8;

	/**
	 * The feature id for the '<em><b>Main Readme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY__MAIN_README = 9;

	/**
	 * The number of structural features of the '<em>Git Hub Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Git Hub Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link readme.impl.ReadmeImpl <em>Readme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see readme.impl.ReadmeImpl
	 * @see readme.impl.ReadmePackageImpl#getReadme()
	 * @generated
	 */
	int README = 2;

	/**
	 * The feature id for the '<em><b>Raw content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int README__RAW_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Code Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int README__CODE_CELLS = 1;

	/**
	 * The feature id for the '<em><b>Text Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int README__TEXT_CELLS = 2;

	/**
	 * The number of structural features of the '<em>Readme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int README_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Readme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int README_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link readme.impl.CodeCellsImpl <em>Code Cells</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see readme.impl.CodeCellsImpl
	 * @see readme.impl.ReadmePackageImpl#getCodeCells()
	 * @generated
	 */
	int CODE_CELLS = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELLS__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELLS__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Code Cells</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELLS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Code Cells</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELLS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link readme.impl.TextCellImpl <em>Text Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see readme.impl.TextCellImpl
	 * @see readme.impl.ReadmePackageImpl#getTextCell()
	 * @generated
	 */
	int TEXT_CELL = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CELL__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CELL__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Text Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CELL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Text Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link readme.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see readme.Language
	 * @see readme.impl.ReadmePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 5;

	/**
	 * The meta object id for the '{@link readme.CodeType <em>Code Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see readme.CodeType
	 * @see readme.impl.ReadmePackageImpl#getCodeType()
	 * @generated
	 */
	int CODE_TYPE = 6;

	/**
	 * The meta object id for the '{@link readme.TextType <em>Text Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see readme.TextType
	 * @see readme.impl.ReadmePackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 7;

	/**
	 * Returns the meta object for class '{@link readme.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see readme.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link readme.Model#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see readme.Model#getRepositories()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Repositories();

	/**
	 * Returns the meta object for class '{@link readme.GitHubRepository <em>Git Hub Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Hub Repository</em>'.
	 * @see readme.GitHubRepository
	 * @generated
	 */
	EClass getGitHubRepository();

	/**
	 * Returns the meta object for the attribute '{@link readme.GitHubRepository#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see readme.GitHubRepository#getOwner()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EAttribute getGitHubRepository_Owner();

	/**
	 * Returns the meta object for the attribute '{@link readme.GitHubRepository#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see readme.GitHubRepository#getRepository()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EAttribute getGitHubRepository_Repository();

	/**
	 * Returns the meta object for the attribute '{@link readme.GitHubRepository#getSourceDataset <em>Source Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Dataset</em>'.
	 * @see readme.GitHubRepository#getSourceDataset()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EAttribute getGitHubRepository_SourceDataset();

	/**
	 * Returns the meta object for the attribute '{@link readme.GitHubRepository#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fork</em>'.
	 * @see readme.GitHubRepository#getFork()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EAttribute getGitHubRepository_Fork();

	/**
	 * Returns the meta object for the attribute '{@link readme.GitHubRepository#getStars <em>Stars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stars</em>'.
	 * @see readme.GitHubRepository#getStars()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EAttribute getGitHubRepository_Stars();

	/**
	 * Returns the meta object for the attribute '{@link readme.GitHubRepository#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contributors</em>'.
	 * @see readme.GitHubRepository#getContributors()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EAttribute getGitHubRepository_Contributors();

	/**
	 * Returns the meta object for the attribute '{@link readme.GitHubRepository#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see readme.GitHubRepository#getDescription()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EAttribute getGitHubRepository_Description();

	/**
	 * Returns the meta object for the attribute list '{@link readme.GitHubRepository#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Languages</em>'.
	 * @see readme.GitHubRepository#getLanguages()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EAttribute getGitHubRepository_Languages();

	/**
	 * Returns the meta object for the attribute list '{@link readme.GitHubRepository#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Topics</em>'.
	 * @see readme.GitHubRepository#getTopics()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EAttribute getGitHubRepository_Topics();

	/**
	 * Returns the meta object for the containment reference '{@link readme.GitHubRepository#getMainReadme <em>Main Readme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Readme</em>'.
	 * @see readme.GitHubRepository#getMainReadme()
	 * @see #getGitHubRepository()
	 * @generated
	 */
	EReference getGitHubRepository_MainReadme();

	/**
	 * Returns the meta object for class '{@link readme.Readme <em>Readme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Readme</em>'.
	 * @see readme.Readme
	 * @generated
	 */
	EClass getReadme();

	/**
	 * Returns the meta object for the attribute '{@link readme.Readme#getRaw_content <em>Raw content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw content</em>'.
	 * @see readme.Readme#getRaw_content()
	 * @see #getReadme()
	 * @generated
	 */
	EAttribute getReadme_Raw_content();

	/**
	 * Returns the meta object for the containment reference list '{@link readme.Readme#getCodeCells <em>Code Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Cells</em>'.
	 * @see readme.Readme#getCodeCells()
	 * @see #getReadme()
	 * @generated
	 */
	EReference getReadme_CodeCells();

	/**
	 * Returns the meta object for the containment reference list '{@link readme.Readme#getTextCells <em>Text Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Cells</em>'.
	 * @see readme.Readme#getTextCells()
	 * @see #getReadme()
	 * @generated
	 */
	EReference getReadme_TextCells();

	/**
	 * Returns the meta object for class '{@link readme.CodeCells <em>Code Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Cells</em>'.
	 * @see readme.CodeCells
	 * @generated
	 */
	EClass getCodeCells();

	/**
	 * Returns the meta object for the attribute '{@link readme.CodeCells#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see readme.CodeCells#getContent()
	 * @see #getCodeCells()
	 * @generated
	 */
	EAttribute getCodeCells_Content();

	/**
	 * Returns the meta object for the attribute '{@link readme.CodeCells#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see readme.CodeCells#getType()
	 * @see #getCodeCells()
	 * @generated
	 */
	EAttribute getCodeCells_Type();

	/**
	 * Returns the meta object for class '{@link readme.TextCell <em>Text Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Cell</em>'.
	 * @see readme.TextCell
	 * @generated
	 */
	EClass getTextCell();

	/**
	 * Returns the meta object for the attribute '{@link readme.TextCell#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see readme.TextCell#getContent()
	 * @see #getTextCell()
	 * @generated
	 */
	EAttribute getTextCell_Content();

	/**
	 * Returns the meta object for the attribute '{@link readme.TextCell#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see readme.TextCell#getType()
	 * @see #getTextCell()
	 * @generated
	 */
	EAttribute getTextCell_Type();

	/**
	 * Returns the meta object for enum '{@link readme.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see readme.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the meta object for enum '{@link readme.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Code Type</em>'.
	 * @see readme.CodeType
	 * @generated
	 */
	EEnum getCodeType();

	/**
	 * Returns the meta object for enum '{@link readme.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Type</em>'.
	 * @see readme.TextType
	 * @generated
	 */
	EEnum getTextType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReadmeFactory getReadmeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link readme.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see readme.impl.ModelImpl
		 * @see readme.impl.ReadmePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__REPOSITORIES = eINSTANCE.getModel_Repositories();

		/**
		 * The meta object literal for the '{@link readme.impl.GitHubRepositoryImpl <em>Git Hub Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see readme.impl.GitHubRepositoryImpl
		 * @see readme.impl.ReadmePackageImpl#getGitHubRepository()
		 * @generated
		 */
		EClass GIT_HUB_REPOSITORY = eINSTANCE.getGitHubRepository();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_REPOSITORY__OWNER = eINSTANCE.getGitHubRepository_Owner();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_REPOSITORY__REPOSITORY = eINSTANCE.getGitHubRepository_Repository();

		/**
		 * The meta object literal for the '<em><b>Source Dataset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_REPOSITORY__SOURCE_DATASET = eINSTANCE.getGitHubRepository_SourceDataset();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_REPOSITORY__FORK = eINSTANCE.getGitHubRepository_Fork();

		/**
		 * The meta object literal for the '<em><b>Stars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_REPOSITORY__STARS = eINSTANCE.getGitHubRepository_Stars();

		/**
		 * The meta object literal for the '<em><b>Contributors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_REPOSITORY__CONTRIBUTORS = eINSTANCE.getGitHubRepository_Contributors();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_REPOSITORY__DESCRIPTION = eINSTANCE.getGitHubRepository_Description();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_REPOSITORY__LANGUAGES = eINSTANCE.getGitHubRepository_Languages();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_REPOSITORY__TOPICS = eINSTANCE.getGitHubRepository_Topics();

		/**
		 * The meta object literal for the '<em><b>Main Readme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_HUB_REPOSITORY__MAIN_README = eINSTANCE.getGitHubRepository_MainReadme();

		/**
		 * The meta object literal for the '{@link readme.impl.ReadmeImpl <em>Readme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see readme.impl.ReadmeImpl
		 * @see readme.impl.ReadmePackageImpl#getReadme()
		 * @generated
		 */
		EClass README = eINSTANCE.getReadme();

		/**
		 * The meta object literal for the '<em><b>Raw content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute README__RAW_CONTENT = eINSTANCE.getReadme_Raw_content();

		/**
		 * The meta object literal for the '<em><b>Code Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference README__CODE_CELLS = eINSTANCE.getReadme_CodeCells();

		/**
		 * The meta object literal for the '<em><b>Text Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference README__TEXT_CELLS = eINSTANCE.getReadme_TextCells();

		/**
		 * The meta object literal for the '{@link readme.impl.CodeCellsImpl <em>Code Cells</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see readme.impl.CodeCellsImpl
		 * @see readme.impl.ReadmePackageImpl#getCodeCells()
		 * @generated
		 */
		EClass CODE_CELLS = eINSTANCE.getCodeCells();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CELLS__CONTENT = eINSTANCE.getCodeCells_Content();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CELLS__TYPE = eINSTANCE.getCodeCells_Type();

		/**
		 * The meta object literal for the '{@link readme.impl.TextCellImpl <em>Text Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see readme.impl.TextCellImpl
		 * @see readme.impl.ReadmePackageImpl#getTextCell()
		 * @generated
		 */
		EClass TEXT_CELL = eINSTANCE.getTextCell();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CELL__CONTENT = eINSTANCE.getTextCell_Content();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CELL__TYPE = eINSTANCE.getTextCell_Type();

		/**
		 * The meta object literal for the '{@link readme.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see readme.Language
		 * @see readme.impl.ReadmePackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link readme.CodeType <em>Code Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see readme.CodeType
		 * @see readme.impl.ReadmePackageImpl#getCodeType()
		 * @generated
		 */
		EEnum CODE_TYPE = eINSTANCE.getCodeType();

		/**
		 * The meta object literal for the '{@link readme.TextType <em>Text Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see readme.TextType
		 * @see readme.impl.ReadmePackageImpl#getTextType()
		 * @generated
		 */
		EEnum TEXT_TYPE = eINSTANCE.getTextType();

	}

} //ReadmePackage
