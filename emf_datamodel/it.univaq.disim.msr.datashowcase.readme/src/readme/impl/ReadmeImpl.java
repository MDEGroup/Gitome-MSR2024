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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import readme.CodeCells;
import readme.Readme;
import readme.ReadmePackage;
import readme.TextCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Readme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link readme.impl.ReadmeImpl#getRaw_content <em>Raw content</em>}</li>
 *   <li>{@link readme.impl.ReadmeImpl#getCodeCells <em>Code Cells</em>}</li>
 *   <li>{@link readme.impl.ReadmeImpl#getTextCells <em>Text Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadmeImpl extends MinimalEObjectImpl.Container implements Readme {
	/**
	 * The default value of the '{@link #getRaw_content() <em>Raw content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaw_content()
	 * @generated
	 * @ordered
	 */
	protected static final String RAW_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRaw_content() <em>Raw content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaw_content()
	 * @generated
	 * @ordered
	 */
	protected String raw_content = RAW_CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodeCells() <em>Code Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeCells()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeCells> codeCells;

	/**
	 * The cached value of the '{@link #getTextCells() <em>Text Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextCells()
	 * @generated
	 * @ordered
	 */
	protected EList<TextCell> textCells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadmeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReadmePackage.Literals.README;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRaw_content() {
		return raw_content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaw_content(String newRaw_content) {
		String oldRaw_content = raw_content;
		raw_content = newRaw_content;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReadmePackage.README__RAW_CONTENT, oldRaw_content, raw_content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeCells> getCodeCells() {
		if (codeCells == null) {
			codeCells = new EObjectContainmentEList<CodeCells>(CodeCells.class, this, ReadmePackage.README__CODE_CELLS);
		}
		return codeCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextCell> getTextCells() {
		if (textCells == null) {
			textCells = new EObjectContainmentEList<TextCell>(TextCell.class, this, ReadmePackage.README__TEXT_CELLS);
		}
		return textCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReadmePackage.README__CODE_CELLS:
				return ((InternalEList<?>)getCodeCells()).basicRemove(otherEnd, msgs);
			case ReadmePackage.README__TEXT_CELLS:
				return ((InternalEList<?>)getTextCells()).basicRemove(otherEnd, msgs);
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
			case ReadmePackage.README__RAW_CONTENT:
				return getRaw_content();
			case ReadmePackage.README__CODE_CELLS:
				return getCodeCells();
			case ReadmePackage.README__TEXT_CELLS:
				return getTextCells();
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
			case ReadmePackage.README__RAW_CONTENT:
				setRaw_content((String)newValue);
				return;
			case ReadmePackage.README__CODE_CELLS:
				getCodeCells().clear();
				getCodeCells().addAll((Collection<? extends CodeCells>)newValue);
				return;
			case ReadmePackage.README__TEXT_CELLS:
				getTextCells().clear();
				getTextCells().addAll((Collection<? extends TextCell>)newValue);
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
			case ReadmePackage.README__RAW_CONTENT:
				setRaw_content(RAW_CONTENT_EDEFAULT);
				return;
			case ReadmePackage.README__CODE_CELLS:
				getCodeCells().clear();
				return;
			case ReadmePackage.README__TEXT_CELLS:
				getTextCells().clear();
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
			case ReadmePackage.README__RAW_CONTENT:
				return RAW_CONTENT_EDEFAULT == null ? raw_content != null : !RAW_CONTENT_EDEFAULT.equals(raw_content);
			case ReadmePackage.README__CODE_CELLS:
				return codeCells != null && !codeCells.isEmpty();
			case ReadmePackage.README__TEXT_CELLS:
				return textCells != null && !textCells.isEmpty();
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
		result.append(" (raw_content: ");
		result.append(raw_content);
		result.append(')');
		return result.toString();
	}

} //ReadmeImpl
