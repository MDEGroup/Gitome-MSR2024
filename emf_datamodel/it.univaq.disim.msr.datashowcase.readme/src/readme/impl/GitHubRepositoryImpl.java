/**
 */
package readme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import readme.GitHubRepository;
import readme.Language;
import readme.Readme;
import readme.ReadmePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Git Hub Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getSourceDataset <em>Source Dataset</em>}</li>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getFork <em>Fork</em>}</li>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getStars <em>Stars</em>}</li>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link readme.impl.GitHubRepositoryImpl#getMainReadme <em>Main Readme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitHubRepositoryImpl extends MinimalEObjectImpl.Container implements GitHubRepository {
	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected String repository = REPOSITORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceDataset() <em>Source Dataset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDataset()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DATASET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceDataset() <em>Source Dataset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDataset()
	 * @generated
	 * @ordered
	 */
	protected String sourceDataset = SOURCE_DATASET_EDEFAULT;

	/**
	 * The default value of the '{@link #getFork() <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFork()
	 * @generated
	 * @ordered
	 */
	protected static final int FORK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFork() <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFork()
	 * @generated
	 * @ordered
	 */
	protected int fork = FORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getStars() <em>Stars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStars()
	 * @generated
	 * @ordered
	 */
	protected static final int STARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStars() <em>Stars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStars()
	 * @generated
	 * @ordered
	 */
	protected int stars = STARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContributors() <em>Contributors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTRIBUTORS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContributors() <em>Contributors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors()
	 * @generated
	 * @ordered
	 */
	protected int contributors = CONTRIBUTORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> languages;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<String> topics;

	/**
	 * The cached value of the '{@link #getMainReadme() <em>Main Readme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainReadme()
	 * @generated
	 * @ordered
	 */
	protected Readme mainReadme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitHubRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReadmePackage.Literals.GIT_HUB_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReadmePackage.GIT_HUB_REPOSITORY__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(String newRepository) {
		String oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReadmePackage.GIT_HUB_REPOSITORY__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDataset() {
		return sourceDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDataset(String newSourceDataset) {
		String oldSourceDataset = sourceDataset;
		sourceDataset = newSourceDataset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReadmePackage.GIT_HUB_REPOSITORY__SOURCE_DATASET, oldSourceDataset, sourceDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFork() {
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFork(int newFork) {
		int oldFork = fork;
		fork = newFork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReadmePackage.GIT_HUB_REPOSITORY__FORK, oldFork, fork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStars() {
		return stars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStars(int newStars) {
		int oldStars = stars;
		stars = newStars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReadmePackage.GIT_HUB_REPOSITORY__STARS, oldStars, stars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContributors() {
		return contributors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributors(int newContributors) {
		int oldContributors = contributors;
		contributors = newContributors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReadmePackage.GIT_HUB_REPOSITORY__CONTRIBUTORS, oldContributors, contributors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReadmePackage.GIT_HUB_REPOSITORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeUniqueEList<Language>(Language.class, this, ReadmePackage.GIT_HUB_REPOSITORY__LANGUAGES);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTopics() {
		if (topics == null) {
			topics = new EDataTypeUniqueEList<String>(String.class, this, ReadmePackage.GIT_HUB_REPOSITORY__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Readme getMainReadme() {
		return mainReadme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainReadme(Readme newMainReadme, NotificationChain msgs) {
		Readme oldMainReadme = mainReadme;
		mainReadme = newMainReadme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReadmePackage.GIT_HUB_REPOSITORY__MAIN_README, oldMainReadme, newMainReadme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainReadme(Readme newMainReadme) {
		if (newMainReadme != mainReadme) {
			NotificationChain msgs = null;
			if (mainReadme != null)
				msgs = ((InternalEObject)mainReadme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReadmePackage.GIT_HUB_REPOSITORY__MAIN_README, null, msgs);
			if (newMainReadme != null)
				msgs = ((InternalEObject)newMainReadme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReadmePackage.GIT_HUB_REPOSITORY__MAIN_README, null, msgs);
			msgs = basicSetMainReadme(newMainReadme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReadmePackage.GIT_HUB_REPOSITORY__MAIN_README, newMainReadme, newMainReadme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReadmePackage.GIT_HUB_REPOSITORY__MAIN_README:
				return basicSetMainReadme(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReadmePackage.GIT_HUB_REPOSITORY__OWNER:
				return getOwner();
			case ReadmePackage.GIT_HUB_REPOSITORY__REPOSITORY:
				return getRepository();
			case ReadmePackage.GIT_HUB_REPOSITORY__SOURCE_DATASET:
				return getSourceDataset();
			case ReadmePackage.GIT_HUB_REPOSITORY__FORK:
				return getFork();
			case ReadmePackage.GIT_HUB_REPOSITORY__STARS:
				return getStars();
			case ReadmePackage.GIT_HUB_REPOSITORY__CONTRIBUTORS:
				return getContributors();
			case ReadmePackage.GIT_HUB_REPOSITORY__DESCRIPTION:
				return getDescription();
			case ReadmePackage.GIT_HUB_REPOSITORY__LANGUAGES:
				return getLanguages();
			case ReadmePackage.GIT_HUB_REPOSITORY__TOPICS:
				return getTopics();
			case ReadmePackage.GIT_HUB_REPOSITORY__MAIN_README:
				return getMainReadme();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReadmePackage.GIT_HUB_REPOSITORY__OWNER:
				setOwner((String)newValue);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__REPOSITORY:
				setRepository((String)newValue);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__SOURCE_DATASET:
				setSourceDataset((String)newValue);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__FORK:
				setFork((Integer)newValue);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__STARS:
				setStars((Integer)newValue);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__CONTRIBUTORS:
				setContributors((Integer)newValue);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends Language>)newValue);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends String>)newValue);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__MAIN_README:
				setMainReadme((Readme)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReadmePackage.GIT_HUB_REPOSITORY__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__REPOSITORY:
				setRepository(REPOSITORY_EDEFAULT);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__SOURCE_DATASET:
				setSourceDataset(SOURCE_DATASET_EDEFAULT);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__FORK:
				setFork(FORK_EDEFAULT);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__STARS:
				setStars(STARS_EDEFAULT);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__CONTRIBUTORS:
				setContributors(CONTRIBUTORS_EDEFAULT);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__LANGUAGES:
				getLanguages().clear();
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__TOPICS:
				getTopics().clear();
				return;
			case ReadmePackage.GIT_HUB_REPOSITORY__MAIN_README:
				setMainReadme((Readme)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReadmePackage.GIT_HUB_REPOSITORY__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case ReadmePackage.GIT_HUB_REPOSITORY__REPOSITORY:
				return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
			case ReadmePackage.GIT_HUB_REPOSITORY__SOURCE_DATASET:
				return SOURCE_DATASET_EDEFAULT == null ? sourceDataset != null : !SOURCE_DATASET_EDEFAULT.equals(sourceDataset);
			case ReadmePackage.GIT_HUB_REPOSITORY__FORK:
				return fork != FORK_EDEFAULT;
			case ReadmePackage.GIT_HUB_REPOSITORY__STARS:
				return stars != STARS_EDEFAULT;
			case ReadmePackage.GIT_HUB_REPOSITORY__CONTRIBUTORS:
				return contributors != CONTRIBUTORS_EDEFAULT;
			case ReadmePackage.GIT_HUB_REPOSITORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ReadmePackage.GIT_HUB_REPOSITORY__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case ReadmePackage.GIT_HUB_REPOSITORY__TOPICS:
				return topics != null && !topics.isEmpty();
			case ReadmePackage.GIT_HUB_REPOSITORY__MAIN_README:
				return mainReadme != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (owner: ");
		result.append(owner);
		result.append(", repository: ");
		result.append(repository);
		result.append(", sourceDataset: ");
		result.append(sourceDataset);
		result.append(", fork: ");
		result.append(fork);
		result.append(", stars: ");
		result.append(stars);
		result.append(", contributors: ");
		result.append(contributors);
		result.append(", description: ");
		result.append(description);
		result.append(", languages: ");
		result.append(languages);
		result.append(", topics: ");
		result.append(topics);
		result.append(')');
		return result.toString();
	}

} //GitHubRepositoryImpl
