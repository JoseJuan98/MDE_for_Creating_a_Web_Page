/**
 */
package WorkFlowMM.impl;

import WorkFlowMM.Actor;
import WorkFlowMM.DataGroup;
import WorkFlowMM.Operation;
import WorkFlowMM.WorkFlowMMPackage;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.impl.ActorImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link WorkFlowMM.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link WorkFlowMM.impl.ActorImpl#getID <em>ID</em>}</li>
 *   <li>{@link WorkFlowMM.impl.ActorImpl#getData <em>Data</em>}</li>
 *   <li>{@link WorkFlowMM.impl.ActorImpl#isMale <em>Male</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends EObjectImpl implements Actor {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<DataGroup> data;

	/**
	 * The default value of the '{@link #isMale() <em>Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMale()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MALE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMale() <em>Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMale()
	 * @generated
	 * @ordered
	 */
	protected boolean male = MALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkFlowMMPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, WorkFlowMMPackage.ACTOR__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkFlowMMPackage.ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkFlowMMPackage.ACTOR__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataGroup> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<DataGroup>(DataGroup.class, this, WorkFlowMMPackage.ACTOR__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMale() {
		return male;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMale(boolean newMale) {
		boolean oldMale = male;
		male = newMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkFlowMMPackage.ACTOR__MALE, oldMale, male));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkFlowMMPackage.ACTOR__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case WorkFlowMMPackage.ACTOR__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case WorkFlowMMPackage.ACTOR__OPERATIONS:
				return getOperations();
			case WorkFlowMMPackage.ACTOR__NAME:
				return getName();
			case WorkFlowMMPackage.ACTOR__ID:
				return getID();
			case WorkFlowMMPackage.ACTOR__DATA:
				return getData();
			case WorkFlowMMPackage.ACTOR__MALE:
				return isMale();
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
			case WorkFlowMMPackage.ACTOR__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case WorkFlowMMPackage.ACTOR__NAME:
				setName((String)newValue);
				return;
			case WorkFlowMMPackage.ACTOR__ID:
				setID((String)newValue);
				return;
			case WorkFlowMMPackage.ACTOR__DATA:
				getData().clear();
				getData().addAll((Collection<? extends DataGroup>)newValue);
				return;
			case WorkFlowMMPackage.ACTOR__MALE:
				setMale((Boolean)newValue);
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
			case WorkFlowMMPackage.ACTOR__OPERATIONS:
				getOperations().clear();
				return;
			case WorkFlowMMPackage.ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkFlowMMPackage.ACTOR__ID:
				setID(ID_EDEFAULT);
				return;
			case WorkFlowMMPackage.ACTOR__DATA:
				getData().clear();
				return;
			case WorkFlowMMPackage.ACTOR__MALE:
				setMale(MALE_EDEFAULT);
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
			case WorkFlowMMPackage.ACTOR__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case WorkFlowMMPackage.ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkFlowMMPackage.ACTOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WorkFlowMMPackage.ACTOR__DATA:
				return data != null && !data.isEmpty();
			case WorkFlowMMPackage.ACTOR__MALE:
				return male != MALE_EDEFAULT;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", ID: ");
		result.append(id);
		result.append(", Male: ");
		result.append(male);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
