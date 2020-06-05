/**
 */
package WorkFlowMM.impl;

import WorkFlowMM.DataGroup;
import WorkFlowMM.SendMsg;
import WorkFlowMM.Task;
import WorkFlowMM.WorkFlowMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.impl.SendMsgImpl#getAttachSend <em>Attach Send</em>}</li>
 *   <li>{@link WorkFlowMM.impl.SendMsgImpl#getNavigatesTo <em>Navigates To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendMsgImpl extends MessageImpl implements SendMsg {
	/**
	 * The cached value of the '{@link #getAttachSend() <em>Attach Send</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachSend()
	 * @generated
	 * @ordered
	 */
	protected DataGroup attachSend;

	/**
	 * The cached value of the '{@link #getNavigatesTo() <em>Navigates To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigatesTo()
	 * @generated
	 * @ordered
	 */
	protected Task navigatesTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMsgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkFlowMMPackage.Literals.SEND_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataGroup getAttachSend() {
		if (attachSend != null && attachSend.eIsProxy()) {
			InternalEObject oldAttachSend = (InternalEObject)attachSend;
			attachSend = (DataGroup)eResolveProxy(oldAttachSend);
			if (attachSend != oldAttachSend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkFlowMMPackage.SEND_MSG__ATTACH_SEND, oldAttachSend, attachSend));
			}
		}
		return attachSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataGroup basicGetAttachSend() {
		return attachSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachSend(DataGroup newAttachSend) {
		DataGroup oldAttachSend = attachSend;
		attachSend = newAttachSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkFlowMMPackage.SEND_MSG__ATTACH_SEND, oldAttachSend, attachSend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getNavigatesTo() {
		if (navigatesTo != null && navigatesTo.eIsProxy()) {
			InternalEObject oldNavigatesTo = (InternalEObject)navigatesTo;
			navigatesTo = (Task)eResolveProxy(oldNavigatesTo);
			if (navigatesTo != oldNavigatesTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkFlowMMPackage.SEND_MSG__NAVIGATES_TO, oldNavigatesTo, navigatesTo));
			}
		}
		return navigatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetNavigatesTo() {
		return navigatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigatesTo(Task newNavigatesTo) {
		Task oldNavigatesTo = navigatesTo;
		navigatesTo = newNavigatesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkFlowMMPackage.SEND_MSG__NAVIGATES_TO, oldNavigatesTo, navigatesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkFlowMMPackage.SEND_MSG__ATTACH_SEND:
				if (resolve) return getAttachSend();
				return basicGetAttachSend();
			case WorkFlowMMPackage.SEND_MSG__NAVIGATES_TO:
				if (resolve) return getNavigatesTo();
				return basicGetNavigatesTo();
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
			case WorkFlowMMPackage.SEND_MSG__ATTACH_SEND:
				setAttachSend((DataGroup)newValue);
				return;
			case WorkFlowMMPackage.SEND_MSG__NAVIGATES_TO:
				setNavigatesTo((Task)newValue);
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
			case WorkFlowMMPackage.SEND_MSG__ATTACH_SEND:
				setAttachSend((DataGroup)null);
				return;
			case WorkFlowMMPackage.SEND_MSG__NAVIGATES_TO:
				setNavigatesTo((Task)null);
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
			case WorkFlowMMPackage.SEND_MSG__ATTACH_SEND:
				return attachSend != null;
			case WorkFlowMMPackage.SEND_MSG__NAVIGATES_TO:
				return navigatesTo != null;
		}
		return super.eIsSet(featureID);
	}

} //SendMsgImpl
