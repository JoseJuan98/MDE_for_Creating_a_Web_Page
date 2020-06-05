/**
 */
package WorkFlowMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.ServiceTask#getGenerates <em>Generates</em>}</li>
 *   <li>{@link WorkFlowMM.ServiceTask#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getServiceTask()
 * @model
 * @generated
 */
public interface ServiceTask extends Task {
	/**
	 * Returns the value of the '<em><b>Generates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generates</em>' reference.
	 * @see #setGenerates(DataGroup)
	 * @see WorkFlowMM.WorkFlowMMPackage#getServiceTask_Generates()
	 * @model required="true"
	 *        annotation="gmf.link border.color='100,0,0' style='dash' width='1'"
	 * @generated
	 */
	DataGroup getGenerates();

	/**
	 * Sets the value of the '{@link WorkFlowMM.ServiceTask#getGenerates <em>Generates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generates</em>' reference.
	 * @see #getGenerates()
	 * @generated
	 */
	void setGenerates(DataGroup value);

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference.
	 * @see #setRequires(DataGroup)
	 * @see WorkFlowMM.WorkFlowMMPackage#getServiceTask_Requires()
	 * @model annotation="gmf.link border.color='0,0,100' style='dot' width='2'"
	 * @generated
	 */
	DataGroup getRequires();

	/**
	 * Sets the value of the '{@link WorkFlowMM.ServiceTask#getRequires <em>Requires</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' reference.
	 * @see #getRequires()
	 * @generated
	 */
	void setRequires(DataGroup value);

} // ServiceTask
