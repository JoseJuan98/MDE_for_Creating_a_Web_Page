/**
 */
package WorkFlowMM.impl;

import WorkFlowMM.DataGroup;
import WorkFlowMM.ReceiveMsg;
import WorkFlowMM.WorkFlowMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.impl.ReceiveMsgImpl#getAttachRec <em>Attach Rec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiveMsgImpl extends MessageImpl implements ReceiveMsg {
	/**
	 * The cached value of the '{@link #getAttachRec() <em>Attach Rec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachRec()
	 * @generated
	 * @ordered
	 */
	protected DataGroup attachRec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveMsgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkFlowMMPackage.Literals.RECEIVE_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataGroup getAttachRec() {
		if (attachRec != null && attachRec.eIsProxy()) {
			InternalEObject oldAttachRec = (InternalEObject)attachRec;
			attachRec = (DataGroup)eResolveProxy(oldAttachRec);
			if (attachRec != oldAttachRec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkFlowMMPackage.RECEIVE_MSG__ATTACH_REC, oldAttachRec, attachRec));
			}
		}
		return attachRec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataGroup basicGetAttachRec() {
		return attachRec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachRec(DataGroup newAttachRec) {
		DataGroup oldAttachRec = attachRec;
		attachRec = newAttachRec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkFlowMMPackage.RECEIVE_MSG__ATTACH_REC, oldAttachRec, attachRec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkFlowMMPackage.RECEIVE_MSG__ATTACH_REC:
				if (resolve) return getAttachRec();
				return basicGetAttachRec();
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
			case WorkFlowMMPackage.RECEIVE_MSG__ATTACH_REC:
				setAttachRec((DataGroup)newValue);
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
			case WorkFlowMMPackage.RECEIVE_MSG__ATTACH_REC:
				setAttachRec((DataGroup)null);
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
			case WorkFlowMMPackage.RECEIVE_MSG__ATTACH_REC:
				return attachRec != null;
		}
		return super.eIsSet(featureID);
	}

} //ReceiveMsgImpl
