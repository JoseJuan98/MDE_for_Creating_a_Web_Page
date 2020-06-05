/**
 */
package WorkFlowMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Msg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.SendMsg#getAttachSend <em>Attach Send</em>}</li>
 *   <li>{@link WorkFlowMM.SendMsg#getNavigatesTo <em>Navigates To</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getSendMsg()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SendMsgMustBeSendToADifferentActorThanItself SendMsgMustBeConnectToAReceiveMsg'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SendMsgMustBeSendToADifferentActorThanItself='\n\t\t\tself.oclContainer <> self.next.oclContainer' SendMsgMustBeConnectToAReceiveMsg='\n\t\t\tself.next->forAll(op : Operation | \n\t\t\t\top <> null implies op.oclIsTypeOf(ReceiveMsg)\n\t\t\t)'"
 *        annotation="gmf.node label='name' label.icon='false' figure='svg' label.placement='external' svg.uri='platform:/plugin/WorkFlowDSL/src/generatedCode/images/send.svg'"
 * @generated
 */
public interface SendMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Attach Send</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach Send</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach Send</em>' reference.
	 * @see #setAttachSend(DataGroup)
	 * @see WorkFlowMM.WorkFlowMMPackage#getSendMsg_AttachSend()
	 * @model annotation="gmf.link border.color='100,0,100' style='dot' width='2'"
	 * @generated
	 */
	DataGroup getAttachSend();

	/**
	 * Sets the value of the '{@link WorkFlowMM.SendMsg#getAttachSend <em>Attach Send</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach Send</em>' reference.
	 * @see #getAttachSend()
	 * @generated
	 */
	void setAttachSend(DataGroup value);

	/**
	 * Returns the value of the '<em><b>Navigates To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigates To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigates To</em>' reference.
	 * @see #setNavigatesTo(Task)
	 * @see WorkFlowMM.WorkFlowMMPackage#getSendMsg_NavigatesTo()
	 * @model annotation="gmf.link label.icon='false' width='1' color='0,0,0' target.decoration='arrow'"
	 * @generated
	 */
	Task getNavigatesTo();

	/**
	 * Sets the value of the '{@link WorkFlowMM.SendMsg#getNavigatesTo <em>Navigates To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigates To</em>' reference.
	 * @see #getNavigatesTo()
	 * @generated
	 */
	void setNavigatesTo(Task value);

} // SendMsg
