/**
 */
package readme.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import readme.CodeCells;
import readme.CodeType;
import readme.GitHubRepository;
import readme.Language;
import readme.Model;
import readme.Readme;
import readme.ReadmeFactory;
import readme.ReadmePackage;
import readme.TextCell;
import readme.TextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReadmePackageImpl extends EPackageImpl implements ReadmePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gitHubRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeCellsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see readme.ReadmePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReadmePackageImpl() {
		super(eNS_URI, ReadmeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ReadmePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReadmePackage init() {
		if (isInited) return (ReadmePackage)EPackage.Registry.INSTANCE.getEPackage(ReadmePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReadmePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReadmePackageImpl theReadmePackage = registeredReadmePackage instanceof ReadmePackageImpl ? (ReadmePackageImpl)registeredReadmePackage : new ReadmePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theReadmePackage.createPackageContents();

		// Initialize created meta-data
		theReadmePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReadmePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReadmePackage.eNS_URI, theReadmePackage);
		return theReadmePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Repositories() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGitHubRepository() {
		return gitHubRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHubRepository_Owner() {
		return (EAttribute)gitHubRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHubRepository_Repository() {
		return (EAttribute)gitHubRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHubRepository_SourceDataset() {
		return (EAttribute)gitHubRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHubRepository_Fork() {
		return (EAttribute)gitHubRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHubRepository_Stars() {
		return (EAttribute)gitHubRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHubRepository_Contributors() {
		return (EAttribute)gitHubRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHubRepository_Description() {
		return (EAttribute)gitHubRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHubRepository_Languages() {
		return (EAttribute)gitHubRepositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHubRepository_Topics() {
		return (EAttribute)gitHubRepositoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGitHubRepository_MainReadme() {
		return (EReference)gitHubRepositoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadme() {
		return readmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadme_Raw_content() {
		return (EAttribute)readmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadme_CodeCells() {
		return (EReference)readmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadme_TextCells() {
		return (EReference)readmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeCells() {
		return codeCellsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeCells_Content() {
		return (EAttribute)codeCellsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeCells_Type() {
		return (EAttribute)codeCellsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextCell() {
		return textCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextCell_Content() {
		return (EAttribute)textCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextCell_Type() {
		return (EAttribute)textCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguage() {
		return languageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodeType() {
		return codeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextType() {
		return textTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadmeFactory getReadmeFactory() {
		return (ReadmeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__REPOSITORIES);

		gitHubRepositoryEClass = createEClass(GIT_HUB_REPOSITORY);
		createEAttribute(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__OWNER);
		createEAttribute(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__REPOSITORY);
		createEAttribute(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__SOURCE_DATASET);
		createEAttribute(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__FORK);
		createEAttribute(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__STARS);
		createEAttribute(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__CONTRIBUTORS);
		createEAttribute(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__DESCRIPTION);
		createEAttribute(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__LANGUAGES);
		createEAttribute(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__TOPICS);
		createEReference(gitHubRepositoryEClass, GIT_HUB_REPOSITORY__MAIN_README);

		readmeEClass = createEClass(README);
		createEAttribute(readmeEClass, README__RAW_CONTENT);
		createEReference(readmeEClass, README__CODE_CELLS);
		createEReference(readmeEClass, README__TEXT_CELLS);

		codeCellsEClass = createEClass(CODE_CELLS);
		createEAttribute(codeCellsEClass, CODE_CELLS__CONTENT);
		createEAttribute(codeCellsEClass, CODE_CELLS__TYPE);

		textCellEClass = createEClass(TEXT_CELL);
		createEAttribute(textCellEClass, TEXT_CELL__CONTENT);
		createEAttribute(textCellEClass, TEXT_CELL__TYPE);

		// Create enums
		languageEEnum = createEEnum(LANGUAGE);
		codeTypeEEnum = createEEnum(CODE_TYPE);
		textTypeEEnum = createEEnum(TEXT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Repositories(), this.getGitHubRepository(), null, "repositories", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gitHubRepositoryEClass, GitHubRepository.class, "GitHubRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGitHubRepository_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHubRepository_Repository(), ecorePackage.getEString(), "repository", null, 0, 1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHubRepository_SourceDataset(), ecorePackage.getEString(), "sourceDataset", null, 0, 1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHubRepository_Fork(), ecorePackage.getEInt(), "fork", null, 0, 1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHubRepository_Stars(), ecorePackage.getEInt(), "stars", null, 0, 1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHubRepository_Contributors(), ecorePackage.getEInt(), "contributors", null, 0, 1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHubRepository_Description(), ecorePackage.getEString(), "description", null, 0, 1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHubRepository_Languages(), this.getLanguage(), "languages", null, 0, -1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHubRepository_Topics(), ecorePackage.getEString(), "topics", null, 0, -1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGitHubRepository_MainReadme(), this.getReadme(), null, "mainReadme", null, 0, 1, GitHubRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readmeEClass, Readme.class, "Readme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadme_Raw_content(), ecorePackage.getEString(), "raw_content", null, 0, 1, Readme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadme_CodeCells(), this.getCodeCells(), null, "codeCells", null, 0, -1, Readme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReadme_TextCells(), this.getTextCell(), null, "textCells", null, 0, -1, Readme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeCellsEClass, CodeCells.class, "CodeCells", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeCells_Content(), ecorePackage.getEString(), "content", null, 0, 1, CodeCells.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeCells_Type(), this.getCodeType(), "type", null, 0, 1, CodeCells.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textCellEClass, TextCell.class, "TextCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextCell_Content(), ecorePackage.getEString(), "content", null, 0, 1, TextCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextCell_Type(), this.getTextType(), "type", null, 0, 1, TextCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(languageEEnum, Language.class, "Language");
		addEEnumLiteral(languageEEnum, Language.JAVA);

		initEEnum(codeTypeEEnum, CodeType.class, "CodeType");
		addEEnumLiteral(codeTypeEEnum, CodeType.CODE_SPAN);
		addEEnumLiteral(codeTypeEEnum, CodeType.IMAGE);
		addEEnumLiteral(codeTypeEEnum, CodeType.LINK);
		addEEnumLiteral(codeTypeEEnum, CodeType.AUTO_LINK);
		addEEnumLiteral(codeTypeEEnum, CodeType.IN_LINE_HTML);

		initEEnum(textTypeEEnum, TextType.class, "TextType");
		addEEnumLiteral(textTypeEEnum, TextType.EMPHASIS);
		addEEnumLiteral(textTypeEEnum, TextType.STRONG_EMPHASIS);
		addEEnumLiteral(textTypeEEnum, TextType.RAW_TEXT);

		// Create resource
		createResource(eNS_URI);
	}

} //ReadmePackageImpl
