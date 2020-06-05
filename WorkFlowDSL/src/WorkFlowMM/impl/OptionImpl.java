/**
 */
package WorkFlowMM.impl;

import WorkFlowMM.Option;
import WorkFlowMM.WorkFlowMMPackage;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.impl.OptionImpl#getFieldname <em>Fieldname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends EObjectImpl implements Option {
	/**
	 * The default value of the '{@link #getFieldname() <em>Fieldname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELDNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldname() <em>Fieldname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldname()
	 * @generated
	 * @ordered
	 */
	protected String fieldname = FIELDNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkFlowMMPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldname() {
		return fieldname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldname(String newFieldname) {
		String oldFieldname = fieldname;
		fieldname = newFieldname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkFlowMMPackage.OPTION__FIELDNAME, oldFieldname, fieldname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkFlowMMPackage.OPTION__FIELDNAME:
				return getFieldname();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkFlowMMPackage.OPTION__FIELDNAME:
				setFieldname((String)newValue);
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
			case WorkFlowMMPackage.OPTION__FIELDNAME:
				setFieldname(FIELDNAME_EDEFAULT);
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
			case WorkFlowMMPackage.OPTION__FIELDNAME:
				return FIELDNAME_EDEFAULT == null ? fieldname != null : !FIELDNAME_EDEFAULT.equals(fieldname);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fieldname: ");
		result.append(fieldname);
		result.append(')');
		return result.toString();
	}

} //OptionImpl
