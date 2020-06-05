/**
 */
package WorkFlowMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Msg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.ReceiveMsg#getAttachRec <em>Attach Rec</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getReceiveMsg()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' label.placement='external' svg.uri='platform:/plugin/WorkFlowDSL/src/generatedCode/images/receive.svg'"
 * @generated
 */
public interface ReceiveMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Attach Rec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attach Rec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attach Rec</em>' reference.
	 * @see #setAttachRec(DataGroup)
	 * @see WorkFlowMM.WorkFlowMMPackage#getReceiveMsg_AttachRec()
	 * @model annotation="gmf.link border.color='0,100,100' style='dot' width='2'"
	 * @generated
	 */
	DataGroup getAttachRec();

	/**
	 * Sets the value of the '{@link WorkFlowMM.ReceiveMsg#getAttachRec <em>Attach Rec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attach Rec</em>' reference.
	 * @see #getAttachRec()
	 * @generated
	 */
	void setAttachRec(DataGroup value);

} // ReceiveMsg
